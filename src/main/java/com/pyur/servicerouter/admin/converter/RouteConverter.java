package com.pyur.servicerouter.admin.converter;

import com.pyur.servicerouter.admin.dto.RouteDto;
import com.pyur.servicerouter.admin.model.Route;
import com.pyur.servicerouter.common.converter.Converter;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Component
public class RouteConverter implements Converter<Route, RouteDto> {

  @Override
  public RouteDto convert (Route input) {
    RouteDto output = new RouteDto();
    output.setDefaultRoute(input.getDefaultRoute().equals(1) ? TRUE: FALSE);
    output.setDefaultUri(input.getDefaultUri());
    output.setId(input.getId());
    output.setName(input.getName());
    output.setRequestUrl(input.getRequestUrl());
    return output;
  }

}
