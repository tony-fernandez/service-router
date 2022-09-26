package com.pyur.servicerouter.admin.converter;

import com.pyur.servicerouter.admin.dto.RouteNewDto;
import com.pyur.servicerouter.admin.model.Route;
import com.pyur.servicerouter.common.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RouteNewDtoConverter implements Converter<RouteNewDto, Route> {

  @Override
  public Route convert (RouteNewDto input) {
    Route output = new Route();
    output.setDefaultRoute(input.getDefaultRoute() ? 1 : 0);
    output.setDefaultUri(input.getDefaultUri());
    output.setName(input.getName());
    output.setRequestUrl(input.getRequestUrl());
    return output;
  }

}
