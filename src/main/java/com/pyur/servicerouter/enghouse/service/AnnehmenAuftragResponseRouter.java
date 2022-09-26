package com.pyur.servicerouter.enghouse.service;

import com.pyur.servicerouter.enghouse.converter.AnnehmenAuftragResponseConverter;
import com.pyur.servicerouter.enghouse.routing.InHouseRouteProvider;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragResponseType;
import de.xconnect.bus.api.AnnehmenAuftragResponse;
import de.xconnect.bus.api.AnnehmenAuftragResponseResponse;
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
public class AnnehmenAuftragResponseRouter extends WebServiceGatewaySupport
    implements InHouseRouter<AnnehmenAuftragResponse> {

  private final AnnehmenAuftragResponseConverter annehmenAuftragResponseConverter;
  private final InHouseRouteProvider enghouseRouteProvider;
  private final Jaxb2Marshaller enghouseMarshaller;

  @PostConstruct
  public void init () {
    setMarshaller(enghouseMarshaller);
    setUnmarshaller(enghouseMarshaller);
  }
  
  @Override
  public InhouseResponse route (AnnehmenAuftragResponse request) {
    if (isNull(request) ||
        isNull(request.getAnnehmenAuftragResponse()) ||
        isNull(request.getAnnehmenAuftragResponse().getQuittung()) ||
        isBlank(request.getAnnehmenAuftragResponse().getQuittung().getExterneAuftragsnummer())) {
      return error("Invalid request. Externe Auftragsnummer must be provided.");
    }

    AnnehmenAuftragResponseType annehmenAuftragResponse = request.getAnnehmenAuftragResponse();
    String externeAuftragsnummer = annehmenAuftragResponse.getQuittung().getExterneAuftragsnummer();

    setDefaultUri(enghouseRouteProvider.provideDefaultUri(externeAuftragsnummer));

    return annehmenAuftragResponseConverter.convertResponse((JAXBElement<AnnehmenAuftragResponseResponse>)
        getWebServiceTemplate().marshalSendAndReceive(
            enghouseRouteProvider.provide(externeAuftragsnummer),
            annehmenAuftragResponseConverter.convertRequest(request),
            new SoapActionCallback("annehmenAuftragResponse")));
  }

}
