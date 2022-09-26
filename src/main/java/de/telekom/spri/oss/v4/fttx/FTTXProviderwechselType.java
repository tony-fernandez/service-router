
package de.telekom.spri.oss.v4.fttx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.MontageleistungType;
import de.telekom.spri.oss.v4.complex.StandortAType;
import de.telekom.spri.oss.v4.order.ProviderwechselProduktType;


/**
 * &lt;p&gt;Java class for FTTXProviderwechselType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTXProviderwechselType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/order}ProviderwechselProduktType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="standortA" type="{http://spri.telekom.de/oss/v4/complex}StandortAType"/&amp;gt;
 *         &amp;lt;element name="montageleistung" type="{http://spri.telekom.de/oss/v4/complex}MontageleistungType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTTXProviderwechselType", propOrder = {
    "standortA",
    "montageleistung"
})
public class FTTXProviderwechselType
    extends ProviderwechselProduktType
{

    @XmlElement(required = true)
    protected StandortAType standortA;
    protected MontageleistungType montageleistung;

    /**
     * Gets the value of the standortA property.
     * 
     * @return
     *     possible object is
     *     {@link StandortAType }
     *     
     */
    public StandortAType getStandortA() {
        return standortA;
    }

    /**
     * Sets the value of the standortA property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandortAType }
     *     
     */
    public void setStandortA(StandortAType value) {
        this.standortA = value;
    }

    /**
     * Gets the value of the montageleistung property.
     * 
     * @return
     *     possible object is
     *     {@link MontageleistungType }
     *     
     */
    public MontageleistungType getMontageleistung() {
        return montageleistung;
    }

    /**
     * Sets the value of the montageleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link MontageleistungType }
     *     
     */
    public void setMontageleistung(MontageleistungType value) {
        this.montageleistung = value;
    }

}
