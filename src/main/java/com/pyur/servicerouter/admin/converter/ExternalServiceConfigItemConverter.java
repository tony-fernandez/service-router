package com.pyur.servicerouter.admin.converter;

import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration.ExternalServiceConfigItem;
import com.pyur.servicerouter.common.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceConfigItemConverter implements Converter<ExternalServiceConfigItem, ExternalService> {

  @Override
  public ExternalService convert (ExternalServiceConfigItem input) {
    ExternalService output = new ExternalService();
    output.setContextPath(input.getContextPath());
    output.setEndpoint(input.getEndpoint());
    output.setName(input.getName());
    return output;
  }

}
