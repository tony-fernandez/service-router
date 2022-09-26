
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for KennerType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="KennerType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="projektId" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="projektkenner" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="kopplungskenner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="auftragskenner" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="auftragsklammer" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *                   &amp;lt;element name="anzahlAuftraege" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
@XmlType(name = "KennerType", propOrder = {
    "projektId",
    "auftragskenner"
})
public class KennerType {

    protected KennerType.ProjektId projektId;
    protected KennerType.Auftragskenner auftragskenner;

    /**
     * Gets the value of the projektId property.
     * 
     * @return
     *     possible object is
     *     {@link KennerType.ProjektId }
     *     
     */
    public KennerType.ProjektId getProjektId() {
        return projektId;
    }

    /**
     * Sets the value of the projektId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KennerType.ProjektId }
     *     
     */
    public void setProjektId(KennerType.ProjektId value) {
        this.projektId = value;
    }

    /**
     * Gets the value of the auftragskenner property.
     * 
     * @return
     *     possible object is
     *     {@link KennerType.Auftragskenner }
     *     
     */
    public KennerType.Auftragskenner getAuftragskenner() {
        return auftragskenner;
    }

    /**
     * Sets the value of the auftragskenner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KennerType.Auftragskenner }
     *     
     */
    public void setAuftragskenner(KennerType.Auftragskenner value) {
        this.auftragskenner = value;
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
     *         &amp;lt;element name="auftragsklammer" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
     *         &amp;lt;element name="anzahlAuftraege" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
        "auftragsklammer",
        "anzahlAuftraege"
    })
    public static class Auftragskenner {

        protected long auftragsklammer;
        protected int anzahlAuftraege;

        /**
         * Gets the value of the auftragsklammer property.
         * 
         */
        public long getAuftragsklammer() {
            return auftragsklammer;
        }

        /**
         * Sets the value of the auftragsklammer property.
         * 
         */
        public void setAuftragsklammer(long value) {
            this.auftragsklammer = value;
        }

        /**
         * Gets the value of the anzahlAuftraege property.
         * 
         */
        public int getAnzahlAuftraege() {
            return anzahlAuftraege;
        }

        /**
         * Sets the value of the anzahlAuftraege property.
         * 
         */
        public void setAnzahlAuftraege(int value) {
            this.anzahlAuftraege = value;
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
     *         &amp;lt;element name="projektkenner" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="kopplungskenner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
        "projektkenner",
        "kopplungskenner"
    })
    public static class ProjektId {

        @XmlElement(required = true)
        protected String projektkenner;
        protected String kopplungskenner;

        /**
         * Gets the value of the projektkenner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProjektkenner() {
            return projektkenner;
        }

        /**
         * Sets the value of the projektkenner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProjektkenner(String value) {
            this.projektkenner = value;
        }

        /**
         * Gets the value of the kopplungskenner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKopplungskenner() {
            return kopplungskenner;
        }

        /**
         * Sets the value of the kopplungskenner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKopplungskenner(String value) {
            this.kopplungskenner = value;
        }

    }

}
