
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GebaeudeteilType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GebaeudeteilType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="gebaeudeteilName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="gebaeudeteilZusatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GebaeudeteilType", propOrder = {
    "gebaeudeteilName",
    "gebaeudeteilZusatz"
})
public class GebaeudeteilType {

    @XmlElement(required = true)
    protected String gebaeudeteilName;
    protected String gebaeudeteilZusatz;

    /**
     * Gets the value of the gebaeudeteilName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebaeudeteilName() {
        return gebaeudeteilName;
    }

    /**
     * Sets the value of the gebaeudeteilName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebaeudeteilName(String value) {
        this.gebaeudeteilName = value;
    }

    /**
     * Gets the value of the gebaeudeteilZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebaeudeteilZusatz() {
        return gebaeudeteilZusatz;
    }

    /**
     * Sets the value of the gebaeudeteilZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebaeudeteilZusatz(String value) {
        this.gebaeudeteilZusatz = value;
    }

}
