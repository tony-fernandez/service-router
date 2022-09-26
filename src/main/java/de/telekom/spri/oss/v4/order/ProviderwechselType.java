
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnlageMitTypType;
import de.telekom.spri.oss.v4.complex.GeschaeftsfallType;


/**
 * &lt;p&gt;Java class for ProviderwechselType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProviderwechselType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}GeschaeftsfallType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="vorabstimmungId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="anlage" type="{http://spri.telekom.de/oss/v4/complex}AnlageMitTypType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ansprechpartner" type="{http://spri.telekom.de/oss/v4/order}AnsprechpartnerType"/&amp;gt;
 *         &amp;lt;element name="termine" type="{http://spri.telekom.de/oss/v4/order}ProviderwechselTermineType"/&amp;gt;
 *         &amp;lt;element name="auftragsposition" type="{http://spri.telekom.de/oss/v4/order}AuftragspositionProviderwechselType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderwechselType", propOrder = {
    "lineId",
    "vorabstimmungId",
    "anlage",
    "ansprechpartner",
    "termine",
    "auftragsposition"
})
public class ProviderwechselType
    extends GeschaeftsfallType
{

    @XmlElement(required = true)
    protected String lineId;
    @XmlElement(required = true)
    protected String vorabstimmungId;
    protected AnlageMitTypType anlage;
    @XmlElement(required = true)
    protected AnsprechpartnerType ansprechpartner;
    @XmlElement(required = true)
    protected ProviderwechselTermineType termine;
    @XmlElement(required = true)
    protected AuftragspositionProviderwechselType auftragsposition;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the vorabstimmungId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorabstimmungId() {
        return vorabstimmungId;
    }

    /**
     * Sets the value of the vorabstimmungId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorabstimmungId(String value) {
        this.vorabstimmungId = value;
    }

    /**
     * Gets the value of the anlage property.
     * 
     * @return
     *     possible object is
     *     {@link AnlageMitTypType }
     *     
     */
    public AnlageMitTypType getAnlage() {
        return anlage;
    }

    /**
     * Sets the value of the anlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlageMitTypType }
     *     
     */
    public void setAnlage(AnlageMitTypType value) {
        this.anlage = value;
    }

    /**
     * Gets the value of the ansprechpartner property.
     * 
     * @return
     *     possible object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public AnsprechpartnerType getAnsprechpartner() {
        return ansprechpartner;
    }

    /**
     * Sets the value of the ansprechpartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsprechpartnerType }
     *     
     */
    public void setAnsprechpartner(AnsprechpartnerType value) {
        this.ansprechpartner = value;
    }

    /**
     * Gets the value of the termine property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderwechselTermineType }
     *     
     */
    public ProviderwechselTermineType getTermine() {
        return termine;
    }

    /**
     * Sets the value of the termine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderwechselTermineType }
     *     
     */
    public void setTermine(ProviderwechselTermineType value) {
        this.termine = value;
    }

    /**
     * Gets the value of the auftragsposition property.
     * 
     * @return
     *     possible object is
     *     {@link AuftragspositionProviderwechselType }
     *     
     */
    public AuftragspositionProviderwechselType getAuftragsposition() {
        return auftragsposition;
    }

    /**
     * Sets the value of the auftragsposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftragspositionProviderwechselType }
     *     
     */
    public void setAuftragsposition(AuftragspositionProviderwechselType value) {
        this.auftragsposition = value;
    }

}
