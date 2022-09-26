
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StandortAType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StandortAType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}StandortType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lageTAE_ONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandortAType", propOrder = {
    "lageTAEONT"
})
public class StandortAType
    extends StandortType
{

    @XmlElement(name = "lageTAE_ONT")
    protected String lageTAEONT;

    /**
     * Gets the value of the lageTAEONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLageTAEONT() {
        return lageTAEONT;
    }

    /**
     * Sets the value of the lageTAEONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLageTAEONT(String value) {
        this.lageTAEONT = value;
    }

}
