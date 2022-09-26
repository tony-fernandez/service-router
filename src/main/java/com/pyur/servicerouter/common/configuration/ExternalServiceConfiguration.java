package com.pyur.servicerouter.common.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "pyur.servicerouter")
public class ExternalServiceConfiguration {

  private List<ExternalServiceConfigItem> externalServices;

  @Data
  public static class ExternalServiceConfigItem {
    private String contextPath;
    private String name;
    private String endpoint;
  }

}
