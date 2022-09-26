
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.AnsprechpartnerRolleType;


/**
 * &lt;p&gt;Java class for AnsprechpartnerMitRolleType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnsprechpartnerMitRolleType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rolle" type="{http://spri.telekom.de/oss/v4/enm}AnsprechpartnerRolleType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnsprechpartnerMitRolleType", propOrder = {
    "rolle"
})
public class AnsprechpartnerMitRolleType
    extends AnsprechpartnerType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnsprechpartnerRolleType rolle;

    /**
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link AnsprechpartnerRolleType }
     *     
     */
    public AnsprechpartnerRolleType getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsprechpartnerRolleType }
     *     
     */
    public void setRolle(AnsprechpartnerRolleType value) {
        this.rolle = value;
    }

}
