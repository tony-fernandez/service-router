
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StandortVersandType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StandortVersandType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="person" type="{http://spri.telekom.de/oss/v4/complex}PersonType"/&amp;gt;
 *           &amp;lt;element name="firma" type="{http://spri.telekom.de/oss/v4/complex}FirmaType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="strasse" type="{http://spri.telekom.de/oss/v4/complex}StrasseType"/&amp;gt;
 *         &amp;lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ort" type="{http://spri.telekom.de/oss/v4/complex}OrtType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandortVersandType", propOrder = {
    "person",
    "firma",
    "strasse",
    "land",
    "postleitzahl",
    "ort"
})
public class StandortVersandType {

    protected PersonType person;
    protected FirmaType firma;
    @XmlElement(required = true)
    protected StrasseType strasse;
    @XmlElement(defaultValue = "de")
    protected String land;
    @XmlElement(required = true)
    protected String postleitzahl;
    @XmlElement(required = true)
    protected OrtType ort;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link FirmaType }
     *     
     */
    public FirmaType getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmaType }
     *     
     */
    public void setFirma(FirmaType value) {
        this.firma = value;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link StrasseType }
     *     
     */
    public StrasseType getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrasseType }
     *     
     */
    public void setStrasse(StrasseType value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

    /**
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Sets the value of the postleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link OrtType }
     *     
     */
    public OrtType getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrtType }
     *     
     */
    public void setOrt(OrtType value) {
        this.ort = value;
    }

}
