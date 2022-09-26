
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MontageleistungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MontageleistungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ansprechpartner" type="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerType"/&amp;gt;
 *         &amp;lt;element name="montagehinweis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MontageleistungType", propOrder = {
    "ansprechpartner",
    "montagehinweis"
})
public class MontageleistungType {

    @XmlElement(required = true)
    protected AnsprechpartnerType ansprechpartner;
    protected String montagehinweis;

    /**
     * Gets the value of the ansprechpartner property.
     * 
     * @return
     *     possible object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public AnsprechpartnerType getAnsprechpartner() {
        return ansprechpartner;
    }

    /**
     * Sets the value of the ansprechpartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public void setAnsprechpartner(AnsprechpartnerType value) {
        this.ansprechpartner = value;
    }

    /**
     * Gets the value of the montagehinweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontagehinweis() {
        return montagehinweis;
    }

    /**
     * Sets the value of the montagehinweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontagehinweis(String value) {
        this.montagehinweis = value;
    }

}
