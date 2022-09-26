
package de.xconnect.bus.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.envelope.AnnehmenMeldungResponseType;


/**
 * &lt;p&gt;Java class for annehmenMeldungResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="annehmenMeldungResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="annehmenMeldungResponse" type="{http://spri.telekom.de/oss/v4/envelope}AnnehmenMeldungResponseType"/&amp;gt;
 *         &amp;lt;element name="inhouseMeta" type="{api.bus.xconnect.de}InhouseMeta" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annehmenMeldungResponse", propOrder = {
    "annehmenMeldungResponse",
    "inhouseMeta"
})
public class AnnehmenMeldungResponse {

    @XmlElement(required = true)
    protected AnnehmenMeldungResponseType annehmenMeldungResponse;
    protected InhouseMeta inhouseMeta;

    /**
     * Gets the value of the annehmenMeldungResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AnnehmenMeldungResponseType }
     *     
     */
    public AnnehmenMeldungResponseType getAnnehmenMeldungResponse() {
        return annehmenMeldungResponse;
    }

    /**
     * Sets the value of the annehmenMeldungResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnehmenMeldungResponseType }
     *     
     */
    public void setAnnehmenMeldungResponse(AnnehmenMeldungResponseType value) {
        this.annehmenMeldungResponse = value;
    }

    /**
     * Gets the value of the inhouseMeta property.
     * 
     * @return
     *     possible object is
     *     {@link InhouseMeta }
     *     
     */
    public InhouseMeta getInhouseMeta() {
        return inhouseMeta;
    }

    /**
     * Sets the value of the inhouseMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseMeta }
     *     
     */
    public void setInhouseMeta(InhouseMeta value) {
        this.inhouseMeta = value;
    }

}
