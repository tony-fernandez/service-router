
package de.telekom.spri.oss.v4.fttx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.telekom.spri.oss.v4.fttx package. 
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

    private final static QName _KUEAG_QNAME = new QName("http://spri.telekom.de/oss/v4/fttx", "KUE-AG");
    private final static QName _NEU_QNAME = new QName("http://spri.telekom.de/oss/v4/fttx", "NEU");
    private final static QName _PV_QNAME = new QName("http://spri.telekom.de/oss/v4/fttx", "PV");
    private final static QName _ProduktAuftrag_QNAME = new QName("http://spri.telekom.de/oss/v4/fttx", "produktAuftrag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.telekom.spri.oss.v4.fttx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType }
     * 
     */
    public FTTXBereitstellungType createFTTXBereitstellungType() {
        return new FTTXBereitstellungType();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung createFTTXBereitstellungTypeRufnummernPortierung() {
        return new FTTXBereitstellungType.RufnummernPortierung();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss createFTTXBereitstellungTypeRufnummernPortierungEinzelanschluss() {
        return new FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste createFTTXBereitstellungTypeRufnummernPortierungEinzelanschlussRufnummernliste() {
        return new FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss createFTTXBereitstellungTypeRufnummernPortierungAnlagenanschluss() {
        return new FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss();
    }

    /**
     * Create an instance of {@link FTTXKuendigungType }
     * 
     */
    public FTTXKuendigungType createFTTXKuendigungType() {
        return new FTTXKuendigungType();
    }

    /**
     * Create an instance of {@link FTTXProviderwechselType }
     * 
     */
    public FTTXProviderwechselType createFTTXProviderwechselType() {
        return new FTTXProviderwechselType();
    }

    /**
     * Create an instance of {@link ProduktFTTXType }
     * 
     */
    public ProduktFTTXType createProduktFTTXType() {
        return new ProduktFTTXType();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.Bestandssuche }
     * 
     */
    public FTTXBereitstellungType.Bestandssuche createFTTXBereitstellungTypeBestandssuche() {
        return new FTTXBereitstellungType.Bestandssuche();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr createFTTXBereitstellungTypeRufnummernPortierungEinzelanschlussRufnummernlisteZuPortierendeOnkzRnr() {
        return new FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle createFTTXBereitstellungTypeRufnummernPortierungAnlagenanschlussOnkzDurchwahlAbfragestelle() {
        return new FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle();
    }

    /**
     * Create an instance of {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock }
     * 
     */
    public FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock createFTTXBereitstellungTypeRufnummernPortierungAnlagenanschlussZuPortierenderRufnummernblock() {
        return new FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTTXKuendigungType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTTXKuendigungType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/fttx", name = "KUE-AG")
    public JAXBElement<FTTXKuendigungType> createKUEAG(FTTXKuendigungType value) {
        return new JAXBElement<FTTXKuendigungType>(_KUEAG_QNAME, FTTXKuendigungType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTTXBereitstellungType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTTXBereitstellungType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/fttx", name = "NEU")
    public JAXBElement<FTTXBereitstellungType> createNEU(FTTXBereitstellungType value) {
        return new JAXBElement<FTTXBereitstellungType>(_NEU_QNAME, FTTXBereitstellungType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTTXProviderwechselType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTTXProviderwechselType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/fttx", name = "PV")
    public JAXBElement<FTTXProviderwechselType> createPV(FTTXProviderwechselType value) {
        return new JAXBElement<FTTXProviderwechselType>(_PV_QNAME, FTTXProviderwechselType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktFTTXType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduktFTTXType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/fttx", name = "produktAuftrag")
    public JAXBElement<ProduktFTTXType> createProduktAuftrag(ProduktFTTXType value) {
        return new JAXBElement<ProduktFTTXType>(_ProduktAuftrag_QNAME, ProduktFTTXType.class, null, value);
    }

}
