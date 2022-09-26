
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.AktionscodeType;


/**
 * &lt;p&gt;Java class for AenderungPositionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AenderungPositionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/order}AuftragspositionType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="aktionscode" type="{http://spri.telekom.de/oss/v4/enm}AktionscodeType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AenderungPositionType", propOrder = {
    "aktionscode"
})
public class AenderungPositionType
    extends AuftragspositionType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AktionscodeType aktionscode;

    /**
     * Gets the value of the aktionscode property.
     * 
     * @return
     *     possible object is
     *     {@link AktionscodeType }
     *     
     */
    public AktionscodeType getAktionscode() {
        return aktionscode;
    }

    /**
     * Sets the value of the aktionscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AktionscodeType }
     *     
     */
    public void setAktionscode(AktionscodeType value) {
        this.aktionscode = value;
    }

}
