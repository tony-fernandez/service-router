
package de.xconnect.bus.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragRequestType;


/**
 * &lt;p&gt;Java class for annehmenAuftragRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="annehmenAuftragRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="annehmenAuftragRequest" type="{http://spri.telekom.de/oss/v4/envelope}AnnehmenAuftragRequestType"/&amp;gt;
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
@XmlType(name = "annehmenAuftragRequest", propOrder = {
    "annehmenAuftragRequest",
    "inhouseMeta"
})
public class AnnehmenAuftragRequest {

    @XmlElement(required = true)
    protected AnnehmenAuftragRequestType annehmenAuftragRequest;
    protected InhouseMeta inhouseMeta;

    /**
     * Gets the value of the annehmenAuftragRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AnnehmenAuftragRequestType }
     *     
     */
    public AnnehmenAuftragRequestType getAnnehmenAuftragRequest() {
        return annehmenAuftragRequest;
    }

    /**
     * Sets the value of the annehmenAuftragRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnehmenAuftragRequestType }
     *     
     */
    public void setAnnehmenAuftragRequest(AnnehmenAuftragRequestType value) {
        this.annehmenAuftragRequest = value;
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
