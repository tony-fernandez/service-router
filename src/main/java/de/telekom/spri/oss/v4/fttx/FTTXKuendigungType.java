
package de.telekom.spri.oss.v4.fttx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.order.KuendigungProduktType;


/**
 * &lt;p&gt;Java class for FTTXKuendigungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTXKuendigungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/order}KuendigungProduktType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="witaVertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="technologie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTTXKuendigungType", propOrder = {
    "witaVertragsnummer",
    "technologie"
})
public class FTTXKuendigungType
    extends KuendigungProduktType
{

    protected String witaVertragsnummer;
    protected String technologie;

    /**
     * Gets the value of the witaVertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitaVertragsnummer() {
        return witaVertragsnummer;
    }

    /**
     * Sets the value of the witaVertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitaVertragsnummer(String value) {
        this.witaVertragsnummer = value;
    }

    /**
     * Gets the value of the technologie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologie() {
        return technologie;
    }

    /**
     * Sets the value of the technologie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologie(String value) {
        this.technologie = value;
    }

}
