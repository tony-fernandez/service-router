
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.WunschterminMitZeitangabeUndZeitfensterType;


/**
 * &lt;p&gt;Java class for MeldungsattributeTBKType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungsattributeTBKType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummerBesteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="termin" type="{http://spri.telekom.de/oss/v4/complex}WunschterminMitZeitangabeUndZeitfensterType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungsattributeTBKType", propOrder = {
    "vertragsnummer",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "auftraggebernummerBesteller",
    "termin"
})
public class MeldungsattributeTBKType
    extends MeldungsattributeType
{

    @XmlElement(required = true)
    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected String auftraggebernummer;
    protected String auftraggebernummerBesteller;
    @XmlElement(required = true)
    protected WunschterminMitZeitangabeUndZeitfensterType termin;

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
     * Gets the value of the termin property.
     * 
     * @return
     *     possible object is
     *     {@link WunschterminMitZeitangabeUndZeitfensterType }
     *     
     */
    public WunschterminMitZeitangabeUndZeitfensterType getTermin() {
        return termin;
    }

    /**
     * Sets the value of the termin property.
     * 
     * @param value
     *     allowed object is
     *     {@link WunschterminMitZeitangabeUndZeitfensterType }
     *     
     */
    public void setTermin(WunschterminMitZeitangabeUndZeitfensterType value) {
        this.termin = value;
    }

}
