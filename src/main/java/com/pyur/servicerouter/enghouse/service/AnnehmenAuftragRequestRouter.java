package com.pyur.servicerouter.enghouse.service;

import com.pyur.servicerouter.enghouse.converter.AnnehmenAuftragRequestConverter;
import com.pyur.servicerouter.enghouse.routing.InHouseRouteProvider;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragRequestType;
import de.xconnect.bus.api.AnnehmenAuftragRequest;
import de.xconnect.bus.api.AnnehmenAuftragRequestResponse;
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
public class AnnehmenAuftragRequestRouter extends WebServiceGatewaySupport
    implements InHouseRouter<AnnehmenAuftragRequest> {

  private final AnnehmenAuftragRequestConverter annehmenAuftragRequestConverter;
  private final InHouseRouteProvider inHouseRouteProvider;

  private final Jaxb2Marshaller enghouseMarshaller;

  @PostConstruct
  public void init () {
    setMarshaller(enghouseMarshaller);
    setUnmarshaller(enghouseMarshaller);
  }
  
  @Override
  public InhouseResponse route (AnnehmenAuftragRequest request) {
    if (isNull(request) ||
        isNull(request.getAnnehmenAuftragRequest()) ||
        isNull(request.getAnnehmenAuftragRequest().getAuftrag()) ||
        isBlank(request.getAnnehmenAuftragRequest().getAuftrag().getExterneAuftragsnummer())) {
      return error("Invalid request. Externe Auftragsnummer must be provided.");
    }

    AnnehmenAuftragRequestType annehmenAuftragRequest = request.getAnnehmenAuftragRequest();
    String externeAuftragsnummer = annehmenAuftragRequest.getAuftrag().getExterneAuftragsnummer();

    String defaultUri = inHouseRouteProvider.provideDefaultUri(externeAuftragsnummer);
    String url = inHouseRouteProvider.provide(externeAuftragsnummer);

    setDefaultUri(defaultUri);

    return annehmenAuftragRequestConverter.convertResponse((JAXBElement<AnnehmenAuftragRequestResponse>)
        getWebServiceTemplate().marshalSendAndReceive(url,
            annehmenAuftragRequestConverter.convertRequest(request),
            new SoapActionCallback("annehmenAuftragRequest")));
  }
}
