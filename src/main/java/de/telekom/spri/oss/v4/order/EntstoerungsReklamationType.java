
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntstoerungsReklamationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EntstoerungsReklamationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="stoerungsNrLeistungserbringer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="reklamationsgrund" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntstoerungsReklamationType", propOrder = {
    "stoerungsNrLeistungserbringer",
    "reklamationsgrund"
})
public class EntstoerungsReklamationType {

    @XmlElement(required = true)
    protected String stoerungsNrLeistungserbringer;
    @XmlElement(required = true)
    protected String reklamationsgrund;

    /**
     * Gets the value of the stoerungsNrLeistungserbringer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoerungsNrLeistungserbringer() {
        return stoerungsNrLeistungserbringer;
    }

    /**
     * Sets the value of the stoerungsNrLeistungserbringer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoerungsNrLeistungserbringer(String value) {
        this.stoerungsNrLeistungserbringer = value;
    }

    /**
     * Gets the value of the reklamationsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReklamationsgrund() {
        return reklamationsgrund;
    }

    /**
     * Sets the value of the reklamationsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReklamationsgrund(String value) {
        this.reklamationsgrund = value;
    }

}
