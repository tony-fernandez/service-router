package com.pyur.servicerouter.admin.repository;

import com.pyur.servicerouter.admin.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

  /**
   * Finds the route by the name and the external service id.
   *
   * @param name
   *     the name.
   * @param externalServiceId
   *     the external service id.
   * @return the route.
   */
  Optional<Route> findByNameAndExternalServiceId (@Param("name") String name,
      @Param("externalServiceId") Long externalServiceId);

  /**
   * Finds the default route for the given external service.
   *
   * @param externalServiceId
   *     the external service id.
   * @return the default route.
   */
  @Query("select r from Route r where r.externalService.id = :externalServiceId and r.defaultRoute = 1")
  Optional<Route> findDefaultRoute (@Param("externalServiceId") Long externalServiceId);

  /**
   * Finds the routes by the external service id.
   *
   * @param externalServiceId
   *     the external service id.
   * @return the routes.
   */
  List<Route> findByExternalServiceId (@Param("externalServiceId") Long externalServiceId);

}
