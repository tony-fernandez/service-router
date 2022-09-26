
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for ProviderwechselBestaetigungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProviderwechselBestaetigungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="providername" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="uebernahmedatumVerbindlich" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderwechselBestaetigungType", propOrder = {
    "providername",
    "uebernahmedatumVerbindlich"
})
public class ProviderwechselBestaetigungType {

    @XmlElement(required = true)
    protected String providername;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uebernahmedatumVerbindlich;

    /**
     * Gets the value of the providername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidername() {
        return providername;
    }

    /**
     * Sets the value of the providername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidername(String value) {
        this.providername = value;
    }

    /**
     * Gets the value of the uebernahmedatumVerbindlich property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUebernahmedatumVerbindlich() {
        return uebernahmedatumVerbindlich;
    }

    /**
     * Sets the value of the uebernahmedatumVerbindlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUebernahmedatumVerbindlich(XMLGregorianCalendar value) {
        this.uebernahmedatumVerbindlich = value;
    }

}
