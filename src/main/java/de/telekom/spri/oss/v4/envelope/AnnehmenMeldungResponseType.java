
package de.telekom.spri.oss.v4.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.MessageTEQType;


/**
 * &lt;p&gt;Java class for AnnehmenMeldungResponseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnnehmenMeldungResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="control" type="{http://spri.telekom.de/oss/v4/envelope}WholesaleResponseType"/&amp;gt;
 *         &amp;lt;element name="quittung" type="{http://spri.telekom.de/oss/v4/complex}MessageTEQType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnehmenMeldungResponseType", propOrder = {
    "control",
    "quittung"
})
public class AnnehmenMeldungResponseType {

    @XmlElement(required = true)
    protected WholesaleResponseType control;
    @XmlElement(required = true)
    protected MessageTEQType quittung;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleResponseType }
     *     
     */
    public WholesaleResponseType getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleResponseType }
     *     
     */
    public void setControl(WholesaleResponseType value) {
        this.control = value;
    }

    /**
     * Gets the value of the quittung property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTEQType }
     *     
     */
    public MessageTEQType getQuittung() {
        return quittung;
    }

    /**
     * Sets the value of the quittung property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTEQType }
     *     
     */
    public void setQuittung(MessageTEQType value) {
        this.quittung = value;
    }

}
