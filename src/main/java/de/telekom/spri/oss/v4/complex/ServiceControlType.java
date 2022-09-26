
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for ServiceControlType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceControlType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="zeitstempelVersand" type="{http://www.w3.org/2001/XMLSchema}time"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://spri.telekom.de/oss/v4/complex}VersionType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceControlType", propOrder = {
    "zeitstempelVersand",
    "version"
})
public class ServiceControlType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar zeitstempelVersand;
    @XmlElement(required = true)
    protected VersionType version;

    /**
     * Gets the value of the zeitstempelVersand property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeitstempelVersand() {
        return zeitstempelVersand;
    }

    /**
     * Sets the value of the zeitstempelVersand property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeitstempelVersand(XMLGregorianCalendar value) {
        this.zeitstempelVersand = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

}
