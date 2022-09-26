
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import de.telekom.spri.oss.v4.complex.AuftraggeberType;
import de.telekom.spri.oss.v4.complex.GeschaeftsfallType;
import de.telekom.spri.oss.v4.complex.KennerType;
import de.telekom.spri.oss.v4.enm.AenderungskennzeichenType;
import de.telekom.spri.oss.v4.enm.GeschaeftsfallArtType;


/**
 * &lt;p&gt;Java class for AuftragType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuftragType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="externeAuftragsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="auftraggeber" type="{http://spri.telekom.de/oss/v4/complex}AuftraggeberType"/&amp;gt;
 *         &amp;lt;element name="besteller" type="{http://spri.telekom.de/oss/v4/complex}AuftraggeberType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="geschaeftsfall" type="{http://spri.telekom.de/oss/v4/complex}GeschaeftsfallType"/&amp;gt;
 *         &amp;lt;element name="geschaeftsfallArt" type="{http://spri.telekom.de/oss/v4/enm}GeschaeftsfallArtType"/&amp;gt;
 *         &amp;lt;element name="aenderungskennzeichen" type="{http://spri.telekom.de/oss/v4/enm}AenderungskennzeichenType"/&amp;gt;
 *         &amp;lt;element name="terminNeu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kenner" type="{http://spri.telekom.de/oss/v4/complex}KennerType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuftragType", propOrder = {
    "externeAuftragsnummer",
    "auftraggeber",
    "besteller",
    "geschaeftsfall",
    "geschaeftsfallArt",
    "aenderungskennzeichen",
    "terminNeu",
    "kenner"
})
public class AuftragType {

    @XmlElement(required = true)
    protected String externeAuftragsnummer;
    @XmlElement(required = true)
    protected AuftraggeberType auftraggeber;
    protected AuftraggeberType besteller;
    @XmlElement(required = true)
    protected GeschaeftsfallType geschaeftsfall;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeschaeftsfallArtType geschaeftsfallArt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AenderungskennzeichenType aenderungskennzeichen;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminNeu;
    protected KennerType kenner;

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
     * Gets the value of the auftraggeber property.
     * 
     * @return
     *     possible object is
     *     {@link AuftraggeberType }
     *     
     */
    public AuftraggeberType getAuftraggeber() {
        return auftraggeber;
    }

    /**
     * Sets the value of the auftraggeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftraggeberType }
     *     
     */
    public void setAuftraggeber(AuftraggeberType value) {
        this.auftraggeber = value;
    }

    /**
     * Gets the value of the besteller property.
     * 
     * @return
     *     possible object is
     *     {@link AuftraggeberType }
     *     
     */
    public AuftraggeberType getBesteller() {
        return besteller;
    }

    /**
     * Sets the value of the besteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftraggeberType }
     *     
     */
    public void setBesteller(AuftraggeberType value) {
        this.besteller = value;
    }

    /**
     * Gets the value of the geschaeftsfall property.
     * 
     * @return
     *     possible object is
     *     {@link GeschaeftsfallType }
     *     
     */
    public GeschaeftsfallType getGeschaeftsfall() {
        return geschaeftsfall;
    }

    /**
     * Sets the value of the geschaeftsfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschaeftsfallType }
     *     
     */
    public void setGeschaeftsfall(GeschaeftsfallType value) {
        this.geschaeftsfall = value;
    }

    /**
     * Gets the value of the geschaeftsfallArt property.
     * 
     * @return
     *     possible object is
     *     {@link GeschaeftsfallArtType }
     *     
     */
    public GeschaeftsfallArtType getGeschaeftsfallArt() {
        return geschaeftsfallArt;
    }

    /**
     * Sets the value of the geschaeftsfallArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschaeftsfallArtType }
     *     
     */
    public void setGeschaeftsfallArt(GeschaeftsfallArtType value) {
        this.geschaeftsfallArt = value;
    }

    /**
     * Gets the value of the aenderungskennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link AenderungskennzeichenType }
     *     
     */
    public AenderungskennzeichenType getAenderungskennzeichen() {
        return aenderungskennzeichen;
    }

    /**
     * Sets the value of the aenderungskennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AenderungskennzeichenType }
     *     
     */
    public void setAenderungskennzeichen(AenderungskennzeichenType value) {
        this.aenderungskennzeichen = value;
    }

    /**
     * Gets the value of the terminNeu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminNeu() {
        return terminNeu;
    }

    /**
     * Sets the value of the terminNeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminNeu(XMLGregorianCalendar value) {
        this.terminNeu = value;
    }

    /**
     * Gets the value of the kenner property.
     * 
     * @return
     *     possible object is
     *     {@link KennerType }
     *     
     */
    public KennerType getKenner() {
        return kenner;
    }

    /**
     * Sets the value of the kenner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KennerType }
     *     
     */
    public void setKenner(KennerType value) {
        this.kenner = value;
    }

}
