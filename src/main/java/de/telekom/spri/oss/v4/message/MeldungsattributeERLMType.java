
package de.telekom.spri.oss.v4.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import de.telekom.spri.oss.v4.complex.AnlageMitTypType;


/**
 * &lt;p&gt;Java class for MeldungsattributeERLMType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungsattributeERLMType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummerBesteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vorabstimmungId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="erledigungstermin" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="entstoerErgebnis" type="{http://spri.telekom.de/oss/v4/message}EntstoerungErgebnisType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="anlage" type="{http://spri.telekom.de/oss/v4/complex}AnlageMitTypType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dignoseergebnis" type="{http://spri.telekom.de/oss/v4/message}DiagnoseErgebnisType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungsattributeERLMType", propOrder = {
    "vertragsnummer",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "auftraggebernummerBesteller",
    "vorabstimmungId",
    "erledigungstermin",
    "entstoerErgebnis",
    "anlage",
    "dignoseergebnis"
})
public class MeldungsattributeERLMType
    extends MeldungsattributeType
{

    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected String auftraggebernummer;
    protected String auftraggebernummerBesteller;
    protected String vorabstimmungId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erledigungstermin;
    protected EntstoerungErgebnisType entstoerErgebnis;
    protected AnlageMitTypType anlage;
    @XmlElement(nillable = true)
    protected List<DiagnoseErgebnisType> dignoseergebnis;

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
     * Gets the value of the erledigungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErledigungstermin() {
        return erledigungstermin;
    }

    /**
     * Sets the value of the erledigungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErledigungstermin(XMLGregorianCalendar value) {
        this.erledigungstermin = value;
    }

    /**
     * Gets the value of the entstoerErgebnis property.
     * 
     * @return
     *     possible object is
     *     {@link EntstoerungErgebnisType }
     *     
     */
    public EntstoerungErgebnisType getEntstoerErgebnis() {
        return entstoerErgebnis;
    }

    /**
     * Sets the value of the entstoerErgebnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntstoerungErgebnisType }
     *     
     */
    public void setEntstoerErgebnis(EntstoerungErgebnisType value) {
        this.entstoerErgebnis = value;
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
     * Gets the value of the dignoseergebnis property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dignoseergebnis property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDignoseergebnis().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnoseErgebnisType }
     * 
     * 
     */
    public List<DiagnoseErgebnisType> getDignoseergebnis() {
        if (dignoseergebnis == null) {
            dignoseergebnis = new ArrayList<DiagnoseErgebnisType>();
        }
        return this.dignoseergebnis;
    }

}
