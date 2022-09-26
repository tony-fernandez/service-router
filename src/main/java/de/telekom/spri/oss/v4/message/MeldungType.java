
package de.telekom.spri.oss.v4.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MeldungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeldungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="auftragstyp" type="{http://spri.telekom.de/oss/v4/message}AuftragstypType"/&amp;gt;
 *         &amp;lt;element name="meldungstyp" type="{http://spri.telekom.de/oss/v4/message}MeldungstypAbstractType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldungType", propOrder = {
    "auftragstyp",
    "meldungstyp"
})
public class MeldungType {

    @XmlElement(required = true)
    protected AuftragstypType auftragstyp;
    @XmlElement(required = true)
    protected MeldungstypAbstractType meldungstyp;

    /**
     * Gets the value of the auftragstyp property.
     * 
     * @return
     *     possible object is
     *     {@link AuftragstypType }
     *     
     */
    public AuftragstypType getAuftragstyp() {
        return auftragstyp;
    }

    /**
     * Sets the value of the auftragstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftragstypType }
     *     
     */
    public void setAuftragstyp(AuftragstypType value) {
        this.auftragstyp = value;
    }

    /**
     * Gets the value of the meldungstyp property.
     * 
     * @return
     *     possible object is
     *     {@link MeldungstypAbstractType }
     *     
     */
    public MeldungstypAbstractType getMeldungstyp() {
        return meldungstyp;
    }

    /**
     * Sets the value of the meldungstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungstypAbstractType }
     *     
     */
    public void setMeldungstyp(MeldungstypAbstractType value) {
        this.meldungstyp = value;
    }

}
