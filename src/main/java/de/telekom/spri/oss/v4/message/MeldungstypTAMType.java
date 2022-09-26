
package de.telekom.spri.oss.v4.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MeldungstypTAMType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungstypTAMType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungstypAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="meldungsattribute" type="{http://spri.telekom.de/oss/v4/message}MeldungsattributeTAMType"/&amp;gt;
 *         &amp;lt;element name="meldungspositionen"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/message}MeldungspositionOhneAttributeMitWitaErweiterungType" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungstypTAMType", propOrder = {
    "meldungsattribute",
    "meldungspositionen"
})
public class MeldungstypTAMType
    extends MeldungstypAbstractType
{

    @XmlElement(required = true)
    protected MeldungsattributeTAMType meldungsattribute;
    @XmlElement(required = true)
    protected MeldungstypTAMType.Meldungspositionen meldungspositionen;

    /**
     * Gets the value of the meldungsattribute property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungsattributeTAMType }
     *     
     */
    public MeldungsattributeTAMType getMeldungsattribute() {
        return meldungsattribute;
    }

    /**
     * Sets the value of the meldungsattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungsattributeTAMType }
     *     
     */
    public void setMeldungsattribute(MeldungsattributeTAMType value) {
        this.meldungsattribute = value;
    }

    /**
     * Gets the value of the meldungspositionen property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungstypTAMType.Meldungspositionen }
     *     
     */
    public MeldungstypTAMType.Meldungspositionen getMeldungspositionen() {
        return meldungspositionen;
    }

    /**
     * Sets the value of the meldungspositionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungstypTAMType.Meldungspositionen }
     *     
     */
    public void setMeldungspositionen(MeldungstypTAMType.Meldungspositionen value) {
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
     *         &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/message}MeldungspositionOhneAttributeMitWitaErweiterungType" maxOccurs="unbounded"/&amp;gt;
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
        protected List<MeldungspositionOhneAttributeMitWitaErweiterungType> position;

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
         * {@link MeldungspositionOhneAttributeMitWitaErweiterungType }
         * 
         * 
         */
        public List<MeldungspositionOhneAttributeMitWitaErweiterungType> getPosition() {
            if (position == null) {
                position = new ArrayList<MeldungspositionOhneAttributeMitWitaErweiterungType>();
            }
            return this.position;
        }

    }

}
