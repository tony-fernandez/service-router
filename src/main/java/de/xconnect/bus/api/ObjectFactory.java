
package de.xconnect.bus.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.xconnect.bus.api package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InhouseMeta_QNAME = new QName("api.bus.xconnect.de", "InhouseMeta");
    private final static QName _InhouseResponse_QNAME = new QName("api.bus.xconnect.de", "InhouseResponse");
    private final static QName _AnnehmenAuftragRequest_QNAME = new QName("api.bus.xconnect.de", "annehmenAuftragRequest");
    private final static QName _AnnehmenAuftragRequestResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenAuftragRequestResponse");
    private final static QName _AnnehmenAuftragResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenAuftragResponse");
    private final static QName _AnnehmenAuftragResponseResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenAuftragResponseResponse");
    private final static QName _AnnehmenMeldungRequest_QNAME = new QName("api.bus.xconnect.de", "annehmenMeldungRequest");
    private final static QName _AnnehmenMeldungRequestResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenMeldungRequestResponse");
    private final static QName _AnnehmenMeldungResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenMeldungResponse");
    private final static QName _AnnehmenMeldungResponseResponse_QNAME = new QName("api.bus.xconnect.de", "annehmenMeldungResponseResponse");
    private final static QName _Exception_QNAME = new QName("api.bus.xconnect.de", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.xconnect.bus.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InhouseMeta }
     * 
     */
    public InhouseMeta createInhouseMeta() {
        return new InhouseMeta();
    }

    /**
     * Create an instance of {@link InhouseMeta.OptionalValues }
     * 
     */
    public InhouseMeta.OptionalValues createInhouseMetaOptionalValues() {
        return new InhouseMeta.OptionalValues();
    }

    /**
     * Create an instance of {@link InhouseResponse }
     * 
     */
    public InhouseResponse createInhouseResponse() {
        return new InhouseResponse();
    }

    /**
     * Create an instance of {@link AnnehmenAuftragRequest }
     * 
     */
    public AnnehmenAuftragRequest createAnnehmenAuftragRequest() {
        return new AnnehmenAuftragRequest();
    }

    /**
     * Create an instance of {@link AnnehmenAuftragRequestResponse }
     * 
     */
    public AnnehmenAuftragRequestResponse createAnnehmenAuftragRequestResponse() {
        return new AnnehmenAuftragRequestResponse();
    }

    /**
     * Create an instance of {@link AnnehmenAuftragResponse }
     * 
     */
    public AnnehmenAuftragResponse createAnnehmenAuftragResponse() {
        return new AnnehmenAuftragResponse();
    }

    /**
     * Create an instance of {@link AnnehmenAuftragResponseResponse }
     * 
     */
    public AnnehmenAuftragResponseResponse createAnnehmenAuftragResponseResponse() {
        return new AnnehmenAuftragResponseResponse();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungRequest }
     * 
     */
    public AnnehmenMeldungRequest createAnnehmenMeldungRequest() {
        return new AnnehmenMeldungRequest();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungRequestResponse }
     * 
     */
    public AnnehmenMeldungRequestResponse createAnnehmenMeldungRequestResponse() {
        return new AnnehmenMeldungRequestResponse();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungResponse }
     * 
     */
    public AnnehmenMeldungResponse createAnnehmenMeldungResponse() {
        return new AnnehmenMeldungResponse();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungResponseResponse }
     * 
     */
    public AnnehmenMeldungResponseResponse createAnnehmenMeldungResponseResponse() {
        return new AnnehmenMeldungResponseResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CustomAnlageTyp }
     * 
     */
    public CustomAnlageTyp createCustomAnlageTyp() {
        return new CustomAnlageTyp();
    }

    /**
     * Create an instance of {@link InhouseMeta.OptionalValues.Entry }
     * 
     */
    public InhouseMeta.OptionalValues.Entry createInhouseMetaOptionalValuesEntry() {
        return new InhouseMeta.OptionalValues.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhouseMeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InhouseMeta }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "InhouseMeta")
    public JAXBElement<InhouseMeta> createInhouseMeta(InhouseMeta value) {
        return new JAXBElement<InhouseMeta>(_InhouseMeta_QNAME, InhouseMeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhouseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InhouseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "InhouseResponse")
    public JAXBElement<InhouseResponse> createInhouseResponse(InhouseResponse value) {
        return new JAXBElement<InhouseResponse>(_InhouseResponse_QNAME, InhouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequest }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenAuftragRequest")
    public JAXBElement<AnnehmenAuftragRequest> createAnnehmenAuftragRequest(AnnehmenAuftragRequest value) {
        return new JAXBElement<AnnehmenAuftragRequest>(_AnnehmenAuftragRequest_QNAME, AnnehmenAuftragRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenAuftragRequestResponse")
    public JAXBElement<AnnehmenAuftragRequestResponse> createAnnehmenAuftragRequestResponse(AnnehmenAuftragRequestResponse value) {
        return new JAXBElement<AnnehmenAuftragRequestResponse>(_AnnehmenAuftragRequestResponse_QNAME, AnnehmenAuftragRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenAuftragResponse")
    public JAXBElement<AnnehmenAuftragResponse> createAnnehmenAuftragResponse(AnnehmenAuftragResponse value) {
        return new JAXBElement<AnnehmenAuftragResponse>(_AnnehmenAuftragResponse_QNAME, AnnehmenAuftragResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenAuftragResponseResponse")
    public JAXBElement<AnnehmenAuftragResponseResponse> createAnnehmenAuftragResponseResponse(AnnehmenAuftragResponseResponse value) {
        return new JAXBElement<AnnehmenAuftragResponseResponse>(_AnnehmenAuftragResponseResponse_QNAME, AnnehmenAuftragResponseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequest }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenMeldungRequest")
    public JAXBElement<AnnehmenMeldungRequest> createAnnehmenMeldungRequest(AnnehmenMeldungRequest value) {
        return new JAXBElement<AnnehmenMeldungRequest>(_AnnehmenMeldungRequest_QNAME, AnnehmenMeldungRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenMeldungRequestResponse")
    public JAXBElement<AnnehmenMeldungRequestResponse> createAnnehmenMeldungRequestResponse(AnnehmenMeldungRequestResponse value) {
        return new JAXBElement<AnnehmenMeldungRequestResponse>(_AnnehmenMeldungRequestResponse_QNAME, AnnehmenMeldungRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenMeldungResponse")
    public JAXBElement<AnnehmenMeldungResponse> createAnnehmenMeldungResponse(AnnehmenMeldungResponse value) {
        return new JAXBElement<AnnehmenMeldungResponse>(_AnnehmenMeldungResponse_QNAME, AnnehmenMeldungResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "annehmenMeldungResponseResponse")
    public JAXBElement<AnnehmenMeldungResponseResponse> createAnnehmenMeldungResponseResponse(AnnehmenMeldungResponseResponse value) {
        return new JAXBElement<AnnehmenMeldungResponseResponse>(_AnnehmenMeldungResponseResponse_QNAME, AnnehmenMeldungResponseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "api.bus.xconnect.de", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
