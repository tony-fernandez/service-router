
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.AnlagentypType;


/**
 * &lt;p&gt;Java class for AnlageMitTypType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnlageMitTypType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}AnlageType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="anlagentyp" type="{http://spri.telekom.de/oss/v4/enm}AnlagentypType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlageMitTypType", propOrder = {
    "anlagentyp"
})
public class AnlageMitTypType
    extends AnlageType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnlagentypType anlagentyp;

    /**
     * Gets the value of the anlagentyp property.
     * 
     * @return
     *     possible object is
     *     {@link AnlagentypType }
     *     
     */
    public AnlagentypType getAnlagentyp() {
        return anlagentyp;
    }

    /**
     * Sets the value of the anlagentyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlagentypType }
     *     
     */
    public void setAnlagentyp(AnlagentypType value) {
        this.anlagentyp = value;
    }

}
