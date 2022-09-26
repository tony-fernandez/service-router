
package de.telekom.spri.oss.v4.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for WholesaleMessageType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="WholesaleMessageType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="zeitstempel" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="majorRelease" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="minorRelease" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="signaturId" type="{http://spri.telekom.de/oss/v4/envelope}SignaturIdType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleMessageType", propOrder = {
    "zeitstempel",
    "majorRelease",
    "minorRelease",
    "signaturId"
})
@XmlSeeAlso({
    WholesaleResponseType.class,
    WholesaleRequestType.class
})
public abstract class WholesaleMessageType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zeitstempel;
    @XmlElement(required = true)
    protected String majorRelease;
    @XmlElement(required = true)
    protected String minorRelease;
    @XmlElement(required = true)
    protected SignaturIdType signaturId;

    /**
     * Gets the value of the zeitstempel property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeitstempel() {
        return zeitstempel;
    }

    /**
     * Sets the value of the zeitstempel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeitstempel(XMLGregorianCalendar value) {
        this.zeitstempel = value;
    }

    /**
     * Gets the value of the majorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorRelease() {
        return majorRelease;
    }

    /**
     * Sets the value of the majorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorRelease(String value) {
        this.majorRelease = value;
    }

    /**
     * Gets the value of the minorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorRelease() {
        return minorRelease;
    }

    /**
     * Sets the value of the minorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorRelease(String value) {
        this.minorRelease = value;
    }

    /**
     * Gets the value of the signaturId property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturIdType }
     *     
     */
    public SignaturIdType getSignaturId() {
        return signaturId;
    }

    /**
     * Sets the value of the signaturId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturIdType }
     *     
     */
    public void setSignaturId(SignaturIdType value) {
        this.signaturId = value;
    }

}
