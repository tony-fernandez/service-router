package com.pyur.servicerouter.admin.controller;

import com.pyur.servicerouter.admin.converter.RouteConverter;
import com.pyur.servicerouter.admin.converter.RouteDtoConverter;
import com.pyur.servicerouter.admin.converter.RouteNewDtoConverter;
import com.pyur.servicerouter.admin.dto.RouteDto;
import com.pyur.servicerouter.admin.dto.RouteNewDto;
import com.pyur.servicerouter.admin.service.RouteManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "admin/external-services/{externalServiceId}/routes", produces = MediaType.APPLICATION_JSON_VALUE)
public class RouteController {

  private final RouteConverter routeConverter;
  private final RouteDtoConverter routeDtoConverter;
  private final RouteNewDtoConverter routeNewDtoConverter;
  private final RouteManager routeManager;

  @PostMapping
  public ResponseEntity<RouteDto> createRoute(@PathVariable("externalServiceId") Long externalServiceId,
      @RequestBody RouteNewDto routeNew) {
    return ResponseEntity.status(CREATED)
        .body(routeConverter
            .convert(routeManager.createRoute(externalServiceId, routeNewDtoConverter.convert(routeNew))));
  }

  @PutMapping
  public ResponseEntity<RouteDto> updateRoute(@PathVariable("externalServiceId") Long externalServiceId,
      @RequestBody RouteDto route) {
    return ResponseEntity.ok(routeConverter
            .convert(routeManager.updateRoute(externalServiceId, routeDtoConverter.convert(route))));
  }

  @GetMapping
  public ResponseEntity<List<RouteDto>> getRoutes(@PathVariable("externalServiceId") Long externalServiceId) {
    return ResponseEntity.ok(routeConverter.convert(routeManager.getExternalServiceRoutes(externalServiceId)));
  }

}
