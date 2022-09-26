
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StandortType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StandortType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="person" type="{http://spri.telekom.de/oss/v4/complex}PersonMitTelefonType"/&amp;gt;
 *           &amp;lt;element name="firma" type="{http://spri.telekom.de/oss/v4/complex}FirmaMitTelefonType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="strasse" type="{http://spri.telekom.de/oss/v4/complex}StrasseType"/&amp;gt;
 *         &amp;lt;element name="gebaeudeteil" type="{http://spri.telekom.de/oss/v4/complex}GebaeudeteilType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "StandortType", propOrder = {
    "person",
    "firma",
    "strasse",
    "gebaeudeteil",
    "land",
    "postleitzahl",
    "ort"
})
@XmlSeeAlso({
    StandortAType.class
})
public class StandortType {

    protected PersonMitTelefonType person;
    protected FirmaMitTelefonType firma;
    @XmlElement(required = true)
    protected StrasseType strasse;
    protected GebaeudeteilType gebaeudeteil;
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
     *     {@link PersonMitTelefonType }
     *     
     */
    public PersonMitTelefonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMitTelefonType }
     *     
     */
    public void setPerson(PersonMitTelefonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link FirmaMitTelefonType }
     *     
     */
    public FirmaMitTelefonType getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmaMitTelefonType }
     *     
     */
    public void setFirma(FirmaMitTelefonType value) {
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
     * Gets the value of the gebaeudeteil property.
     * 
     * @return
     *     possible object is
     *     {@link GebaeudeteilType }
     *     
     */
    public GebaeudeteilType getGebaeudeteil() {
        return gebaeudeteil;
    }

    /**
     * Sets the value of the gebaeudeteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link GebaeudeteilType }
     *     
     */
    public void setGebaeudeteil(GebaeudeteilType value) {
        this.gebaeudeteil = value;
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
