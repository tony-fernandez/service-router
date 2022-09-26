
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnsprechpartnerType;


/**
 * &lt;p&gt;Java class for MeldungspositionsattributeQEBType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungspositionsattributeQEBType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungspositionsattributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ansprechpartnerLeistungserbringer" type="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungspositionsattributeQEBType", propOrder = {
    "ansprechpartnerLeistungserbringer"
})
public class MeldungspositionsattributeQEBType
    extends MeldungspositionsattributeType
{

    @XmlElement(required = true)
    protected AnsprechpartnerType ansprechpartnerLeistungserbringer;

    /**
     * Gets the value of the ansprechpartnerLeistungserbringer property.
     * 
     * @return
     *     possible object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public AnsprechpartnerType getAnsprechpartnerLeistungserbringer() {
        return ansprechpartnerLeistungserbringer;
    }

    /**
     * Sets the value of the ansprechpartnerLeistungserbringer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public void setAnsprechpartnerLeistungserbringer(AnsprechpartnerType value) {
        this.ansprechpartnerLeistungserbringer = value;
    }

}
