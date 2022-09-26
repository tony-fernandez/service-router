
package de.telekom.spri.oss.v4.fttx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.FTTxVormieterType;
import de.telekom.spri.oss.v4.complex.MontageleistungType;
import de.telekom.spri.oss.v4.complex.StandortAType;
import de.telekom.spri.oss.v4.complex.StandortVersandType;
import de.telekom.spri.oss.v4.order.BereitstellungProduktType;


/**
 * &lt;p&gt;Java class for FTTXBereitstellungType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTXBereitstellungType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/order}BereitstellungProduktType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="standortA" type="{http://spri.telekom.de/oss/v4/complex}StandortAType"/&amp;gt;
 *         &amp;lt;element name="standortVersand" type="{http://spri.telekom.de/oss/v4/complex}StandortVersandType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vormieter" type="{http://spri.telekom.de/oss/v4/complex}FTTxVormieterType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="montageleistung" type="{http://spri.telekom.de/oss/v4/complex}MontageleistungType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="witaVertragsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="technologie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="bestandssuche" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="rufnummernPortierung" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;choice minOccurs="0"&amp;gt;
 *                     &amp;lt;element name="anlagenanschluss"&amp;gt;
 *                       &amp;lt;complexType&amp;gt;
 *                         &amp;lt;complexContent&amp;gt;
 *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                             &amp;lt;sequence&amp;gt;
 *                               &amp;lt;element name="onkzDurchwahlAbfragestelle"&amp;gt;
 *                                 &amp;lt;complexType&amp;gt;
 *                                   &amp;lt;complexContent&amp;gt;
 *                                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                       &amp;lt;sequence&amp;gt;
 *                                         &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                         &amp;lt;element name="durchwahlnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                         &amp;lt;element name="abfragestelle" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                       &amp;lt;/sequence&amp;gt;
 *                                     &amp;lt;/restriction&amp;gt;
 *                                   &amp;lt;/complexContent&amp;gt;
 *                                 &amp;lt;/complexType&amp;gt;
 *                               &amp;lt;/element&amp;gt;
 *                               &amp;lt;element name="zuPortierenderRufnummernblock" maxOccurs="unbounded"&amp;gt;
 *                                 &amp;lt;complexType&amp;gt;
 *                                   &amp;lt;complexContent&amp;gt;
 *                                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                       &amp;lt;sequence&amp;gt;
 *                                         &amp;lt;element name="rnrBlockVon" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                         &amp;lt;element name="rnrBlockBis" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                       &amp;lt;/sequence&amp;gt;
 *                                     &amp;lt;/restriction&amp;gt;
 *                                   &amp;lt;/complexContent&amp;gt;
 *                                 &amp;lt;/complexType&amp;gt;
 *                               &amp;lt;/element&amp;gt;
 *                             &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;/restriction&amp;gt;
 *                         &amp;lt;/complexContent&amp;gt;
 *                       &amp;lt;/complexType&amp;gt;
 *                     &amp;lt;/element&amp;gt;
 *                     &amp;lt;element name="einzelanschluss"&amp;gt;
 *                       &amp;lt;complexType&amp;gt;
 *                         &amp;lt;complexContent&amp;gt;
 *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                             &amp;lt;sequence&amp;gt;
 *                               &amp;lt;choice minOccurs="0"&amp;gt;
 *                                 &amp;lt;element name="rufnummernliste"&amp;gt;
 *                                   &amp;lt;complexType&amp;gt;
 *                                     &amp;lt;complexContent&amp;gt;
 *                                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                         &amp;lt;sequence&amp;gt;
 *                                           &amp;lt;element name="zuPortierendeOnkzRnr" maxOccurs="unbounded"&amp;gt;
 *                                             &amp;lt;complexType&amp;gt;
 *                                               &amp;lt;complexContent&amp;gt;
 *                                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                                   &amp;lt;sequence&amp;gt;
 *                                                     &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                                     &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                                                   &amp;lt;/sequence&amp;gt;
 *                                                 &amp;lt;/restriction&amp;gt;
 *                                               &amp;lt;/complexContent&amp;gt;
 *                                             &amp;lt;/complexType&amp;gt;
 *                                           &amp;lt;/element&amp;gt;
 *                                         &amp;lt;/sequence&amp;gt;
 *                                       &amp;lt;/restriction&amp;gt;
 *                                     &amp;lt;/complexContent&amp;gt;
 *                                   &amp;lt;/complexType&amp;gt;
 *                                 &amp;lt;/element&amp;gt;
 *                                 &amp;lt;element name="alleRufnummern"&amp;gt;
 *                                   &amp;lt;simpleType&amp;gt;
 *                                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                       &amp;lt;enumeration value="J"/&amp;gt;
 *                                     &amp;lt;/restriction&amp;gt;
 *                                   &amp;lt;/simpleType&amp;gt;
 *                                 &amp;lt;/element&amp;gt;
 *                               &amp;lt;/choice&amp;gt;
 *                             &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;/restriction&amp;gt;
 *                         &amp;lt;/complexContent&amp;gt;
 *                       &amp;lt;/complexType&amp;gt;
 *                     &amp;lt;/element&amp;gt;
 *                   &amp;lt;/choice&amp;gt;
 *                   &amp;lt;element name="portierungskenner" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="abgebenderEKP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTTXBereitstellungType", propOrder = {
    "standortA",
    "standortVersand",
    "vormieter",
    "montageleistung",
    "witaVertragsnummer",
    "technologie",
    "bestandssuche",
    "rufnummernPortierung",
    "abgebenderEKP"
})
public class FTTXBereitstellungType
    extends BereitstellungProduktType
{

    @XmlElement(required = true)
    protected StandortAType standortA;
    protected StandortVersandType standortVersand;
    protected FTTxVormieterType vormieter;
    protected MontageleistungType montageleistung;
    protected String witaVertragsnummer;
    protected String technologie;
    protected FTTXBereitstellungType.Bestandssuche bestandssuche;
    protected FTTXBereitstellungType.RufnummernPortierung rufnummernPortierung;
    protected Boolean abgebenderEKP;

    /**
     * Gets the value of the standortA property.
     * 
     * @return
     *     possible object is
     *     {@link StandortAType }
     *     
     */
    public StandortAType getStandortA() {
        return standortA;
    }

    /**
     * Sets the value of the standortA property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandortAType }
     *     
     */
    public void setStandortA(StandortAType value) {
        this.standortA = value;
    }

    /**
     * Gets the value of the standortVersand property.
     * 
     * @return
     *     possible object is
     *     {@link StandortVersandType }
     *     
     */
    public StandortVersandType getStandortVersand() {
        return standortVersand;
    }

    /**
     * Sets the value of the standortVersand property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandortVersandType }
     *     
     */
    public void setStandortVersand(StandortVersandType value) {
        this.standortVersand = value;
    }

    /**
     * Gets the value of the vormieter property.
     * 
     * @return
     *     possible object is
     *     {@link FTTxVormieterType }
     *     
     */
    public FTTxVormieterType getVormieter() {
        return vormieter;
    }

    /**
     * Sets the value of the vormieter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTxVormieterType }
     *     
     */
    public void setVormieter(FTTxVormieterType value) {
        this.vormieter = value;
    }

    /**
     * Gets the value of the montageleistung property.
     * 
     * @return
     *     possible object is
     *     {@link MontageleistungType }
     *     
     */
    public MontageleistungType getMontageleistung() {
        return montageleistung;
    }

    /**
     * Sets the value of the montageleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link MontageleistungType }
     *     
     */
    public void setMontageleistung(MontageleistungType value) {
        this.montageleistung = value;
    }

    /**
     * Gets the value of the witaVertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitaVertragsnummer() {
        return witaVertragsnummer;
    }

    /**
     * Sets the value of the witaVertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitaVertragsnummer(String value) {
        this.witaVertragsnummer = value;
    }

    /**
     * Gets the value of the technologie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologie() {
        return technologie;
    }

    /**
     * Sets the value of the technologie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologie(String value) {
        this.technologie = value;
    }

    /**
     * Gets the value of the bestandssuche property.
     * 
     * @return
     *     possible object is
     *     {@link FTTXBereitstellungType.Bestandssuche }
     *     
     */
    public FTTXBereitstellungType.Bestandssuche getBestandssuche() {
        return bestandssuche;
    }

    /**
     * Sets the value of the bestandssuche property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTXBereitstellungType.Bestandssuche }
     *     
     */
    public void setBestandssuche(FTTXBereitstellungType.Bestandssuche value) {
        this.bestandssuche = value;
    }

    /**
     * Gets the value of the rufnummernPortierung property.
     * 
     * @return
     *     possible object is
     *     {@link FTTXBereitstellungType.RufnummernPortierung }
     *     
     */
    public FTTXBereitstellungType.RufnummernPortierung getRufnummernPortierung() {
        return rufnummernPortierung;
    }

    /**
     * Sets the value of the rufnummernPortierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTXBereitstellungType.RufnummernPortierung }
     *     
     */
    public void setRufnummernPortierung(FTTXBereitstellungType.RufnummernPortierung value) {
        this.rufnummernPortierung = value;
    }

    /**
     * Gets the value of the abgebenderEKP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbgebenderEKP() {
        return abgebenderEKP;
    }

    /**
     * Sets the value of the abgebenderEKP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbgebenderEKP(Boolean value) {
        this.abgebenderEKP = value;
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
     *         &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
        "onkz",
        "rufnummer"
    })
    public static class Bestandssuche {

        @XmlElement(required = true)
        protected String onkz;
        @XmlElement(required = true)
        protected String rufnummer;

        /**
         * Gets the value of the onkz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnkz() {
            return onkz;
        }

        /**
         * Sets the value of the onkz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnkz(String value) {
            this.onkz = value;
        }

        /**
         * Gets the value of the rufnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRufnummer() {
            return rufnummer;
        }

        /**
         * Sets the value of the rufnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRufnummer(String value) {
            this.rufnummer = value;
        }

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
     *         &amp;lt;choice minOccurs="0"&amp;gt;
     *           &amp;lt;element name="anlagenanschluss"&amp;gt;
     *             &amp;lt;complexType&amp;gt;
     *               &amp;lt;complexContent&amp;gt;
     *                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                   &amp;lt;sequence&amp;gt;
     *                     &amp;lt;element name="onkzDurchwahlAbfragestelle"&amp;gt;
     *                       &amp;lt;complexType&amp;gt;
     *                         &amp;lt;complexContent&amp;gt;
     *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                             &amp;lt;sequence&amp;gt;
     *                               &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                               &amp;lt;element name="durchwahlnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                               &amp;lt;element name="abfragestelle" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                             &amp;lt;/sequence&amp;gt;
     *                           &amp;lt;/restriction&amp;gt;
     *                         &amp;lt;/complexContent&amp;gt;
     *                       &amp;lt;/complexType&amp;gt;
     *                     &amp;lt;/element&amp;gt;
     *                     &amp;lt;element name="zuPortierenderRufnummernblock" maxOccurs="unbounded"&amp;gt;
     *                       &amp;lt;complexType&amp;gt;
     *                         &amp;lt;complexContent&amp;gt;
     *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                             &amp;lt;sequence&amp;gt;
     *                               &amp;lt;element name="rnrBlockVon" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                               &amp;lt;element name="rnrBlockBis" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                             &amp;lt;/sequence&amp;gt;
     *                           &amp;lt;/restriction&amp;gt;
     *                         &amp;lt;/complexContent&amp;gt;
     *                       &amp;lt;/complexType&amp;gt;
     *                     &amp;lt;/element&amp;gt;
     *                   &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;/restriction&amp;gt;
     *               &amp;lt;/complexContent&amp;gt;
     *             &amp;lt;/complexType&amp;gt;
     *           &amp;lt;/element&amp;gt;
     *           &amp;lt;element name="einzelanschluss"&amp;gt;
     *             &amp;lt;complexType&amp;gt;
     *               &amp;lt;complexContent&amp;gt;
     *                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                   &amp;lt;sequence&amp;gt;
     *                     &amp;lt;choice minOccurs="0"&amp;gt;
     *                       &amp;lt;element name="rufnummernliste"&amp;gt;
     *                         &amp;lt;complexType&amp;gt;
     *                           &amp;lt;complexContent&amp;gt;
     *                             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                               &amp;lt;sequence&amp;gt;
     *                                 &amp;lt;element name="zuPortierendeOnkzRnr" maxOccurs="unbounded"&amp;gt;
     *                                   &amp;lt;complexType&amp;gt;
     *                                     &amp;lt;complexContent&amp;gt;
     *                                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                                         &amp;lt;sequence&amp;gt;
     *                                           &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                                           &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                                         &amp;lt;/sequence&amp;gt;
     *                                       &amp;lt;/restriction&amp;gt;
     *                                     &amp;lt;/complexContent&amp;gt;
     *                                   &amp;lt;/complexType&amp;gt;
     *                                 &amp;lt;/element&amp;gt;
     *                               &amp;lt;/sequence&amp;gt;
     *                             &amp;lt;/restriction&amp;gt;
     *                           &amp;lt;/complexContent&amp;gt;
     *                         &amp;lt;/complexType&amp;gt;
     *                       &amp;lt;/element&amp;gt;
     *                       &amp;lt;element name="alleRufnummern"&amp;gt;
     *                         &amp;lt;simpleType&amp;gt;
     *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                             &amp;lt;enumeration value="J"/&amp;gt;
     *                           &amp;lt;/restriction&amp;gt;
     *                         &amp;lt;/simpleType&amp;gt;
     *                       &amp;lt;/element&amp;gt;
     *                     &amp;lt;/choice&amp;gt;
     *                   &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;/restriction&amp;gt;
     *               &amp;lt;/complexContent&amp;gt;
     *             &amp;lt;/complexType&amp;gt;
     *           &amp;lt;/element&amp;gt;
     *         &amp;lt;/choice&amp;gt;
     *         &amp;lt;element name="portierungskenner" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
        "anlagenanschluss",
        "einzelanschluss",
        "portierungskenner"
    })
    public static class RufnummernPortierung {

        protected FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss anlagenanschluss;
        protected FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss einzelanschluss;
        @XmlElement(required = true)
        protected String portierungskenner;

        /**
         * Gets the value of the anlagenanschluss property.
         * 
         * @return
         *     possible object is
         *     {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss }
         *     
         */
        public FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss getAnlagenanschluss() {
            return anlagenanschluss;
        }

        /**
         * Sets the value of the anlagenanschluss property.
         * 
         * @param value
         *     allowed object is
         *     {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss }
         *     
         */
        public void setAnlagenanschluss(FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss value) {
            this.anlagenanschluss = value;
        }

        /**
         * Gets the value of the einzelanschluss property.
         * 
         * @return
         *     possible object is
         *     {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss }
         *     
         */
        public FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss getEinzelanschluss() {
            return einzelanschluss;
        }

        /**
         * Sets the value of the einzelanschluss property.
         * 
         * @param value
         *     allowed object is
         *     {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss }
         *     
         */
        public void setEinzelanschluss(FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss value) {
            this.einzelanschluss = value;
        }

        /**
         * Gets the value of the portierungskenner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortierungskenner() {
            return portierungskenner;
        }

        /**
         * Sets the value of the portierungskenner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortierungskenner(String value) {
            this.portierungskenner = value;
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
         *         &amp;lt;element name="onkzDurchwahlAbfragestelle"&amp;gt;
         *           &amp;lt;complexType&amp;gt;
         *             &amp;lt;complexContent&amp;gt;
         *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                 &amp;lt;sequence&amp;gt;
         *                   &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                   &amp;lt;element name="durchwahlnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                   &amp;lt;element name="abfragestelle" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                 &amp;lt;/sequence&amp;gt;
         *               &amp;lt;/restriction&amp;gt;
         *             &amp;lt;/complexContent&amp;gt;
         *           &amp;lt;/complexType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="zuPortierenderRufnummernblock" maxOccurs="unbounded"&amp;gt;
         *           &amp;lt;complexType&amp;gt;
         *             &amp;lt;complexContent&amp;gt;
         *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                 &amp;lt;sequence&amp;gt;
         *                   &amp;lt;element name="rnrBlockVon" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                   &amp;lt;element name="rnrBlockBis" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                 &amp;lt;/sequence&amp;gt;
         *               &amp;lt;/restriction&amp;gt;
         *             &amp;lt;/complexContent&amp;gt;
         *           &amp;lt;/complexType&amp;gt;
         *         &amp;lt;/element&amp;gt;
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
            "onkzDurchwahlAbfragestelle",
            "zuPortierenderRufnummernblock"
        })
        public static class Anlagenanschluss {

            @XmlElement(required = true)
            protected FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle onkzDurchwahlAbfragestelle;
            @XmlElement(required = true)
            protected List<FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock> zuPortierenderRufnummernblock;

            /**
             * Gets the value of the onkzDurchwahlAbfragestelle property.
             * 
             * @return
             *     possible object is
             *     {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle }
             *     
             */
            public FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle getOnkzDurchwahlAbfragestelle() {
                return onkzDurchwahlAbfragestelle;
            }

            /**
             * Sets the value of the onkzDurchwahlAbfragestelle property.
             * 
             * @param value
             *     allowed object is
             *     {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle }
             *     
             */
            public void setOnkzDurchwahlAbfragestelle(FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.OnkzDurchwahlAbfragestelle value) {
                this.onkzDurchwahlAbfragestelle = value;
            }

            /**
             * Gets the value of the zuPortierenderRufnummernblock property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the zuPortierenderRufnummernblock property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getZuPortierenderRufnummernblock().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock }
             * 
             * 
             */
            public List<FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock> getZuPortierenderRufnummernblock() {
                if (zuPortierenderRufnummernblock == null) {
                    zuPortierenderRufnummernblock = new ArrayList<FTTXBereitstellungType.RufnummernPortierung.Anlagenanschluss.ZuPortierenderRufnummernblock>();
                }
                return this.zuPortierenderRufnummernblock;
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
             *         &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
             *         &amp;lt;element name="durchwahlnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
             *         &amp;lt;element name="abfragestelle" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
                "onkz",
                "durchwahlnummer",
                "abfragestelle"
            })
            public static class OnkzDurchwahlAbfragestelle {

                @XmlElement(required = true)
                protected String onkz;
                @XmlElement(required = true)
                protected String durchwahlnummer;
                @XmlElement(required = true)
                protected String abfragestelle;

                /**
                 * Gets the value of the onkz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnkz() {
                    return onkz;
                }

                /**
                 * Sets the value of the onkz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnkz(String value) {
                    this.onkz = value;
                }

                /**
                 * Gets the value of the durchwahlnummer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDurchwahlnummer() {
                    return durchwahlnummer;
                }

                /**
                 * Sets the value of the durchwahlnummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDurchwahlnummer(String value) {
                    this.durchwahlnummer = value;
                }

                /**
                 * Gets the value of the abfragestelle property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbfragestelle() {
                    return abfragestelle;
                }

                /**
                 * Sets the value of the abfragestelle property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbfragestelle(String value) {
                    this.abfragestelle = value;
                }

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
             *         &amp;lt;element name="rnrBlockVon" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
             *         &amp;lt;element name="rnrBlockBis" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
                "rnrBlockVon",
                "rnrBlockBis"
            })
            public static class ZuPortierenderRufnummernblock {

                @XmlElement(required = true)
                protected String rnrBlockVon;
                @XmlElement(required = true)
                protected String rnrBlockBis;

                /**
                 * Gets the value of the rnrBlockVon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRnrBlockVon() {
                    return rnrBlockVon;
                }

                /**
                 * Sets the value of the rnrBlockVon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRnrBlockVon(String value) {
                    this.rnrBlockVon = value;
                }

                /**
                 * Gets the value of the rnrBlockBis property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRnrBlockBis() {
                    return rnrBlockBis;
                }

                /**
                 * Sets the value of the rnrBlockBis property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRnrBlockBis(String value) {
                    this.rnrBlockBis = value;
                }

            }

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
         *         &amp;lt;choice minOccurs="0"&amp;gt;
         *           &amp;lt;element name="rufnummernliste"&amp;gt;
         *             &amp;lt;complexType&amp;gt;
         *               &amp;lt;complexContent&amp;gt;
         *                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                   &amp;lt;sequence&amp;gt;
         *                     &amp;lt;element name="zuPortierendeOnkzRnr" maxOccurs="unbounded"&amp;gt;
         *                       &amp;lt;complexType&amp;gt;
         *                         &amp;lt;complexContent&amp;gt;
         *                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                             &amp;lt;sequence&amp;gt;
         *                               &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                               &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *                             &amp;lt;/sequence&amp;gt;
         *                           &amp;lt;/restriction&amp;gt;
         *                         &amp;lt;/complexContent&amp;gt;
         *                       &amp;lt;/complexType&amp;gt;
         *                     &amp;lt;/element&amp;gt;
         *                   &amp;lt;/sequence&amp;gt;
         *                 &amp;lt;/restriction&amp;gt;
         *               &amp;lt;/complexContent&amp;gt;
         *             &amp;lt;/complexType&amp;gt;
         *           &amp;lt;/element&amp;gt;
         *           &amp;lt;element name="alleRufnummern"&amp;gt;
         *             &amp;lt;simpleType&amp;gt;
         *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *                 &amp;lt;enumeration value="J"/&amp;gt;
         *               &amp;lt;/restriction&amp;gt;
         *             &amp;lt;/simpleType&amp;gt;
         *           &amp;lt;/element&amp;gt;
         *         &amp;lt;/choice&amp;gt;
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
            "rufnummernliste",
            "alleRufnummern"
        })
        public static class Einzelanschluss {

            protected FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste rufnummernliste;
            protected String alleRufnummern;

            /**
             * Gets the value of the rufnummernliste property.
             * 
             * @return
             *     possible object is
             *     {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste }
             *     
             */
            public FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste getRufnummernliste() {
                return rufnummernliste;
            }

            /**
             * Sets the value of the rufnummernliste property.
             * 
             * @param value
             *     allowed object is
             *     {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste }
             *     
             */
            public void setRufnummernliste(FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste value) {
                this.rufnummernliste = value;
            }

            /**
             * Gets the value of the alleRufnummern property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlleRufnummern() {
                return alleRufnummern;
            }

            /**
             * Sets the value of the alleRufnummern property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlleRufnummern(String value) {
                this.alleRufnummern = value;
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
             *         &amp;lt;element name="zuPortierendeOnkzRnr" maxOccurs="unbounded"&amp;gt;
             *           &amp;lt;complexType&amp;gt;
             *             &amp;lt;complexContent&amp;gt;
             *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
             *                 &amp;lt;sequence&amp;gt;
             *                   &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
             *                   &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
             *                 &amp;lt;/sequence&amp;gt;
             *               &amp;lt;/restriction&amp;gt;
             *             &amp;lt;/complexContent&amp;gt;
             *           &amp;lt;/complexType&amp;gt;
             *         &amp;lt;/element&amp;gt;
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
                "zuPortierendeOnkzRnr"
            })
            public static class Rufnummernliste {

                @XmlElement(required = true)
                protected List<FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr> zuPortierendeOnkzRnr;

                /**
                 * Gets the value of the zuPortierendeOnkzRnr property.
                 * 
                 * &lt;p&gt;
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the zuPortierendeOnkzRnr property.
                 * 
                 * &lt;p&gt;
                 * For example, to add a new item, do as follows:
                 * &lt;pre&gt;
                 *    getZuPortierendeOnkzRnr().add(newItem);
                 * &lt;/pre&gt;
                 * 
                 * 
                 * &lt;p&gt;
                 * Objects of the following type(s) are allowed in the list
                 * {@link FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr }
                 * 
                 * 
                 */
                public List<FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr> getZuPortierendeOnkzRnr() {
                    if (zuPortierendeOnkzRnr == null) {
                        zuPortierendeOnkzRnr = new ArrayList<FTTXBereitstellungType.RufnummernPortierung.Einzelanschluss.Rufnummernliste.ZuPortierendeOnkzRnr>();
                    }
                    return this.zuPortierendeOnkzRnr;
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
                 *         &amp;lt;element name="onkz" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
                 *         &amp;lt;element name="rufnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
                    "onkz",
                    "rufnummer"
                })
                public static class ZuPortierendeOnkzRnr {

                    @XmlElement(required = true)
                    protected String onkz;
                    @XmlElement(required = true)
                    protected String rufnummer;

                    /**
                     * Gets the value of the onkz property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnkz() {
                        return onkz;
                    }

                    /**
                     * Sets the value of the onkz property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnkz(String value) {
                        this.onkz = value;
                    }

                    /**
                     * Gets the value of the rufnummer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRufnummer() {
                        return rufnummer;
                    }

                    /**
                     * Sets the value of the rufnummer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRufnummer(String value) {
                        this.rufnummer = value;
                    }

                }

            }

        }

    }

}
