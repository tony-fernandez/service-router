package com.pyur.servicerouter.admin.service;

import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.admin.model.Route;
import com.pyur.servicerouter.admin.repository.ExternalServiceRepository;
import com.pyur.servicerouter.admin.repository.RouteRepository;
import com.pyur.servicerouter.common.exception.InvalidRequestException;
import com.pyur.servicerouter.common.exception.InvalidRouteConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;
import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class RouteManager {

  private final ExternalServiceRepository externalServiceRepository;
  private final RouteRepository routeRepository;

  /**
   * Gets the default route for the given external service id.
   *
   * @param externalServiceId
   *     the external service id.
   * @return the default route.
   */
  public Route getDefaultRoute (Long externalServiceId) {
    return routeRepository.findDefaultRoute(externalServiceId)
        .orElseThrow(() -> new InvalidRouteConfiguration(
            format("No default route found for service with id:%d.", externalServiceId)));
  }

  /**
   * Gets the route with the given name and external service id.
   *
   * @param name
   *     the name.
   * @param externalServiceId
   *     the external service id.
   * @return the route.
   */
  public Route getRoute (String name, Long externalServiceId) {
    return routeRepository.findByNameAndExternalServiceId(name, externalServiceId)
        .orElseThrow(() -> new InvalidRouteConfiguration(
            format("No route found for service with id:%d and name %s", externalServiceId, name)));
  }

  /**
   * Persists the given route for the given service.
   *
   * @param externalServiceId
   *     the external service id.
   * @param route
   *     the new route.
   * @return the created route.
   */
  public Route createRoute (Long externalServiceId, Route route) {
    return createOrUpdateRoute(externalServiceId, route);
  }

  /**
   * Updates the given route for the given service.
   *
   * @param externalServiceId
   *     the external service id.
   * @param route
   *     the updated route.
   * @return the updated route.
   */
  public Route updateRoute (Long externalServiceId, Route route) {
    if (isNull(route.getId())) {
      throw new InvalidRequestException("A valid route id must be provided when updating an existing route.");
    }

    return createOrUpdateRoute(externalServiceId, route);
  }

  /**
   * Get all the routes for the given external service id.
   *
   * @param externalServiceId
   *     the external service id.
   * @return the routes.
   */
  public List<Route> getExternalServiceRoutes (Long externalServiceId) {
    return routeRepository.findByExternalServiceId(externalServiceId);
  }

  private Route createOrUpdateRoute (Long externalServiceId, Route route) {
    ExternalService externalService = externalServiceRepository.findById(externalServiceId).orElseThrow(
        () -> new InvalidRequestException(format("External service with id: %d not found.", externalServiceId)));
    route.setExternalService(externalService);
    return routeRepository.save(route);
  }

}
