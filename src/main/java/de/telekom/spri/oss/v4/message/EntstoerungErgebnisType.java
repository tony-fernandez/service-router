
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for EntstoerungErgebnisType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EntstoerungErgebnisType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ergebnis"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="FehlerBeseitigt"/&amp;gt;
 *               &amp;lt;enumeration value="KeinenFehlerGefunden"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="entstoerZeitpunkt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="anmerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntstoerungErgebnisType", propOrder = {
    "ergebnis",
    "entstoerZeitpunkt",
    "anmerkung"
})
public class EntstoerungErgebnisType {

    @XmlElement(required = true)
    protected String ergebnis;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entstoerZeitpunkt;
    protected String anmerkung;

    /**
     * Gets the value of the ergebnis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErgebnis() {
        return ergebnis;
    }

    /**
     * Sets the value of the ergebnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErgebnis(String value) {
        this.ergebnis = value;
    }

    /**
     * Gets the value of the entstoerZeitpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntstoerZeitpunkt() {
        return entstoerZeitpunkt;
    }

    /**
     * Sets the value of the entstoerZeitpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntstoerZeitpunkt(XMLGregorianCalendar value) {
        this.entstoerZeitpunkt = value;
    }

    /**
     * Gets the value of the anmerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnmerkung() {
        return anmerkung;
    }

    /**
     * Sets the value of the anmerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnmerkung(String value) {
        this.anmerkung = value;
    }

}
