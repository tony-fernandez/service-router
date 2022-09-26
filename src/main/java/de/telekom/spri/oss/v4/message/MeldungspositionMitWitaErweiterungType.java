
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MeldungspositionMitWitaErweiterungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungspositionMitWitaErweiterungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungspositionOhneAttributeMitWitaErweiterungType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="positionsattribute" type="{http://spri.telekom.de/oss/v4/message}MeldungspositionsattributeType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungspositionMitWitaErweiterungType", propOrder = {
    "positionsattribute"
})
public class MeldungspositionMitWitaErweiterungType
    extends MeldungspositionOhneAttributeMitWitaErweiterungType
{

    protected MeldungspositionsattributeType positionsattribute;

    /**
     * Gets the value of the positionsattribute property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungspositionsattributeType }
     *     
     */
    public MeldungspositionsattributeType getPositionsattribute() {
        return positionsattribute;
    }

    /**
     * Sets the value of the positionsattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungspositionsattributeType }
     *     
     */
    public void setPositionsattribute(MeldungspositionsattributeType value) {
        this.positionsattribute = value;
    }

}
