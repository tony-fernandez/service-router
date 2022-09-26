
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StrasseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StrasseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="strassenname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="hausnummernZusatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrasseType", propOrder = {
    "strassenname",
    "hausnummer",
    "hausnummernZusatz"
})
public class StrasseType {

    @XmlElement(required = true)
    protected String strassenname;
    @XmlElement(required = true)
    protected String hausnummer;
    protected String hausnummernZusatz;

    /**
     * Gets the value of the strassenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrassenname() {
        return strassenname;
    }

    /**
     * Sets the value of the strassenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrassenname(String value) {
        this.strassenname = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the hausnummernZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummernZusatz() {
        return hausnummernZusatz;
    }

    /**
     * Sets the value of the hausnummernZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummernZusatz(String value) {
        this.hausnummernZusatz = value;
    }

}
