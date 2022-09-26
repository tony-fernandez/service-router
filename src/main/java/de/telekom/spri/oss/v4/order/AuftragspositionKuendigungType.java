
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuftragspositionKuendigungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuftragspositionKuendigungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="geschaeftsfallProdukt" type="{http://spri.telekom.de/oss/v4/order}KuendigungProduktType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuftragspositionKuendigungType", propOrder = {
    "geschaeftsfallProdukt"
})
public class AuftragspositionKuendigungType {

    @XmlElement(required = true)
    protected KuendigungProduktType geschaeftsfallProdukt;

    /**
     * Gets the value of the geschaeftsfallProdukt property.
     * 
     * @return
     *     possible object is
     *     {@link KuendigungProduktType }
     *     
     */
    public KuendigungProduktType getGeschaeftsfallProdukt() {
        return geschaeftsfallProdukt;
    }

    /**
     * Sets the value of the geschaeftsfallProdukt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KuendigungProduktType }
     *     
     */
    public void setGeschaeftsfallProdukt(KuendigungProduktType value) {
        this.geschaeftsfallProdukt = value;
    }

}
