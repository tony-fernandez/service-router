
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FTTxVormieterType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FTTxVormieterType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="person" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="homeId" type="{http://spri.telekom.de/oss/v4/complex}HomeIdType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="seriennummerONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTTxVormieterType", propOrder = {
    "person",
    "homeId",
    "seriennummerONT"
})
public class FTTxVormieterType {

    protected FTTxVormieterType.Person person;
    protected HomeIdType homeId;
    protected String seriennummerONT;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link FTTxVormieterType.Person }
     *     
     */
    public FTTxVormieterType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTTxVormieterType.Person }
     *     
     */
    public void setPerson(FTTxVormieterType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the homeId property.
     * 
     * @return
     *     possible object is
     *     {@link HomeIdType }
     *     
     */
    public HomeIdType getHomeId() {
        return homeId;
    }

    /**
     * Sets the value of the homeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeIdType }
     *     
     */
    public void setHomeId(HomeIdType value) {
        this.homeId = value;
    }

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
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
        "vorname",
        "nachname"
    })
    public static class Person {

        protected String vorname;
        @XmlElement(required = true)
        protected String nachname;

        /**
         * Gets the value of the vorname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVorname() {
            return vorname;
        }

        /**
         * Sets the value of the vorname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVorname(String value) {
            this.vorname = value;
        }

        /**
         * Gets the value of the nachname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachname() {
            return nachname;
        }

        /**
         * Sets the value of the nachname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachname(String value) {
            this.nachname = value;
        }

    }

}
