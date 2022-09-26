package com.pyur.servicerouter.enghouse.service;

import de.xconnect.bus.api.AnnehmenMeldungRequest;
import de.xconnect.bus.api.InhouseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class AnnehmenMeldungRequestRouter extends WebServiceGatewaySupport
    implements InHouseRouter<AnnehmenMeldungRequest> {

  private final Jaxb2Marshaller enghouseMarshaller;

  @PostConstruct
  public void init () {
    setMarshaller(enghouseMarshaller);
    setUnmarshaller(enghouseMarshaller);
  }

  @Override
  public InhouseResponse route (AnnehmenMeldungRequest request) {
    // TODO: Implement when external id is available.
    return error("Unimplemented");
  }

}
