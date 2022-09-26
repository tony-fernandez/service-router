package com.pyur.servicerouter.enghouse.converter;

import de.xconnect.bus.api.AnnehmenAuftragResponse;
import de.xconnect.bus.api.AnnehmenAuftragResponseResponse;
import de.xconnect.bus.api.InhouseResponse;
import de.xconnect.bus.api.ObjectFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

@Component
@RequiredArgsConstructor
public class AnnehmenAuftragResponseConverter implements RequestResponseConverter<AnnehmenAuftragResponse, AnnehmenAuftragResponseResponse> {

  private final ObjectFactory objectFactory;

  @Override
  public JAXBElement<AnnehmenAuftragResponse> convertRequest (AnnehmenAuftragResponse annehmenAuftragResponse) {
    return objectFactory.createAnnehmenAuftragResponse(annehmenAuftragResponse);
  }

  @Override
  public InhouseResponse convertResponse (JAXBElement<AnnehmenAuftragResponseResponse> response) {
    return response.getValue().getReturn();
  }

}
