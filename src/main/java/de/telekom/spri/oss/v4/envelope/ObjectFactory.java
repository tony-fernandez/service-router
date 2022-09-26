
package de.telekom.spri.oss.v4.envelope;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.telekom.spri.oss.v4.envelope package. 
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

    private final static QName _AnnehmenAuftragRequest_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenAuftragRequest");
    private final static QName _AnnehmenAuftragRequestType_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenAuftragRequestType");
    private final static QName _AnnehmenAuftragResponse_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenAuftragResponse");
    private final static QName _AnnehmenAuftragResponseType_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenAuftragResponseType");
    private final static QName _AnnehmenMeldungRequest_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenMeldungRequest");
    private final static QName _AnnehmenMeldungRequestType_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenMeldungRequestType");
    private final static QName _AnnehmenMeldungResponse_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenMeldungResponse");
    private final static QName _AnnehmenMeldungResponseType_QNAME = new QName("http://spri.telekom.de/oss/v4/envelope", "annehmenMeldungResponseType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.telekom.spri.oss.v4.envelope
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnehmenAuftragRequestType }
     * 
     */
    public AnnehmenAuftragRequestType createAnnehmenAuftragRequestType() {
        return new AnnehmenAuftragRequestType();
    }

    /**
     * Create an instance of {@link AnnehmenAuftragResponseType }
     * 
     */
    public AnnehmenAuftragResponseType createAnnehmenAuftragResponseType() {
        return new AnnehmenAuftragResponseType();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungRequestType }
     * 
     */
    public AnnehmenMeldungRequestType createAnnehmenMeldungRequestType() {
        return new AnnehmenMeldungRequestType();
    }

    /**
     * Create an instance of {@link AnnehmenMeldungResponseType }
     * 
     */
    public AnnehmenMeldungResponseType createAnnehmenMeldungResponseType() {
        return new AnnehmenMeldungResponseType();
    }

    /**
     * Create an instance of {@link WholesaleResponseType }
     * 
     */
    public WholesaleResponseType createWholesaleResponseType() {
        return new WholesaleResponseType();
    }

    /**
     * Create an instance of {@link SignaturIdType }
     * 
     */
    public SignaturIdType createSignaturIdType() {
        return new SignaturIdType();
    }

    /**
     * Create an instance of {@link WholesaleRequestType }
     * 
     */
    public WholesaleRequestType createWholesaleRequestType() {
        return new WholesaleRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenAuftragRequest")
    public JAXBElement<AnnehmenAuftragRequestType> createAnnehmenAuftragRequest(AnnehmenAuftragRequestType value) {
        return new JAXBElement<AnnehmenAuftragRequestType>(_AnnehmenAuftragRequest_QNAME, AnnehmenAuftragRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenAuftragRequestType")
    public JAXBElement<AnnehmenAuftragRequestType> createAnnehmenAuftragRequestType(AnnehmenAuftragRequestType value) {
        return new JAXBElement<AnnehmenAuftragRequestType>(_AnnehmenAuftragRequestType_QNAME, AnnehmenAuftragRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenAuftragResponse")
    public JAXBElement<AnnehmenAuftragResponseType> createAnnehmenAuftragResponse(AnnehmenAuftragResponseType value) {
        return new JAXBElement<AnnehmenAuftragResponseType>(_AnnehmenAuftragResponse_QNAME, AnnehmenAuftragResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenAuftragResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenAuftragResponseType")
    public JAXBElement<AnnehmenAuftragResponseType> createAnnehmenAuftragResponseType(AnnehmenAuftragResponseType value) {
        return new JAXBElement<AnnehmenAuftragResponseType>(_AnnehmenAuftragResponseType_QNAME, AnnehmenAuftragResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenMeldungRequest")
    public JAXBElement<AnnehmenMeldungRequestType> createAnnehmenMeldungRequest(AnnehmenMeldungRequestType value) {
        return new JAXBElement<AnnehmenMeldungRequestType>(_AnnehmenMeldungRequest_QNAME, AnnehmenMeldungRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenMeldungRequestType")
    public JAXBElement<AnnehmenMeldungRequestType> createAnnehmenMeldungRequestType(AnnehmenMeldungRequestType value) {
        return new JAXBElement<AnnehmenMeldungRequestType>(_AnnehmenMeldungRequestType_QNAME, AnnehmenMeldungRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenMeldungResponse")
    public JAXBElement<AnnehmenMeldungResponseType> createAnnehmenMeldungResponse(AnnehmenMeldungResponseType value) {
        return new JAXBElement<AnnehmenMeldungResponseType>(_AnnehmenMeldungResponse_QNAME, AnnehmenMeldungResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnehmenMeldungResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/envelope", name = "annehmenMeldungResponseType")
    public JAXBElement<AnnehmenMeldungResponseType> createAnnehmenMeldungResponseType(AnnehmenMeldungResponseType value) {
        return new JAXBElement<AnnehmenMeldungResponseType>(_AnnehmenMeldungResponseType_QNAME, AnnehmenMeldungResponseType.class, null, value);
    }

}
