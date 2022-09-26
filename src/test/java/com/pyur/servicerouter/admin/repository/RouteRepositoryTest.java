package com.pyur.servicerouter.admin.repository;

import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.admin.model.Route;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class RouteRepositoryTest extends BaseRepositoryTest {

  @Autowired
  private ExternalServiceRepository externalServiceRepository;

  @Autowired
  private RouteRepository routeRepository;

  private ExternalService service;

  @BeforeEach
  public void setup() {
    service = new ExternalService();
    service.setName("enghouse");
    service.setEndpoint("wsbb");
    externalServiceRepository.save(service);

    Route route1 = new Route();
    route1.setHost("localhost");
    route1.setName("QA1");
    route1.setPort(4040);
    route1.setScheme("http");
    route1.setExternalService(service);
    route1.setDefaultRoute(1);

    Route route2= new Route();
    route2.setHost("localhost");
    route2.setName("QA2");
    route2.setPort(5050);
    route2.setScheme("http");
    route2.setExternalService(service);
    route2.setDefaultRoute(0);

    routeRepository.saveAll(List.of(route1, route2));
  }

  @Test
  public void shouldFindAllRoutes() {
    List<Route> routes = routeRepository.findAll();

    assertThat(routes, hasSize(2));
  }

  @Test
  public void shouldFindByExternalServerId() {
    List<Route> routes = routeRepository.findByExternalServiceId(service.getId());

    assertThat(routes, hasSize(2));
  }

  @Test
  public void shouldFindDefaultRoute() {
    Route defaultRoute = routeRepository.findDefaultRoute(service.getId()).orElse(null);

    assertThat(defaultRoute.getName(), is(equalTo("QA1")));
  }

  @Test
  public void shouldFindByNameAndExternalServiceId() {
    Route defaultRoute = routeRepository.findByNameAndExternalServiceId("QA2", service.getId()).orElse(null);

    assertThat(defaultRoute.getName(), is(equalTo("QA2")));
  }

  @AfterEach
  public void destroy() {
    routeRepository.deleteAll();
    externalServiceRepository.deleteAll();
  }

}