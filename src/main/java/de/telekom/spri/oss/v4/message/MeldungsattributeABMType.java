
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.FTTxAnschlussType;
import de.telekom.spri.oss.v4.complex.ProviderwechselRueckmeldungType;
import de.telekom.spri.oss.v4.complex.WunschterminType;


/**
 * &lt;p&gt;Java class for MeldungsattributeABMType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungsattributeABMType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummerBesteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vorabstimmungId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="verbindlicherLiefertermin" type="{http://spri.telekom.de/oss/v4/complex}WunschterminType"/&amp;gt;
 *         &amp;lt;element name="abgebenderProvider" type="{http://spri.telekom.de/oss/v4/complex}ProviderwechselRueckmeldungType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="anschluss" type="{http://spri.telekom.de/oss/v4/complex}FTTxAnschlussType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungsattributeABMType", propOrder = {
    "vertragsnummer",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "auftraggebernummerBesteller",
    "vorabstimmungId",
    "verbindlicherLiefertermin",
    "abgebenderProvider",
    "anschluss"
})
public class MeldungsattributeABMType
    extends MeldungsattributeType
{

    @XmlElement(required = true)
    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected String auftraggebernummer;
    protected String auftraggebernummerBesteller;
    protected String vorabstimmungId;
    @XmlElement(required = true)
    protected WunschterminType verbindlicherLiefertermin;
    protected ProviderwechselRueckmeldungType abgebenderProvider;
    @XmlElement(required = true)
    protected FTTxAnschlussType anschluss;

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
     * Gets the value of the auftraggebernummerBesteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftraggebernummerBesteller() {
        return auftraggebernummerBesteller;
    }

    /**
     * Sets the value of the auftraggebernummerBesteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftraggebernummerBesteller(String value) {
        this.auftraggebernummerBesteller = value;
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
     * Gets the value of the verbindlicherLiefertermin property.
     * 
     * @return
     *     possible object is
     *     {@link WunschterminType }
     *     
     */
    public WunschterminType getVerbindlicherLiefertermin() {
        return verbindlicherLiefertermin;
    }

    /**
     * Sets the value of the verbindlicherLiefertermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link WunschterminType }
     *     
     */
    public void setVerbindlicherLiefertermin(WunschterminType value) {
        this.verbindlicherLiefertermin = value;
    }

    /**
     * Gets the value of the abgebenderProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderwechselRueckmeldungType }
     *     
     */
    public ProviderwechselRueckmeldungType getAbgebenderProvider() {
        return abgebenderProvider;
    }

    /**
     * Sets the value of the abgebenderProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderwechselRueckmeldungType }
     *     
     */
    public void setAbgebenderProvider(ProviderwechselRueckmeldungType value) {
        this.abgebenderProvider = value;
    }

    /**
     * Gets the value of the anschluss property.
     * 
     * @return
     *     possible object is
     *     {@link FTTxAnschlussType }
     *     
     */
    public FTTxAnschlussType getAnschluss() {
        return anschluss;
    }

    /**
     * Sets the value of the anschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTxAnschlussType }
     *     
     */
    public void setAnschluss(FTTxAnschlussType value) {
        this.anschluss = value;
    }

}
