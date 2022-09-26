package com.pyur.servicerouter;

import com.pyur.servicerouter.admin.converter.ExternalServiceConfigItemConverter;
import com.pyur.servicerouter.admin.repository.ExternalServiceRepository;
import com.pyur.servicerouter.admin.service.ExternalServiceManager;
import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration;
import com.pyur.servicerouter.enghouse.configuration.EnghouseServiceRouterConfiguration;
import com.pyur.servicerouter.enghouse.converter.AnnehmenAuftragRequestConverter;
import com.pyur.servicerouter.enghouse.converter.AnnehmenAuftragResponseConverter;
import com.pyur.servicerouter.enghouse.converter.AnnehmenMeldungResponseConverter;
import com.pyur.servicerouter.enghouse.routing.InHouseRouteProvider;
import com.pyur.servicerouter.enghouse.service.AnnehmenAuftragRequestRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenAuftragResponseRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenMeldungRequestRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenMeldungResponseRouter;
import de.xconnect.bus.api.ObjectFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import static org.mockito.Mockito.mock;

@Configuration
@EnableAutoConfiguration
public class TestServiceRouterApplicationConfiguration {

  @Bean
  public AnnehmenAuftragRequestConverter annehmenAuftragRequestConverter() {
    return new AnnehmenAuftragRequestConverter(objectFactory());
  }

  @Bean
  public AnnehmenAuftragResponseConverter annehmenAuftragResponseConverter() {
    return new AnnehmenAuftragResponseConverter(objectFactory());
  }

  @Bean
  public AnnehmenMeldungResponseConverter annehmenMeldungResponseConverter() {
    return new AnnehmenMeldungResponseConverter(objectFactory());
  }

  @Bean
  public AnnehmenAuftragRequestRouter annehmenAuftragRequestRouter() {
    return new AnnehmenAuftragRequestRouter(annehmenAuftragRequestConverter(), inHouseRouteProvider(), enghouseMarshaller());
  }

  @Bean
  public AnnehmenAuftragResponseRouter annehmenAuftragResponseRouter() {
    return new AnnehmenAuftragResponseRouter(annehmenAuftragResponseConverter(), inHouseRouteProvider(), enghouseMarshaller());
  }

  @Bean
  public AnnehmenMeldungRequestRouter annehmenMeldungRequestRouter() {
    return new AnnehmenMeldungRequestRouter(enghouseMarshaller());
  }

  @Bean
  public AnnehmenMeldungResponseRouter annehmenMeldungResponseRouter() {
    return new AnnehmenMeldungResponseRouter(annehmenMeldungResponseConverter(), inHouseRouteProvider(), enghouseMarshaller());
  }

  @Bean
  public InHouseRouteProvider inHouseRouteProvider () {
    return new InHouseRouteProvider(externalServiceConfiguration(), externalServiceProvider(), enghouseServiceRouterConfiguration());
  }

  @Bean
  public EnghouseServiceRouterConfiguration enghouseServiceRouterConfiguration () {
    return new EnghouseServiceRouterConfiguration();
  }

  @Bean
  public ExternalServiceConfigItemConverter externalServiceConfigItemConverter() {
    return new ExternalServiceConfigItemConverter();
  }

  @Bean
  public ExternalServiceConfiguration externalServiceConfiguration() {
    return new ExternalServiceConfiguration();
  }

  @Bean
  public ExternalServiceManager externalServiceProvider() {
    return new ExternalServiceManager(externalServiceConfigItemConverter(),externalServiceConfiguration(), externalServiceRepository());
  }

  @Bean
  public ExternalServiceRepository externalServiceRepository() {
    return mock(ExternalServiceRepository.class);
  }

  @Bean
  public Jaxb2Marshaller enghouseMarshaller () {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("de.xconnect.bus.api");
    return marshaller;
  }

  @Bean
  public ObjectFactory objectFactory() {
    return new ObjectFactory();
  }

}
