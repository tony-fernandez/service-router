
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.WunschterminType;


/**
 * &lt;p&gt;Java class for KuendigungTermineType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="KuendigungTermineType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="auftraggeberWunschtermin" type="{http://spri.telekom.de/oss/v4/complex}WunschterminType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KuendigungTermineType", propOrder = {
    "auftraggeberWunschtermin"
})
public class KuendigungTermineType {

    @XmlElement(required = true)
    protected WunschterminType auftraggeberWunschtermin;

    /**
     * Gets the value of the auftraggeberWunschtermin property.
     * 
     * @return
     *     possible object is
     *     {@link WunschterminType }
     *     
     */
    public WunschterminType getAuftraggeberWunschtermin() {
        return auftraggeberWunschtermin;
    }

    /**
     * Sets the value of the auftraggeberWunschtermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link WunschterminType }
     *     
     */
    public void setAuftraggeberWunschtermin(WunschterminType value) {
        this.auftraggeberWunschtermin = value;
    }

}
