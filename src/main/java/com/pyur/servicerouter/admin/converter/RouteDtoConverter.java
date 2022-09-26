package com.pyur.servicerouter.admin.converter;

import com.pyur.servicerouter.admin.dto.RouteDto;
import com.pyur.servicerouter.admin.model.Route;
import com.pyur.servicerouter.common.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RouteDtoConverter implements Converter<RouteDto, Route> {

  @Override
  public Route convert (RouteDto input) {
    Route output = new Route();
    output.setDefaultRoute(input.getDefaultRoute() ? 1 : 0);
    output.setDefaultUri(input.getDefaultUri());
    output.setId(input.getId());
    output.setName(input.getName());
    output.setRequestUrl(input.getRequestUrl());
    return output;
  }

}
