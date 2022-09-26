package com.pyur.servicerouter.enghouse.converter;

import de.xconnect.bus.api.AnnehmenAuftragRequest;
import de.xconnect.bus.api.AnnehmenAuftragRequestResponse;
import de.xconnect.bus.api.InhouseResponse;
import de.xconnect.bus.api.ObjectFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

@Component
@RequiredArgsConstructor
public class AnnehmenAuftragRequestConverter implements RequestResponseConverter<AnnehmenAuftragRequest, AnnehmenAuftragRequestResponse> {

  private final ObjectFactory objectFactory;

  @Override
  public JAXBElement<AnnehmenAuftragRequest> convertRequest (AnnehmenAuftragRequest annehmenAuftragRequest) {
    return objectFactory.createAnnehmenAuftragRequest(annehmenAuftragRequest);
  }

  @Override
  public InhouseResponse convertResponse (JAXBElement<AnnehmenAuftragRequestResponse> response) {
    return response.getValue().getReturn();
  }

}
