
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for MeldungsattributeERLM-PVType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungsattributeERLM-PVType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="erledigungstermin" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungsattributeERLM-PVType", propOrder = {
    "vertragsnummer",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "erledigungstermin"
})
public class MeldungsattributeERLMPVType
    extends MeldungsattributeType
{

    @XmlElement(required = true)
    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected String auftraggebernummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erledigungstermin;

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

}
