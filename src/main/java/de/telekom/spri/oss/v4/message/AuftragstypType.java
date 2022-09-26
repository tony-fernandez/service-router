
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.AenderungskennzeichenType;
import de.telekom.spri.oss.v4.enm.GeschaeftsfallArtType;
import de.telekom.spri.oss.v4.enm.GeschaeftsfallMeldungType;


/**
 * &lt;p&gt;Java class for AuftragstypType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuftragstypType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="geschaeftsfall" type="{http://spri.telekom.de/oss/v4/enm}GeschaeftsfallMeldungType"/&amp;gt;
 *         &amp;lt;element name="aenderungsKennzeichen" type="{http://spri.telekom.de/oss/v4/enm}AenderungskennzeichenType"/&amp;gt;
 *         &amp;lt;element name="geschaeftsfallart" type="{http://spri.telekom.de/oss/v4/enm}GeschaeftsfallArtType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuftragstypType", propOrder = {
    "geschaeftsfall",
    "aenderungsKennzeichen",
    "geschaeftsfallart"
})
public class AuftragstypType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeschaeftsfallMeldungType geschaeftsfall;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AenderungskennzeichenType aenderungsKennzeichen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeschaeftsfallArtType geschaeftsfallart;

    /**
     * Gets the value of the geschaeftsfall property.
     * 
     * @return
     *     possible object is
     *     {@link GeschaeftsfallMeldungType }
     *     
     */
    public GeschaeftsfallMeldungType getGeschaeftsfall() {
        return geschaeftsfall;
    }

    /**
     * Sets the value of the geschaeftsfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschaeftsfallMeldungType }
     *     
     */
    public void setGeschaeftsfall(GeschaeftsfallMeldungType value) {
        this.geschaeftsfall = value;
    }

    /**
     * Gets the value of the aenderungsKennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link AenderungskennzeichenType }
     *     
     */
    public AenderungskennzeichenType getAenderungsKennzeichen() {
        return aenderungsKennzeichen;
    }

    /**
     * Sets the value of the aenderungsKennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AenderungskennzeichenType }
     *     
     */
    public void setAenderungsKennzeichen(AenderungskennzeichenType value) {
        this.aenderungsKennzeichen = value;
    }

    /**
     * Gets the value of the geschaeftsfallart property.
     * 
     * @return
     *     possible object is
     *     {@link GeschaeftsfallArtType }
     *     
     */
    public GeschaeftsfallArtType getGeschaeftsfallart() {
        return geschaeftsfallart;
    }

    /**
     * Sets the value of the geschaeftsfallart property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschaeftsfallArtType }
     *     
     */
    public void setGeschaeftsfallart(GeschaeftsfallArtType value) {
        this.geschaeftsfallart = value;
    }

}
