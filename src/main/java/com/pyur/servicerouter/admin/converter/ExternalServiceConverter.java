package com.pyur.servicerouter.admin.converter;

import com.pyur.servicerouter.admin.dto.ExternalServiceDto;
import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.common.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceConverter implements Converter<ExternalService, ExternalServiceDto> {

  @Override
  public ExternalServiceDto convert (ExternalService input) {
    ExternalServiceDto output = new ExternalServiceDto();
    output.setContextPath(input.getContextPath());
    output.setEndpoint(input.getEndpoint());
    output.setId(input.getId());
    output.setName(input.getName());
    return output;
  }
}
