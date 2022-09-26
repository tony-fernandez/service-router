package com.pyur.servicerouter.enghouse.service;

import com.pyur.servicerouter.enghouse.converter.AnnehmenMeldungResponseConverter;
import com.pyur.servicerouter.enghouse.routing.InHouseRouteProvider;
import de.xconnect.bus.api.AnnehmenMeldungResponse;
import de.xconnect.bus.api.AnnehmenMeldungResponseResponse;
import de.xconnect.bus.api.InhouseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.isBlank;

@Component
@RequiredArgsConstructor
public class AnnehmenMeldungResponseRouter extends WebServiceGatewaySupport
    implements InHouseRouter<AnnehmenMeldungResponse> {

  private final AnnehmenMeldungResponseConverter annehmenMeldungResponseConverter;
  private final InHouseRouteProvider inHouseRouteProvider;
  private final Jaxb2Marshaller enghouseMarshaller;

  @PostConstruct
  public void init () {
    setMarshaller(enghouseMarshaller);
    setUnmarshaller(enghouseMarshaller);
  }

  @Override
  public InhouseResponse route (AnnehmenMeldungResponse request) {
    if (isNull(request) ||
        isNull(request.getAnnehmenMeldungResponse()) ||
        isBlank(request.getAnnehmenMeldungResponse().getQuittung().getExterneAuftragsnummer())) {
      return error("Invalid request. Externe Auftragsnummer must be provided.");
    }

    String externeAuftragsnummer = request.getAnnehmenMeldungResponse().getQuittung().getExterneAuftragsnummer();

    setDefaultUri(inHouseRouteProvider.provideDefaultUri(externeAuftragsnummer));

    return annehmenMeldungResponseConverter.convertResponse((JAXBElement<AnnehmenMeldungResponseResponse>)
        getWebServiceTemplate().marshalSendAndReceive(
            inHouseRouteProvider.provide(externeAuftragsnummer),
            annehmenMeldungResponseConverter.convertRequest(request),
            new SoapActionCallback("annehmenMeldungResponse")));
  }
}
