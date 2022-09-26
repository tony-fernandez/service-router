
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.message.MeldungspositionOhneAttributeMitWitaErweiterungType;
import de.telekom.spri.oss.v4.message.MeldungspositionType;


/**
 * &lt;p&gt;Java class for MeldungspositionOhneAttributeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungspositionOhneAttributeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="meldungscode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="meldungstext" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungspositionOhneAttributeType", propOrder = {
    "meldungscode",
    "meldungstext"
})
@XmlSeeAlso({
    MeldungspositionType.class,
    MeldungspositionOhneAttributeMitWitaErweiterungType.class
})
public class MeldungspositionOhneAttributeType {

    @XmlElement(required = true)
    protected String meldungscode;
    @XmlElement(required = true)
    protected String meldungstext;

    /**
     * Gets the value of the meldungscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldungscode() {
        return meldungscode;
    }

    /**
     * Sets the value of the meldungscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldungscode(String value) {
        this.meldungscode = value;
    }

    /**
     * Gets the value of the meldungstext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldungstext() {
        return meldungstext;
    }

    /**
     * Sets the value of the meldungstext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldungstext(String value) {
        this.meldungstext = value;
    }

}
