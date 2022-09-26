
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FirmaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FirmaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="anrede" type="{http://spri.telekom.de/oss/v4/enm}AnredeFirmaType"/&amp;gt;
 *         &amp;lt;element name="firmenname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="firmennameZweiterTeil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirmaType", propOrder = {
    "anrede",
    "firmenname",
    "firmennameZweiterTeil"
})
@XmlSeeAlso({
    FirmaMitTelefonType.class
})
public class FirmaType {

    @XmlElement(required = true)
    protected String anrede;
    @XmlElement(required = true)
    protected String firmenname;
    protected String firmennameZweiterTeil;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the firmenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenname() {
        return firmenname;
    }

    /**
     * Sets the value of the firmenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenname(String value) {
        this.firmenname = value;
    }

    /**
     * Gets the value of the firmennameZweiterTeil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmennameZweiterTeil() {
        return firmennameZweiterTeil;
    }

    /**
     * Sets the value of the firmennameZweiterTeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmennameZweiterTeil(String value) {
        this.firmennameZweiterTeil = value;
    }

}
