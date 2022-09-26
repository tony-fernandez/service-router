package com.pyur.servicerouter.enghouse.converter;

import de.xconnect.bus.api.AnnehmenMeldungResponse;
import de.xconnect.bus.api.AnnehmenMeldungResponseResponse;
import de.xconnect.bus.api.InhouseResponse;
import de.xconnect.bus.api.ObjectFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

@Component
@RequiredArgsConstructor
public class AnnehmenMeldungResponseConverter
    implements RequestResponseConverter<AnnehmenMeldungResponse, AnnehmenMeldungResponseResponse> {

  private final ObjectFactory objectFactory;

  @Override
  public JAXBElement<AnnehmenMeldungResponse> convertRequest (AnnehmenMeldungResponse annehmenMeldungResponse) {
    return objectFactory.createAnnehmenMeldungResponse(annehmenMeldungResponse);
  }

  @Override
  public InhouseResponse convertResponse (JAXBElement<AnnehmenMeldungResponseResponse> response) {
    return response.getValue().getReturn();
  }

}
