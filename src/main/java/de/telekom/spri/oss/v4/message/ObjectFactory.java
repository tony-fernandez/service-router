
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.telekom.spri.oss.v4.message package. 
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

    private final static QName _ABBM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ABBM");
    private final static QName _ABBMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ABBM-PV");
    private final static QName _ABM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ABM");
    private final static QName _ABMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ABM-PV");
    private final static QName _ABMpos_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ABMpos");
    private final static QName _AKMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "AKM-PV");
    private final static QName _ENTM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ENTM");
    private final static QName _ENTMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ENTM-PV");
    private final static QName _ERLM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ERLM");
    private final static QName _ERLMK_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ERLM-K");
    private final static QName _ERLMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ERLM-PV");
    private final static QName _KDLE_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "KDLE");
    private final static QName _MTAM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "MTAM");
    private final static QName _QEB_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "QEB");
    private final static QName _QEBpos_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "QEBpos");
    private final static QName _RUEMPV_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "RUEM-PV");
    private final static QName _TAM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "TAM");
    private final static QName _TBKAG_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "TBK-AG");
    private final static QName _TBKLE_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "TBK-LE");
    private final static QName _VZM_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "VZM");
    private final static QName _ZWMAG_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ZWM-AG");
    private final static QName _ZWMLE_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "ZWM-LE");
    private final static QName _Meldung_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "meldung");
    private final static QName _MeldungType_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "meldungType");
    private final static QName _Meldungsposition_QNAME = new QName("http://spri.telekom.de/oss/v4/message", "meldungsposition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.telekom.spri.oss.v4.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeldungstypZWMLEType }
     * 
     */
    public MeldungstypZWMLEType createMeldungstypZWMLEType() {
        return new MeldungstypZWMLEType();
    }

    /**
     * Create an instance of {@link MeldungstypZWMAGType }
     * 
     */
    public MeldungstypZWMAGType createMeldungstypZWMAGType() {
        return new MeldungstypZWMAGType();
    }

    /**
     * Create an instance of {@link MeldungstypVZMType }
     * 
     */
    public MeldungstypVZMType createMeldungstypVZMType() {
        return new MeldungstypVZMType();
    }

    /**
     * Create an instance of {@link MeldungstypTAMType }
     * 
     */
    public MeldungstypTAMType createMeldungstypTAMType() {
        return new MeldungstypTAMType();
    }

    /**
     * Create an instance of {@link MeldungstypRUEMPVType }
     * 
     */
    public MeldungstypRUEMPVType createMeldungstypRUEMPVType() {
        return new MeldungstypRUEMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypQEBType }
     * 
     */
    public MeldungstypQEBType createMeldungstypQEBType() {
        return new MeldungstypQEBType();
    }

    /**
     * Create an instance of {@link MeldungstypMTAMType }
     * 
     */
    public MeldungstypMTAMType createMeldungstypMTAMType() {
        return new MeldungstypMTAMType();
    }

    /**
     * Create an instance of {@link MeldungstypKDLEType }
     * 
     */
    public MeldungstypKDLEType createMeldungstypKDLEType() {
        return new MeldungstypKDLEType();
    }

    /**
     * Create an instance of {@link MeldungstypERLMPVType }
     * 
     */
    public MeldungstypERLMPVType createMeldungstypERLMPVType() {
        return new MeldungstypERLMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypERLMKType }
     * 
     */
    public MeldungstypERLMKType createMeldungstypERLMKType() {
        return new MeldungstypERLMKType();
    }

    /**
     * Create an instance of {@link MeldungstypERLMType }
     * 
     */
    public MeldungstypERLMType createMeldungstypERLMType() {
        return new MeldungstypERLMType();
    }

    /**
     * Create an instance of {@link MeldungstypENTMPVType }
     * 
     */
    public MeldungstypENTMPVType createMeldungstypENTMPVType() {
        return new MeldungstypENTMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypENTMType }
     * 
     */
    public MeldungstypENTMType createMeldungstypENTMType() {
        return new MeldungstypENTMType();
    }

    /**
     * Create an instance of {@link MeldungstypAKMPVType }
     * 
     */
    public MeldungstypAKMPVType createMeldungstypAKMPVType() {
        return new MeldungstypAKMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypABMPVType }
     * 
     */
    public MeldungstypABMPVType createMeldungstypABMPVType() {
        return new MeldungstypABMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypABMType }
     * 
     */
    public MeldungstypABMType createMeldungstypABMType() {
        return new MeldungstypABMType();
    }

    /**
     * Create an instance of {@link MeldungstypABBMPVType }
     * 
     */
    public MeldungstypABBMPVType createMeldungstypABBMPVType() {
        return new MeldungstypABBMPVType();
    }

    /**
     * Create an instance of {@link MeldungstypABBMType }
     * 
     */
    public MeldungstypABBMType createMeldungstypABBMType() {
        return new MeldungstypABBMType();
    }

    /**
     * Create an instance of {@link MeldungspositionsattributeABMType }
     * 
     */
    public MeldungspositionsattributeABMType createMeldungspositionsattributeABMType() {
        return new MeldungspositionsattributeABMType();
    }

    /**
     * Create an instance of {@link MeldungspositionsattributeQEBType }
     * 
     */
    public MeldungspositionsattributeQEBType createMeldungspositionsattributeQEBType() {
        return new MeldungspositionsattributeQEBType();
    }

    /**
     * Create an instance of {@link MeldungstypTBKAGType }
     * 
     */
    public MeldungstypTBKAGType createMeldungstypTBKAGType() {
        return new MeldungstypTBKAGType();
    }

    /**
     * Create an instance of {@link MeldungstypTBKLEType }
     * 
     */
    public MeldungstypTBKLEType createMeldungstypTBKLEType() {
        return new MeldungstypTBKLEType();
    }

    /**
     * Create an instance of {@link MeldungType }
     * 
     */
    public MeldungType createMeldungType() {
        return new MeldungType();
    }

    /**
     * Create an instance of {@link MeldungspositionType }
     * 
     */
    public MeldungspositionType createMeldungspositionType() {
        return new MeldungspositionType();
    }

    /**
     * Create an instance of {@link MeldungspositionOhneAttributeMitWitaErweiterungType }
     * 
     */
    public MeldungspositionOhneAttributeMitWitaErweiterungType createMeldungspositionOhneAttributeMitWitaErweiterungType() {
        return new MeldungspositionOhneAttributeMitWitaErweiterungType();
    }

    /**
     * Create an instance of {@link MeldungspositionMitWitaErweiterungType }
     * 
     */
    public MeldungspositionMitWitaErweiterungType createMeldungspositionMitWitaErweiterungType() {
        return new MeldungspositionMitWitaErweiterungType();
    }

    /**
     * Create an instance of {@link AuftragstypType }
     * 
     */
    public AuftragstypType createAuftragstypType() {
        return new AuftragstypType();
    }

    /**
     * Create an instance of {@link MeldungsattributeABMType }
     * 
     */
    public MeldungsattributeABMType createMeldungsattributeABMType() {
        return new MeldungsattributeABMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeABBMType }
     * 
     */
    public MeldungsattributeABBMType createMeldungsattributeABBMType() {
        return new MeldungsattributeABBMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeERLMType }
     * 
     */
    public MeldungsattributeERLMType createMeldungsattributeERLMType() {
        return new MeldungsattributeERLMType();
    }

    /**
     * Create an instance of {@link EntstoerungErgebnisType }
     * 
     */
    public EntstoerungErgebnisType createEntstoerungErgebnisType() {
        return new EntstoerungErgebnisType();
    }

    /**
     * Create an instance of {@link DiagnoseErgebnisType }
     * 
     */
    public DiagnoseErgebnisType createDiagnoseErgebnisType() {
        return new DiagnoseErgebnisType();
    }

    /**
     * Create an instance of {@link MeldungsattributeENTMType }
     * 
     */
    public MeldungsattributeENTMType createMeldungsattributeENTMType() {
        return new MeldungsattributeENTMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeQEBType }
     * 
     */
    public MeldungsattributeQEBType createMeldungsattributeQEBType() {
        return new MeldungsattributeQEBType();
    }

    /**
     * Create an instance of {@link MeldungsattributeTAMType }
     * 
     */
    public MeldungsattributeTAMType createMeldungsattributeTAMType() {
        return new MeldungsattributeTAMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeMTAMType }
     * 
     */
    public MeldungsattributeMTAMType createMeldungsattributeMTAMType() {
        return new MeldungsattributeMTAMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeVZMType }
     * 
     */
    public MeldungsattributeVZMType createMeldungsattributeVZMType() {
        return new MeldungsattributeVZMType();
    }

    /**
     * Create an instance of {@link MeldungsattributeKDLEType }
     * 
     */
    public MeldungsattributeKDLEType createMeldungsattributeKDLEType() {
        return new MeldungsattributeKDLEType();
    }

    /**
     * Create an instance of {@link MeldungsattributeZWMAGType }
     * 
     */
    public MeldungsattributeZWMAGType createMeldungsattributeZWMAGType() {
        return new MeldungsattributeZWMAGType();
    }

    /**
     * Create an instance of {@link MeldungsattributeZWMLEType }
     * 
     */
    public MeldungsattributeZWMLEType createMeldungsattributeZWMLEType() {
        return new MeldungsattributeZWMLEType();
    }

    /**
     * Create an instance of {@link MeldungsattributeTBKType }
     * 
     */
    public MeldungsattributeTBKType createMeldungsattributeTBKType() {
        return new MeldungsattributeTBKType();
    }

    /**
     * Create an instance of {@link MeldungsattributeAKMPVType }
     * 
     */
    public MeldungsattributeAKMPVType createMeldungsattributeAKMPVType() {
        return new MeldungsattributeAKMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeRUEMPVType }
     * 
     */
    public MeldungsattributeRUEMPVType createMeldungsattributeRUEMPVType() {
        return new MeldungsattributeRUEMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeABMPVType }
     * 
     */
    public MeldungsattributeABMPVType createMeldungsattributeABMPVType() {
        return new MeldungsattributeABMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeERLMPVType }
     * 
     */
    public MeldungsattributeERLMPVType createMeldungsattributeERLMPVType() {
        return new MeldungsattributeERLMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeENTMPVType }
     * 
     */
    public MeldungsattributeENTMPVType createMeldungsattributeENTMPVType() {
        return new MeldungsattributeENTMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeABBMPVType }
     * 
     */
    public MeldungsattributeABBMPVType createMeldungsattributeABBMPVType() {
        return new MeldungsattributeABBMPVType();
    }

    /**
     * Create an instance of {@link MeldungsattributeERLMKType }
     * 
     */
    public MeldungsattributeERLMKType createMeldungsattributeERLMKType() {
        return new MeldungsattributeERLMKType();
    }

    /**
     * Create an instance of {@link de.telekom.spri.oss.v4.message.MeldungstypTBKType.Meldungspositionen }
     * 
     */
    public de.telekom.spri.oss.v4.message.MeldungstypTBKType.Meldungspositionen createMeldungstypTBKTypeMeldungspositionen() {
        return new de.telekom.spri.oss.v4.message.MeldungstypTBKType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypZWMLEType.Meldungspositionen }
     * 
     */
    public MeldungstypZWMLEType.Meldungspositionen createMeldungstypZWMLETypeMeldungspositionen() {
        return new MeldungstypZWMLEType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypZWMAGType.Meldungspositionen }
     * 
     */
    public MeldungstypZWMAGType.Meldungspositionen createMeldungstypZWMAGTypeMeldungspositionen() {
        return new MeldungstypZWMAGType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypVZMType.Meldungspositionen }
     * 
     */
    public MeldungstypVZMType.Meldungspositionen createMeldungstypVZMTypeMeldungspositionen() {
        return new MeldungstypVZMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypTAMType.Meldungspositionen }
     * 
     */
    public MeldungstypTAMType.Meldungspositionen createMeldungstypTAMTypeMeldungspositionen() {
        return new MeldungstypTAMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypRUEMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypRUEMPVType.Meldungspositionen createMeldungstypRUEMPVTypeMeldungspositionen() {
        return new MeldungstypRUEMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypQEBType.Meldungspositionen }
     * 
     */
    public MeldungstypQEBType.Meldungspositionen createMeldungstypQEBTypeMeldungspositionen() {
        return new MeldungstypQEBType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypMTAMType.Meldungspositionen }
     * 
     */
    public MeldungstypMTAMType.Meldungspositionen createMeldungstypMTAMTypeMeldungspositionen() {
        return new MeldungstypMTAMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypKDLEType.Meldungspositionen }
     * 
     */
    public MeldungstypKDLEType.Meldungspositionen createMeldungstypKDLETypeMeldungspositionen() {
        return new MeldungstypKDLEType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypERLMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypERLMPVType.Meldungspositionen createMeldungstypERLMPVTypeMeldungspositionen() {
        return new MeldungstypERLMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypERLMKType.Meldungspositionen }
     * 
     */
    public MeldungstypERLMKType.Meldungspositionen createMeldungstypERLMKTypeMeldungspositionen() {
        return new MeldungstypERLMKType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypERLMType.Meldungspositionen }
     * 
     */
    public MeldungstypERLMType.Meldungspositionen createMeldungstypERLMTypeMeldungspositionen() {
        return new MeldungstypERLMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypENTMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypENTMPVType.Meldungspositionen createMeldungstypENTMPVTypeMeldungspositionen() {
        return new MeldungstypENTMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypENTMType.Meldungspositionen }
     * 
     */
    public MeldungstypENTMType.Meldungspositionen createMeldungstypENTMTypeMeldungspositionen() {
        return new MeldungstypENTMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypAKMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypAKMPVType.Meldungspositionen createMeldungstypAKMPVTypeMeldungspositionen() {
        return new MeldungstypAKMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypABMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypABMPVType.Meldungspositionen createMeldungstypABMPVTypeMeldungspositionen() {
        return new MeldungstypABMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypABMType.Meldungspositionen }
     * 
     */
    public MeldungstypABMType.Meldungspositionen createMeldungstypABMTypeMeldungspositionen() {
        return new MeldungstypABMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypABBMPVType.Meldungspositionen }
     * 
     */
    public MeldungstypABBMPVType.Meldungspositionen createMeldungstypABBMPVTypeMeldungspositionen() {
        return new MeldungstypABBMPVType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link MeldungstypABBMType.Meldungspositionen }
     * 
     */
    public MeldungstypABBMType.Meldungspositionen createMeldungstypABBMTypeMeldungspositionen() {
        return new MeldungstypABBMType.Meldungspositionen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypABBMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypABBMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ABBM")
    public JAXBElement<MeldungstypABBMType> createABBM(MeldungstypABBMType value) {
        return new JAXBElement<MeldungstypABBMType>(_ABBM_QNAME, MeldungstypABBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypABBMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypABBMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ABBM-PV")
    public JAXBElement<MeldungstypABBMPVType> createABBMPV(MeldungstypABBMPVType value) {
        return new JAXBElement<MeldungstypABBMPVType>(_ABBMPV_QNAME, MeldungstypABBMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypABMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypABMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ABM")
    public JAXBElement<MeldungstypABMType> createABM(MeldungstypABMType value) {
        return new JAXBElement<MeldungstypABMType>(_ABM_QNAME, MeldungstypABMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypABMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypABMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ABM-PV")
    public JAXBElement<MeldungstypABMPVType> createABMPV(MeldungstypABMPVType value) {
        return new JAXBElement<MeldungstypABMPVType>(_ABMPV_QNAME, MeldungstypABMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungspositionsattributeABMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungspositionsattributeABMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ABMpos")
    public JAXBElement<MeldungspositionsattributeABMType> createABMpos(MeldungspositionsattributeABMType value) {
        return new JAXBElement<MeldungspositionsattributeABMType>(_ABMpos_QNAME, MeldungspositionsattributeABMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypAKMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypAKMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "AKM-PV")
    public JAXBElement<MeldungstypAKMPVType> createAKMPV(MeldungstypAKMPVType value) {
        return new JAXBElement<MeldungstypAKMPVType>(_AKMPV_QNAME, MeldungstypAKMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypENTMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypENTMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ENTM")
    public JAXBElement<MeldungstypENTMType> createENTM(MeldungstypENTMType value) {
        return new JAXBElement<MeldungstypENTMType>(_ENTM_QNAME, MeldungstypENTMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypENTMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypENTMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ENTM-PV")
    public JAXBElement<MeldungstypENTMPVType> createENTMPV(MeldungstypENTMPVType value) {
        return new JAXBElement<MeldungstypENTMPVType>(_ENTMPV_QNAME, MeldungstypENTMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ERLM")
    public JAXBElement<MeldungstypERLMType> createERLM(MeldungstypERLMType value) {
        return new JAXBElement<MeldungstypERLMType>(_ERLM_QNAME, MeldungstypERLMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMKType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMKType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ERLM-K")
    public JAXBElement<MeldungstypERLMKType> createERLMK(MeldungstypERLMKType value) {
        return new JAXBElement<MeldungstypERLMKType>(_ERLMK_QNAME, MeldungstypERLMKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypERLMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ERLM-PV")
    public JAXBElement<MeldungstypERLMPVType> createERLMPV(MeldungstypERLMPVType value) {
        return new JAXBElement<MeldungstypERLMPVType>(_ERLMPV_QNAME, MeldungstypERLMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypKDLEType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypKDLEType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "KDLE")
    public JAXBElement<MeldungstypKDLEType> createKDLE(MeldungstypKDLEType value) {
        return new JAXBElement<MeldungstypKDLEType>(_KDLE_QNAME, MeldungstypKDLEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypMTAMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypMTAMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "MTAM")
    public JAXBElement<MeldungstypMTAMType> createMTAM(MeldungstypMTAMType value) {
        return new JAXBElement<MeldungstypMTAMType>(_MTAM_QNAME, MeldungstypMTAMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypQEBType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypQEBType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "QEB")
    public JAXBElement<MeldungstypQEBType> createQEB(MeldungstypQEBType value) {
        return new JAXBElement<MeldungstypQEBType>(_QEB_QNAME, MeldungstypQEBType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungspositionsattributeQEBType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungspositionsattributeQEBType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "QEBpos")
    public JAXBElement<MeldungspositionsattributeQEBType> createQEBpos(MeldungspositionsattributeQEBType value) {
        return new JAXBElement<MeldungspositionsattributeQEBType>(_QEBpos_QNAME, MeldungspositionsattributeQEBType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypRUEMPVType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypRUEMPVType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "RUEM-PV")
    public JAXBElement<MeldungstypRUEMPVType> createRUEMPV(MeldungstypRUEMPVType value) {
        return new JAXBElement<MeldungstypRUEMPVType>(_RUEMPV_QNAME, MeldungstypRUEMPVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypTAMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypTAMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "TAM")
    public JAXBElement<MeldungstypTAMType> createTAM(MeldungstypTAMType value) {
        return new JAXBElement<MeldungstypTAMType>(_TAM_QNAME, MeldungstypTAMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypTBKAGType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypTBKAGType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "TBK-AG")
    public JAXBElement<MeldungstypTBKAGType> createTBKAG(MeldungstypTBKAGType value) {
        return new JAXBElement<MeldungstypTBKAGType>(_TBKAG_QNAME, MeldungstypTBKAGType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypTBKLEType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypTBKLEType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "TBK-LE")
    public JAXBElement<MeldungstypTBKLEType> createTBKLE(MeldungstypTBKLEType value) {
        return new JAXBElement<MeldungstypTBKLEType>(_TBKLE_QNAME, MeldungstypTBKLEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypVZMType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypVZMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "VZM")
    public JAXBElement<MeldungstypVZMType> createVZM(MeldungstypVZMType value) {
        return new JAXBElement<MeldungstypVZMType>(_VZM_QNAME, MeldungstypVZMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypZWMAGType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypZWMAGType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ZWM-AG")
    public JAXBElement<MeldungstypZWMAGType> createZWMAG(MeldungstypZWMAGType value) {
        return new JAXBElement<MeldungstypZWMAGType>(_ZWMAG_QNAME, MeldungstypZWMAGType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungstypZWMLEType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungstypZWMLEType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "ZWM-LE")
    public JAXBElement<MeldungstypZWMLEType> createZWMLE(MeldungstypZWMLEType value) {
        return new JAXBElement<MeldungstypZWMLEType>(_ZWMLE_QNAME, MeldungstypZWMLEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "meldung")
    public JAXBElement<MeldungType> createMeldung(MeldungType value) {
        return new JAXBElement<MeldungType>(_Meldung_QNAME, MeldungType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "meldungType")
    public JAXBElement<MeldungType> createMeldungType(MeldungType value) {
        return new JAXBElement<MeldungType>(_MeldungType_QNAME, MeldungType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeldungspositionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeldungspositionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://spri.telekom.de/oss/v4/message", name = "meldungsposition")
    public JAXBElement<MeldungspositionType> createMeldungsposition(MeldungspositionType value) {
        return new JAXBElement<MeldungspositionType>(_Meldungsposition_QNAME, MeldungspositionType.class, null, value);
    }

}
