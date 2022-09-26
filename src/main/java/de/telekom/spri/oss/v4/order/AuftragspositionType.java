
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.ProduktType;


/**
 * &lt;p&gt;Java class for AuftragspositionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuftragspositionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="produkt" type="{http://spri.telekom.de/oss/v4/complex}ProduktType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuftragspositionType", propOrder = {
    "produkt"
})
@XmlSeeAlso({
    AenderungPositionType.class
})
public class AuftragspositionType {

    @XmlElement(required = true)
    protected ProduktType produkt;

    /**
     * Gets the value of the produkt property.
     * 
     * @return
     *     possible object is
     *     {@link ProduktType }
     *     
     */
    public ProduktType getProdukt() {
        return produkt;
    }

    /**
     * Sets the value of the produkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduktType }
     *     
     */
    public void setProdukt(ProduktType value) {
        this.produkt = value;
    }

}
