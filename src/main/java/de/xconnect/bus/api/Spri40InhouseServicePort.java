package de.xconnect.bus.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2022-09-20T08:12:49.916+02:00
 * Generated source version: 3.4.0
 *
 */
@WebService(targetNamespace = "api.bus.xconnect.de", name = "Spri_4_0_InhouseServicePort")
@XmlSeeAlso({de.telekom.spri.oss.v4.order.ObjectFactory.class, de.telekom.spri.oss.v4.envelope.ObjectFactory.class, de.telekom.spri.oss.v4.complex.ObjectFactory.class, de.telekom.spri.oss.v4.simple.ObjectFactory.class, ObjectFactory.class, de.telekom.spri.oss.v4.enm.ObjectFactory.class, de.telekom.spri.oss.v4.fttx.ObjectFactory.class, de.telekom.spri.oss.v4.message.ObjectFactory.class})
public interface Spri40InhouseServicePort {

    @WebMethod(action = "annehmenMeldungResponse")
    @RequestWrapper(localName = "annehmenMeldungResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenMeldungResponse")
    @ResponseWrapper(localName = "annehmenMeldungResponseResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenMeldungResponseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public de.xconnect.bus.api.InhouseResponse annehmenMeldungResponse(

        @WebParam(name = "annehmenMeldungResponse", targetNamespace = "")
        de.telekom.spri.oss.v4.envelope.AnnehmenMeldungResponseType annehmenMeldungResponse,
        @WebParam(name = "inhouseMeta", targetNamespace = "")
        de.xconnect.bus.api.InhouseMeta inhouseMeta
    ) throws Exception_Exception;

    @WebMethod(action = "annehmenMeldungRequest")
    @RequestWrapper(localName = "annehmenMeldungRequest", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenMeldungRequest")
    @ResponseWrapper(localName = "annehmenMeldungRequestResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenMeldungRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public de.xconnect.bus.api.InhouseResponse annehmenMeldungRequest(

        @WebParam(name = "annehmenMeldungRequest", targetNamespace = "")
        de.telekom.spri.oss.v4.envelope.AnnehmenMeldungRequestType annehmenMeldungRequest,
        @WebParam(name = "inhouseMeta", targetNamespace = "")
        de.xconnect.bus.api.InhouseMeta inhouseMeta
    ) throws Exception_Exception;

    @WebMethod(action = "annehmenAuftragRequest")
    @RequestWrapper(localName = "annehmenAuftragRequest", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenAuftragRequest")
    @ResponseWrapper(localName = "annehmenAuftragRequestResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenAuftragRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public de.xconnect.bus.api.InhouseResponse annehmenAuftragRequest(

        @WebParam(name = "annehmenAuftragRequest", targetNamespace = "")
        de.telekom.spri.oss.v4.envelope.AnnehmenAuftragRequestType annehmenAuftragRequest,
        @WebParam(name = "inhouseMeta", targetNamespace = "")
        de.xconnect.bus.api.InhouseMeta inhouseMeta
    ) throws Exception_Exception;

    @WebMethod(action = "annehmenAuftragResponse")
    @RequestWrapper(localName = "annehmenAuftragResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenAuftragResponse")
    @ResponseWrapper(localName = "annehmenAuftragResponseResponse", targetNamespace = "api.bus.xconnect.de", className = "de.xconnect.bus.api.AnnehmenAuftragResponseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public de.xconnect.bus.api.InhouseResponse annehmenAuftragResponse(

        @WebParam(name = "annehmenAuftragResponse", targetNamespace = "")
        de.telekom.spri.oss.v4.envelope.AnnehmenAuftragResponseType annehmenAuftragResponse,
        @WebParam(name = "inhouseMeta", targetNamespace = "")
        de.xconnect.bus.api.InhouseMeta inhouseMeta
    ) throws Exception_Exception;
}