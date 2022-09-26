
package de.telekom.spri.oss.v4.complex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.enm.MeldungstypType;


/**
 * &lt;p&gt;Java class for MessageTEQType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MessageTEQType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="meldungsTyp" type="{http://spri.telekom.de/oss/v4/enm}MeldungstypType"/&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="auftraggebernummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="meldungspositionen"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/complex}MeldungspositionOhneAttributeType" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageTEQType", propOrder = {
    "meldungsTyp",
    "externeAuftragsnummer",
    "auftraggebernummer",
    "meldungspositionen"
})
public class MessageTEQType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeldungstypType meldungsTyp;
    protected String externeAuftragsnummer;
    protected String auftraggebernummer;
    @XmlElement(required = true)
    protected MessageTEQType.Meldungspositionen meldungspositionen;

    /**
     * Gets the value of the meldungsTyp property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungstypType }
     *     
     */
    public MeldungstypType getMeldungsTyp() {
        return meldungsTyp;
    }

    /**
     * Sets the value of the meldungsTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungstypType }
     *     
     */
    public void setMeldungsTyp(MeldungstypType value) {
        this.meldungsTyp = value;
    }

    /**
     * Gets the value of the externeAuftragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExterneAuftragsnummer() {
        return externeAuftragsnummer;
    }

    /**
     * Sets the value of the externeAuftragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExterneAuftragsnummer(String value) {
        this.externeAuftragsnummer = value;
    }

    /**
     * Gets the value of the auftraggebernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuftraggebernummer() {
        return auftraggebernummer;
    }

    /**
     * Sets the value of the auftraggebernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuftraggebernummer(String value) {
        this.auftraggebernummer = value;
    }

    /**
     * Gets the value of the meldungspositionen property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTEQType.Meldungspositionen }
     *     
     */
    public MessageTEQType.Meldungspositionen getMeldungspositionen() {
        return meldungspositionen;
    }

    /**
     * Sets the value of the meldungspositionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTEQType.Meldungspositionen }
     *     
     */
    public void setMeldungspositionen(MessageTEQType.Meldungspositionen value) {
        this.meldungspositionen = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/complex}MeldungspositionOhneAttributeType" maxOccurs="unbounded"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Meldungspositionen {

        @XmlElement(required = true)
        protected List<MeldungspositionOhneAttributeType> position;

        /**
         * Gets the value of the position property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the position property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPosition().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MeldungspositionOhneAttributeType }
         * 
         * 
         */
        public List<MeldungspositionOhneAttributeType> getPosition() {
            if (position == null) {
                position = new ArrayList<MeldungspositionOhneAttributeType>();
            }
            return this.position;
        }

    }

}
