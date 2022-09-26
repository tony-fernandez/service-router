
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnlageMitTypType;
import de.telekom.spri.oss.v4.complex.FTTxAnschlussEinfachType;
import de.telekom.spri.oss.v4.complex.ProviderwechselAnkuendigungType;


/**
 * &lt;p&gt;Java class for MeldungsattributeAKM-PVType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungsattributeAKM-PVType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="vorabstimmungId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="anschluss" type="{http://spri.telekom.de/oss/v4/complex}FTTxAnschlussEinfachType"/&amp;gt;
 *         &amp;lt;element name="anlage" type="{http://spri.telekom.de/oss/v4/complex}AnlageMitTypType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="aufnehmenderProvider" type="{http://spri.telekom.de/oss/v4/complex}ProviderwechselAnkuendigungType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungsattributeAKM-PVType", propOrder = {
    "vertragsnummer",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "vorabstimmungId",
    "anschluss",
    "anlage",
    "aufnehmenderProvider"
})
public class MeldungsattributeAKMPVType
    extends MeldungsattributeType
{

    @XmlElement(required = true)
    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected String auftraggebernummer;
    protected String vorabstimmungId;
    @XmlElement(required = true)
    protected FTTxAnschlussEinfachType anschluss;
    protected AnlageMitTypType anlage;
    @XmlElement(required = true)
    protected ProviderwechselAnkuendigungType aufnehmenderProvider;

    /**
     * Gets the value of the vertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertragsnummer() {
        return vertragsnummer;
    }

    /**
     * Sets the value of the vertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertragsnummer(String value) {
        this.vertragsnummer = value;
    }

    /**
     * Gets the value of the externeAuftragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExterneAuftragsnummer() {
        return externeAuftragsnummer;
    }

    /**
     * Sets the value of the externeAuftragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExterneAuftragsnummer(String value) {
        this.externeAuftragsnummer = value;
    }

    /**
     * Gets the value of the auftraggebernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftraggebernummer() {
        return auftraggebernummer;
    }

    /**
     * Sets the value of the auftraggebernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftraggebernummer(String value) {
        this.auftraggebernummer = value;
    }

    /**
     * Gets the value of the vorabstimmungId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorabstimmungId() {
        return vorabstimmungId;
    }

    /**
     * Sets the value of the vorabstimmungId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorabstimmungId(String value) {
        this.vorabstimmungId = value;
    }

    /**
     * Gets the value of the anschluss property.
     * 
     * @return
     *     possible object is
     *     {@link FTTxAnschlussEinfachType }
     *     
     */
    public FTTxAnschlussEinfachType getAnschluss() {
        return anschluss;
    }

    /**
     * Sets the value of the anschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTxAnschlussEinfachType }
     *     
     */
    public void setAnschluss(FTTxAnschlussEinfachType value) {
        this.anschluss = value;
    }

    /**
     * Gets the value of the anlage property.
     * 
     * @return
     *     possible object is
     *     {@link AnlageMitTypType }
     *     
     */
    public AnlageMitTypType getAnlage() {
        return anlage;
    }

    /**
     * Sets the value of the anlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlageMitTypType }
     *     
     */
    public void setAnlage(AnlageMitTypType value) {
        this.anlage = value;
    }

    /**
     * Gets the value of the aufnehmenderProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderwechselAnkuendigungType }
     *     
     */
    public ProviderwechselAnkuendigungType getAufnehmenderProvider() {
        return aufnehmenderProvider;
    }

    /**
     * Sets the value of the aufnehmenderProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderwechselAnkuendigungType }
     *     
     */
    public void setAufnehmenderProvider(ProviderwechselAnkuendigungType value) {
        this.aufnehmenderProvider = value;
    }

}
