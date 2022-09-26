
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PersonType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PersonType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="anrede" type="{http://spri.telekom.de/oss/v4/enm}AnredePersonType"/&amp;gt;
 *         &amp;lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "anrede",
    "vorname",
    "nachname"
})
@XmlSeeAlso({
    PersonMitTelefonType.class,
    AnsprechpartnerType.class
})
public class PersonType {

    @XmlElement(required = true)
    protected String anrede;
    protected String vorname;
    @XmlElement(required = true)
    protected String nachname;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the nachname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

}
