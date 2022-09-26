
package de.telekom.spri.oss.v4.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.ProduktType;


/**
 * &lt;p&gt;Java class for AuftragspositionProviderwechselType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuftragspositionProviderwechselType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="produkt" type="{http://spri.telekom.de/oss/v4/complex}ProduktType"/&amp;gt;
 *         &amp;lt;element name="geschaeftsfallProdukt" type="{http://spri.telekom.de/oss/v4/order}ProviderwechselProduktType"/&amp;gt;
 *         &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/order}AuftragspositionType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuftragspositionProviderwechselType", propOrder = {
    "produkt",
    "geschaeftsfallProdukt",
    "position"
})
public class AuftragspositionProviderwechselType {

    @XmlElement(required = true)
    protected ProduktType produkt;
    @XmlElement(required = true)
    protected ProviderwechselProduktType geschaeftsfallProdukt;
    @XmlElement(nillable = true)
    protected List<AuftragspositionType> position;

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

    /**
     * Gets the value of the geschaeftsfallProdukt property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderwechselProduktType }
     *     
     */
    public ProviderwechselProduktType getGeschaeftsfallProdukt() {
        return geschaeftsfallProdukt;
    }

    /**
     * Sets the value of the geschaeftsfallProdukt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderwechselProduktType }
     *     
     */
    public void setGeschaeftsfallProdukt(ProviderwechselProduktType value) {
        this.geschaeftsfallProdukt = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the position property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPosition().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AuftragspositionType }
     * 
     * 
     */
    public List<AuftragspositionType> getPosition() {
        if (position == null) {
            position = new ArrayList<AuftragspositionType>();
        }
        return this.position;
    }

}
