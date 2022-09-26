
package de.xconnect.bus.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InhouseResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InhouseResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="inhouseResponseCode" type="{api.bus.xconnect.de}inhouseResponseCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhouseResponse", propOrder = {
    "description",
    "inhouseResponseCode"
})
public class InhouseResponse {

    protected String description;
    @XmlSchemaType(name = "string")
    protected InhouseResponseCode inhouseResponseCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inhouseResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link InhouseResponseCode }
     *     
     */
    public InhouseResponseCode getInhouseResponseCode() {
        return inhouseResponseCode;
    }

    /**
     * Sets the value of the inhouseResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseResponseCode }
     *     
     */
    public void setInhouseResponseCode(InhouseResponseCode value) {
        this.inhouseResponseCode = value;
    }

}
