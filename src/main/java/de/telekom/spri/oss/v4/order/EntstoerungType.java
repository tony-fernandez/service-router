
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.AnlageMitTypType;
import de.telekom.spri.oss.v4.complex.AnsprechpartnerESTType;
import de.telekom.spri.oss.v4.complex.GeschaeftsfallType;


/**
 * &lt;p&gt;Java class for EntstoerungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EntstoerungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}GeschaeftsfallType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="anlage" type="{http://spri.telekom.de/oss/v4/complex}AnlageMitTypType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ansprechpartner" type="{http://spri.telekom.de/oss/v4/order}AnsprechpartnerType"/&amp;gt;
 *         &amp;lt;element name="kontaktEndkunde" type="{http://spri.telekom.de/oss/v4/complex}AnsprechpartnerESTType"/&amp;gt;
 *         &amp;lt;element name="termine" type="{http://spri.telekom.de/oss/v4/order}EntstoerungTermineType"/&amp;gt;
 *         &amp;lt;element name="stoerungsNrAuftraggeber" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="reklamation" type="{http://spri.telekom.de/oss/v4/order}EntstoerungsReklamationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vorpruefungErfolgt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="stoerungsbeschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="expressentstoerung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntstoerungType", propOrder = {
    "vertragsnummer",
    "lineId",
    "anlage",
    "ansprechpartner",
    "kontaktEndkunde",
    "termine",
    "stoerungsNrAuftraggeber",
    "reklamation",
    "vorpruefungErfolgt",
    "stoerungsbeschreibung",
    "expressentstoerung"
})
public class EntstoerungType
    extends GeschaeftsfallType
{

    @XmlElement(required = true)
    protected String vertragsnummer;
    @XmlElement(required = true)
    protected String lineId;
    protected AnlageMitTypType anlage;
    @XmlElement(required = true)
    protected AnsprechpartnerType ansprechpartner;
    @XmlElement(required = true)
    protected AnsprechpartnerESTType kontaktEndkunde;
    @XmlElement(required = true)
    protected EntstoerungTermineType termine;
    @XmlElement(required = true)
    protected String stoerungsNrAuftraggeber;
    protected EntstoerungsReklamationType reklamation;
    protected boolean vorpruefungErfolgt;
    @XmlElement(required = true)
    protected String stoerungsbeschreibung;
    protected Boolean expressentstoerung;

    /**
     * Gets the value of the vertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertragsnummer() {
        return vertragsnummer;
    }

    /**
     * Sets the value of the vertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertragsnummer(String value) {
        this.vertragsnummer = value;
    }

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
     * Gets the value of the kontaktEndkunde property.
     * 
     * @return
     *     possible object is
     *     {@link AnsprechpartnerESTType }
     *     
     */
    public AnsprechpartnerESTType getKontaktEndkunde() {
        return kontaktEndkunde;
    }

    /**
     * Sets the value of the kontaktEndkunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsprechpartnerESTType }
     *     
     */
    public void setKontaktEndkunde(AnsprechpartnerESTType value) {
        this.kontaktEndkunde = value;
    }

    /**
     * Gets the value of the termine property.
     * 
     * @return
     *     possible object is
     *     {@link EntstoerungTermineType }
     *     
     */
    public EntstoerungTermineType getTermine() {
        return termine;
    }

    /**
     * Sets the value of the termine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntstoerungTermineType }
     *     
     */
    public void setTermine(EntstoerungTermineType value) {
        this.termine = value;
    }

    /**
     * Gets the value of the stoerungsNrAuftraggeber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoerungsNrAuftraggeber() {
        return stoerungsNrAuftraggeber;
    }

    /**
     * Sets the value of the stoerungsNrAuftraggeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoerungsNrAuftraggeber(String value) {
        this.stoerungsNrAuftraggeber = value;
    }

    /**
     * Gets the value of the reklamation property.
     * 
     * @return
     *     possible object is
     *     {@link EntstoerungsReklamationType }
     *     
     */
    public EntstoerungsReklamationType getReklamation() {
        return reklamation;
    }

    /**
     * Sets the value of the reklamation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntstoerungsReklamationType }
     *     
     */
    public void setReklamation(EntstoerungsReklamationType value) {
        this.reklamation = value;
    }

    /**
     * Gets the value of the vorpruefungErfolgt property.
     * 
     */
    public boolean isVorpruefungErfolgt() {
        return vorpruefungErfolgt;
    }

    /**
     * Sets the value of the vorpruefungErfolgt property.
     * 
     */
    public void setVorpruefungErfolgt(boolean value) {
        this.vorpruefungErfolgt = value;
    }

    /**
     * Gets the value of the stoerungsbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoerungsbeschreibung() {
        return stoerungsbeschreibung;
    }

    /**
     * Sets the value of the stoerungsbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoerungsbeschreibung(String value) {
        this.stoerungsbeschreibung = value;
    }

    /**
     * Gets the value of the expressentstoerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressentstoerung() {
        return expressentstoerung;
    }

    /**
     * Sets the value of the expressentstoerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressentstoerung(Boolean value) {
        this.expressentstoerung = value;
    }

}
