
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.DokumenttypType;
import de.xconnect.bus.api.CustomAnlageTyp;


/**
 * &lt;p&gt;Java class for AnlageType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnlageType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{api.bus.xconnect.de}CustomAnlageTyp"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="dateiname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="dateityp" type="{http://spri.telekom.de/oss/v4/enm}DokumenttypType"/&amp;gt;
 *         &amp;lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="inhalt" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlageType", propOrder = {
    "dateiname",
    "dateityp",
    "beschreibung",
    "inhalt"
})
@XmlSeeAlso({
    AnlageMitTypType.class
})
public class AnlageType
    extends CustomAnlageTyp
{

    @XmlElement(required = true)
    protected String dateiname;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DokumenttypType dateityp;
    protected String beschreibung;
    @XmlElement(required = true)
    protected byte[] inhalt;

    /**
     * Gets the value of the dateiname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateiname() {
        return dateiname;
    }

    /**
     * Sets the value of the dateiname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateiname(String value) {
        this.dateiname = value;
    }

    /**
     * Gets the value of the dateityp property.
     * 
     * @return
     *     possible object is
     *     {@link DokumenttypType }
     *     
     */
    public DokumenttypType getDateityp() {
        return dateityp;
    }

    /**
     * Sets the value of the dateityp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumenttypType }
     *     
     */
    public void setDateityp(DokumenttypType value) {
        this.dateityp = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the inhalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInhalt() {
        return inhalt;
    }

    /**
     * Sets the value of the inhalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInhalt(byte[] value) {
        this.inhalt = value;
    }

}
