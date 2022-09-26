
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FirmaMitTelefonType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FirmaMitTelefonType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}FirmaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="telefonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mobilfunknummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirmaMitTelefonType", propOrder = {
    "telefonnummer",
    "mobilfunknummer"
})
public class FirmaMitTelefonType
    extends FirmaType
{

    protected String telefonnummer;
    protected String mobilfunknummer;

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

}
