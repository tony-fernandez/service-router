package com.pyur.servicerouter.enghouse.configuration;

import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration;
import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration.ExternalServiceConfigItem;
import com.pyur.servicerouter.enghouse.endpoint.InHouseEndpoint;
import com.pyur.servicerouter.enghouse.exception.InvalidServerConfiguration;
import de.xconnect.bus.api.ObjectFactory;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.annotation.PostConstruct;
import javax.xml.ws.Endpoint;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.join;

@Configuration
@RequiredArgsConstructor
public class EnghouseApplicationConfiguration {

  private final Bus bus;
  private final ExternalServiceConfiguration externalServiceConfiguration;

  private ExternalServiceConfigItem enghouseExternalServiceConfiguration;

  @PostConstruct
  public void init() {
    List<ExternalServiceConfigItem> externalServices = externalServiceConfiguration.getExternalServices();
    enghouseExternalServiceConfiguration = externalServices.stream().filter(s -> s.getName().equals("enghouse"))
        .findFirst()
        .orElseThrow(() -> new InvalidServerConfiguration("Missing configuration for enghouse service."));
  }

  @Bean
  public Endpoint wholesaleEndpoint (InHouseEndpoint inHouseEndpoint) {
    EndpointImpl endpoint = new EndpointImpl(bus, inHouseEndpoint);
    endpoint.publish(join("/", enghouseExternalServiceConfiguration.getName(), "/",
        enghouseExternalServiceConfiguration.getEndpoint()));
    return endpoint;
  }

  @Bean
  public Jaxb2Marshaller enghouseMarshaller () {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath(enghouseExternalServiceConfiguration.getContextPath());
    return marshaller;
  }

  @Bean
  public ObjectFactory objectFactory () {
    return new ObjectFactory();
  }

}
