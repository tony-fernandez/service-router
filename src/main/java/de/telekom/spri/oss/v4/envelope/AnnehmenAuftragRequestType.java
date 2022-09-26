
package de.telekom.spri.oss.v4.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.order.AuftragType;


/**
 * &lt;p&gt;Java class for AnnehmenAuftragRequestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnnehmenAuftragRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="control" type="{http://spri.telekom.de/oss/v4/envelope}WholesaleRequestType"/&amp;gt;
 *         &amp;lt;element name="auftrag" type="{http://spri.telekom.de/oss/v4/order}AuftragType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnehmenAuftragRequestType", propOrder = {
    "control",
    "auftrag"
})
public class AnnehmenAuftragRequestType {

    @XmlElement(required = true)
    protected WholesaleRequestType control;
    @XmlElement(required = true)
    protected AuftragType auftrag;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleRequestType }
     *     
     */
    public WholesaleRequestType getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleRequestType }
     *     
     */
    public void setControl(WholesaleRequestType value) {
        this.control = value;
    }

    /**
     * Gets the value of the auftrag property.
     * 
     * @return
     *     possible object is
     *     {@link AuftragType }
     *     
     */
    public AuftragType getAuftrag() {
        return auftrag;
    }

    /**
     * Sets the value of the auftrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftragType }
     *     
     */
    public void setAuftrag(AuftragType value) {
        this.auftrag = value;
    }

}
