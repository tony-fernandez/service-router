
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FTTxVersandinfosONTType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTxVersandinfosONTType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="seriennummerONT" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="versand"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="unternehmen" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="sendungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
@XmlType(name = "FTTxVersandinfosONTType", propOrder = {
    "seriennummerONT",
    "versand"
})
public class FTTxVersandinfosONTType {

    @XmlElement(required = true)
    protected String seriennummerONT;
    @XmlElement(required = true)
    protected FTTxVersandinfosONTType.Versand versand;

    /**
     * Gets the value of the seriennummerONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriennummerONT() {
        return seriennummerONT;
    }

    /**
     * Sets the value of the seriennummerONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriennummerONT(String value) {
        this.seriennummerONT = value;
    }

    /**
     * Gets the value of the versand property.
     * 
     * @return
     *     possible object is
     *     {@link FTTxVersandinfosONTType.Versand }
     *     
     */
    public FTTxVersandinfosONTType.Versand getVersand() {
        return versand;
    }

    /**
     * Sets the value of the versand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTxVersandinfosONTType.Versand }
     *     
     */
    public void setVersand(FTTxVersandinfosONTType.Versand value) {
        this.versand = value;
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
     *         &amp;lt;element name="unternehmen" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="sendungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
        "unternehmen",
        "sendungsnummer"
    })
    public static class Versand {

        @XmlElement(required = true)
        protected String unternehmen;
        @XmlElement(required = true)
        protected String sendungsnummer;

        /**
         * Gets the value of the unternehmen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnternehmen() {
            return unternehmen;
        }

        /**
         * Sets the value of the unternehmen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnternehmen(String value) {
            this.unternehmen = value;
        }

        /**
         * Gets the value of the sendungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendungsnummer() {
            return sendungsnummer;
        }

        /**
         * Sets the value of the sendungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendungsnummer(String value) {
            this.sendungsnummer = value;
        }

    }

}
