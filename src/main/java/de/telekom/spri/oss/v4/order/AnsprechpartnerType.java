
package de.telekom.spri.oss.v4.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnsprechpartnerMitRolleType;


/**
 * &lt;p&gt;Java class for AnsprechpartnerType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnsprechpartnerType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="auftragsmanagement" type="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerType"/&amp;gt;
 *         &amp;lt;element name="ansprechpartner" type="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerMitRolleType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnsprechpartnerType", propOrder = {
    "auftragsmanagement",
    "ansprechpartner"
})
public class AnsprechpartnerType {

    @XmlElement(required = true)
    protected de.telekom.spri.oss.v4.complex.AnsprechpartnerType auftragsmanagement;
    @XmlElement(nillable = true)
    protected List<AnsprechpartnerMitRolleType> ansprechpartner;

    /**
     * Gets the value of the auftragsmanagement property.
     * 
     * @return
     *     possible object is
     *     {@link de.telekom.spri.oss.v4.complex.AnsprechpartnerType }
     *     
     */
    public de.telekom.spri.oss.v4.complex.AnsprechpartnerType getAuftragsmanagement() {
        return auftragsmanagement;
    }

    /**
     * Sets the value of the auftragsmanagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link de.telekom.spri.oss.v4.complex.AnsprechpartnerType }
     *     
     */
    public void setAuftragsmanagement(de.telekom.spri.oss.v4.complex.AnsprechpartnerType value) {
        this.auftragsmanagement = value;
    }

    /**
     * Gets the value of the ansprechpartner property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ansprechpartner property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnsprechpartner().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AnsprechpartnerMitRolleType }
     * 
     * 
     */
    public List<AnsprechpartnerMitRolleType> getAnsprechpartner() {
        if (ansprechpartner == null) {
            ansprechpartner = new ArrayList<AnsprechpartnerMitRolleType>();
        }
        return this.ansprechpartner;
    }

}
