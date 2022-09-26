
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.simple.UebergabepunktKundeType;


/**
 * &lt;p&gt;Java class for FTTxAnschlussType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTxAnschlussType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="a10nsp" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="s-vlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="c-vlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="uebergabepunktKunde" type="{http://spri.telekom.de/oss/v4/simple}UebergabepunktKundeType"/&amp;gt;
 *         &amp;lt;element name="witaVertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTTxAnschlussType", propOrder = {
    "a10Nsp",
    "port",
    "sVlan",
    "cVlan",
    "lineId",
    "uebergabepunktKunde",
    "witaVertragsnummer"
})
public class FTTxAnschlussType {

    @XmlElement(name = "a10nsp", required = true)
    protected String a10Nsp;
    @XmlElement(required = true)
    protected String port;
    @XmlElement(name = "s-vlan")
    protected String sVlan;
    @XmlElement(name = "c-vlan")
    protected String cVlan;
    @XmlElement(required = true)
    protected String lineId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UebergabepunktKundeType uebergabepunktKunde;
    protected String witaVertragsnummer;

    /**
     * Gets the value of the a10Nsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA10Nsp() {
        return a10Nsp;
    }

    /**
     * Sets the value of the a10Nsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA10Nsp(String value) {
        this.a10Nsp = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the sVlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVlan() {
        return sVlan;
    }

    /**
     * Sets the value of the sVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVlan(String value) {
        this.sVlan = value;
    }

    /**
     * Gets the value of the cVlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVlan() {
        return cVlan;
    }

    /**
     * Sets the value of the cVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVlan(String value) {
        this.cVlan = value;
    }

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the uebergabepunktKunde property.
     * 
     * @return
     *     possible object is
     *     {@link UebergabepunktKundeType }
     *     
     */
    public UebergabepunktKundeType getUebergabepunktKunde() {
        return uebergabepunktKunde;
    }

    /**
     * Sets the value of the uebergabepunktKunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link UebergabepunktKundeType }
     *     
     */
    public void setUebergabepunktKunde(UebergabepunktKundeType value) {
        this.uebergabepunktKunde = value;
    }

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

}
