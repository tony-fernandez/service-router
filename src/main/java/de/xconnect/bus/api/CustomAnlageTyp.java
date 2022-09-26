
package de.xconnect.bus.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnlageType;


/**
 * &lt;p&gt;Java class for CustomAnlageTyp complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CustomAnlageTyp"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="bus_fileUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomAnlageTyp", propOrder = {
    "busFileUuid"
})
@XmlSeeAlso({
    AnlageType.class
})
public class CustomAnlageTyp {

    @XmlElement(name = "bus_fileUuid")
    protected String busFileUuid;

    /**
     * Gets the value of the busFileUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusFileUuid() {
        return busFileUuid;
    }

    /**
     * Sets the value of the busFileUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusFileUuid(String value) {
        this.busFileUuid = value;
    }

}
