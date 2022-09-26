package com.pyur.servicerouter.enghouse.routing;

import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.admin.model.Route;
import com.pyur.servicerouter.admin.service.ExternalServiceManager;
import com.pyur.servicerouter.admin.service.RouteManager;
import com.pyur.servicerouter.common.exception.InvalidRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Component
@RequiredArgsConstructor
public class InHouseRouteProvider {

  private static final String MISSING_CONFIGURATION = "The configuration for external service Enghouse is missing.";

  private final ExternalServiceManager externalServiceManager;
  private final RouteManager routeManager;

  private ExternalService enghouseExternalService;

  @PostConstruct
  public void init () {
    enghouseExternalService = externalServiceManager.getExternalService("enghouse");
  }

  /**
   * Provides the endpoint according to the given external order id.
   *
   * @param externeAuftragsnummer
   *     the external order id.
   * @return the endpoint.
   */
  public String provide (String externeAuftragsnummer) {
    return urlFromRoute(getRoute(externeAuftragsnummer));
  }

  /**
   * Provides the default URI for the given external order id.
   *
   * @param externeAuftragsnummer
   *     the external order id.
   * @return the endpoint.
   */
  public String provideDefaultUri (String externeAuftragsnummer) {
    return defaultUri(getRoute(externeAuftragsnummer));
  }

  /**
   * Provides the default endpoint according to the configured default server.
   *
   * @return the default url.
   */
  public String provideDefault () {
    return urlFromRoute(routeManager.getDefaultRoute(enghouseExternalService.getId()));
  }

  private String defaultUri (Route route) {
    return route.getDefaultUri();
  }

  private String urlFromRoute (Route route) {
    return route.getRequestUrl();
  }

  private Route getRoute (String externeAuftragsnummer) {
    if (isBlank(externeAuftragsnummer)) {
      throw new InvalidRequestException("A valid external order id must be provided.");
    }

    String routeName = externeAuftragsnummer.substring(0, externeAuftragsnummer.indexOf("_"));
    return routeManager.getRoute(routeName, enghouseExternalService.getId());
  }

}
