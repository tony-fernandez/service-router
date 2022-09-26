
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnsprechpartnerESTType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnsprechpartnerESTType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="anrede" type="{http://spri.telekom.de/oss/v4/enm}AnredePersonType"/&amp;gt;
 *         &amp;lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="telefonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mobilfunknummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="faxnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="emailadresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kontaktaufnahmeErwuenscht" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnsprechpartnerESTType", propOrder = {
    "anrede",
    "vorname",
    "nachname",
    "telefonnummer",
    "mobilfunknummer",
    "faxnummer",
    "emailadresse",
    "kontaktaufnahmeErwuenscht"
})
public class AnsprechpartnerESTType {

    @XmlElement(required = true)
    protected String anrede;
    @XmlElement(required = true)
    protected String vorname;
    @XmlElement(required = true)
    protected String nachname;
    protected String telefonnummer;
    protected String mobilfunknummer;
    protected String faxnummer;
    protected String emailadresse;
    protected boolean kontaktaufnahmeErwuenscht;

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

    /**
     * Gets the value of the telefonnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonnummer() {
        return telefonnummer;
    }

    /**
     * Sets the value of the telefonnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonnummer(String value) {
        this.telefonnummer = value;
    }

    /**
     * Gets the value of the mobilfunknummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilfunknummer() {
        return mobilfunknummer;
    }

    /**
     * Sets the value of the mobilfunknummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilfunknummer(String value) {
        this.mobilfunknummer = value;
    }

    /**
     * Gets the value of the faxnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxnummer() {
        return faxnummer;
    }

    /**
     * Sets the value of the faxnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxnummer(String value) {
        this.faxnummer = value;
    }

    /**
     * Gets the value of the emailadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailadresse() {
        return emailadresse;
    }

    /**
     * Sets the value of the emailadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailadresse(String value) {
        this.emailadresse = value;
    }

    /**
     * Gets the value of the kontaktaufnahmeErwuenscht property.
     * 
     */
    public boolean isKontaktaufnahmeErwuenscht() {
        return kontaktaufnahmeErwuenscht;
    }

    /**
     * Sets the value of the kontaktaufnahmeErwuenscht property.
     * 
     */
    public void setKontaktaufnahmeErwuenscht(boolean value) {
        this.kontaktaufnahmeErwuenscht = value;
    }

}
