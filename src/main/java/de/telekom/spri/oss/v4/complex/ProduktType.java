
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.fttx.ProduktFTTXType;


/**
 * &lt;p&gt;Java class for ProduktType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProduktType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="bezeichner" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProduktType", propOrder = {
    "bezeichner"
})
@XmlSeeAlso({
    ProduktFTTXType.class
})
public abstract class ProduktType {

    @XmlElement(required = true)
    protected String bezeichner;

    /**
     * Gets the value of the bezeichner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichner() {
        return bezeichner;
    }

    /**
     * Sets the value of the bezeichner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichner(String value) {
        this.bezeichner = value;
    }

}
