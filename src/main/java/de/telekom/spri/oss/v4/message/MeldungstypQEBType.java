
package de.telekom.spri.oss.v4.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MeldungstypQEBType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungstypQEBType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/message}MeldungstypAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="meldungsattribute" type="{http://spri.telekom.de/oss/v4/message}MeldungsattributeQEBType"/&amp;gt;
 *         &amp;lt;element name="meldungspositionen"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/message}MeldungspositionType" maxOccurs="unbounded"/&amp;gt;
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
@XmlType(name = "MeldungstypQEBType", propOrder = {
    "meldungsattribute",
    "meldungspositionen"
})
public class MeldungstypQEBType
    extends MeldungstypAbstractType
{

    @XmlElement(required = true)
    protected MeldungsattributeQEBType meldungsattribute;
    @XmlElement(required = true)
    protected MeldungstypQEBType.Meldungspositionen meldungspositionen;

    /**
     * Gets the value of the meldungsattribute property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungsattributeQEBType }
     *     
     */
    public MeldungsattributeQEBType getMeldungsattribute() {
        return meldungsattribute;
    }

    /**
     * Sets the value of the meldungsattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungsattributeQEBType }
     *     
     */
    public void setMeldungsattribute(MeldungsattributeQEBType value) {
        this.meldungsattribute = value;
    }

    /**
     * Gets the value of the meldungspositionen property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungstypQEBType.Meldungspositionen }
     *     
     */
    public MeldungstypQEBType.Meldungspositionen getMeldungspositionen() {
        return meldungspositionen;
    }

    /**
     * Sets the value of the meldungspositionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungstypQEBType.Meldungspositionen }
     *     
     */
    public void setMeldungspositionen(MeldungstypQEBType.Meldungspositionen value) {
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
     *         &amp;lt;element name="position" type="{http://spri.telekom.de/oss/v4/message}MeldungspositionType" maxOccurs="unbounded"/&amp;gt;
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
        protected List<MeldungspositionType> position;

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
         * {@link MeldungspositionType }
         * 
         * 
         */
        public List<MeldungspositionType> getPosition() {
            if (position == null) {
                position = new ArrayList<MeldungspositionType>();
            }
            return this.position;
        }

    }

}
