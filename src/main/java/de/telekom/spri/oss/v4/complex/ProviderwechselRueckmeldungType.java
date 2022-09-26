
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.JaNeinType;


/**
 * &lt;p&gt;Java class for ProviderwechselRueckmeldungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProviderwechselRueckmeldungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="providername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zustimmungProviderwechsel" type="{http://spri.telekom.de/oss/v4/enm}JaNeinType"/&amp;gt;
 *         &amp;lt;element name="antwortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="antworttext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderwechselRueckmeldungType", propOrder = {
    "providername",
    "zustimmungProviderwechsel",
    "antwortcode",
    "antworttext"
})
public class ProviderwechselRueckmeldungType {

    protected String providername;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JaNeinType zustimmungProviderwechsel;
    protected String antwortcode;
    protected String antworttext;

    /**
     * Gets the value of the providername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidername() {
        return providername;
    }

    /**
     * Sets the value of the providername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidername(String value) {
        this.providername = value;
    }

    /**
     * Gets the value of the zustimmungProviderwechsel property.
     * 
     * @return
     *     possible object is
     *     {@link JaNeinType }
     *     
     */
    public JaNeinType getZustimmungProviderwechsel() {
        return zustimmungProviderwechsel;
    }

    /**
     * Sets the value of the zustimmungProviderwechsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaNeinType }
     *     
     */
    public void setZustimmungProviderwechsel(JaNeinType value) {
        this.zustimmungProviderwechsel = value;
    }

    /**
     * Gets the value of the antwortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntwortcode() {
        return antwortcode;
    }

    /**
     * Sets the value of the antwortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntwortcode(String value) {
        this.antwortcode = value;
    }

    /**
     * Gets the value of the antworttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntworttext() {
        return antworttext;
    }

    /**
     * Sets the value of the antworttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntworttext(String value) {
        this.antworttext = value;
    }

}
