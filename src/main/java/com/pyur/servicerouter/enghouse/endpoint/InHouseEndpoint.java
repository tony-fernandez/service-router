package com.pyur.servicerouter.enghouse.endpoint;

import com.pyur.servicerouter.enghouse.service.AnnehmenAuftragRequestRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenAuftragResponseRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenMeldungRequestRouter;
import com.pyur.servicerouter.enghouse.service.AnnehmenMeldungResponseRouter;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragRequestType;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragResponseType;
import de.telekom.spri.oss.v4.envelope.AnnehmenMeldungRequestType;
import de.telekom.spri.oss.v4.envelope.AnnehmenMeldungResponseType;
import de.xconnect.bus.api.*;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class InHouseEndpoint implements Spri40InhouseServicePort {

  private final AnnehmenAuftragRequestRouter annehmenAuftragRequestRouter;
  private final AnnehmenAuftragResponseRouter annehmenAuftragResponseRouter;
  private final AnnehmenMeldungRequestRouter annehmenMeldungRequestRouter;
  private final AnnehmenMeldungResponseRouter annehmenMeldungResponseRouter;

  @Override
  public InhouseResponse annehmenMeldungResponse (AnnehmenMeldungResponseType annehmenMeldungResponse,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    AnnehmenMeldungResponse request = new AnnehmenMeldungResponse();
    request.setAnnehmenMeldungResponse(annehmenMeldungResponse);
    request.setInhouseMeta(inhouseMeta);
    return annehmenMeldungResponseRouter.route(request);
  }

  @Override
  public InhouseResponse annehmenMeldungRequest (AnnehmenMeldungRequestType annehmenMeldungRequest,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    // TODO: Implement when external id is available in given request.
    return annehmenMeldungRequestRouter.route(new AnnehmenMeldungRequest());
  }

  @Override
  public InhouseResponse annehmenAuftragRequest (AnnehmenAuftragRequestType annehmenAuftragRequest,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    AnnehmenAuftragRequest request = new AnnehmenAuftragRequest();
    request.setAnnehmenAuftragRequest(annehmenAuftragRequest);
    request.setInhouseMeta(inhouseMeta);
    return annehmenAuftragRequestRouter.route(request);
  }

  @Override
  public InhouseResponse annehmenAuftragResponse (AnnehmenAuftragResponseType annehmenAuftragResponse,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    AnnehmenAuftragResponse request = new AnnehmenAuftragResponse();
    request.setAnnehmenAuftragResponse(annehmenAuftragResponse);
    request.setInhouseMeta(inhouseMeta);
    return annehmenAuftragResponseRouter.route(request);
  }

}
