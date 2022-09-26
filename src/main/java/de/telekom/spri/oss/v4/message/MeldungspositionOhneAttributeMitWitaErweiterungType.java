
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.MeldungspositionOhneAttributeType;


/**
 * &lt;p&gt;Java class for MeldungspositionOhneAttributeMitWitaErweiterungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungspositionOhneAttributeMitWitaErweiterungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}MeldungspositionOhneAttributeType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="witaMeldungscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="witaMeldungstext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungspositionOhneAttributeMitWitaErweiterungType", propOrder = {
    "witaMeldungscode",
    "witaMeldungstext"
})
@XmlSeeAlso({
    MeldungspositionMitWitaErweiterungType.class
})
public class MeldungspositionOhneAttributeMitWitaErweiterungType
    extends MeldungspositionOhneAttributeType
{

    protected String witaMeldungscode;
    protected String witaMeldungstext;

    /**
     * Gets the value of the witaMeldungscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitaMeldungscode() {
        return witaMeldungscode;
    }

    /**
     * Sets the value of the witaMeldungscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitaMeldungscode(String value) {
        this.witaMeldungscode = value;
    }

    /**
     * Gets the value of the witaMeldungstext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitaMeldungstext() {
        return witaMeldungstext;
    }

    /**
     * Sets the value of the witaMeldungstext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitaMeldungstext(String value) {
        this.witaMeldungstext = value;
    }

}
