
package de.xconnect.bus.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InhouseMeta complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InhouseMeta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="messageUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="optionalValues"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="reponseToMessageUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="transmissionUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhouseMeta", propOrder = {
    "messageUuid",
    "optionalValues",
    "reponseToMessageUuid",
    "transmissionUuid"
})
public class InhouseMeta {

    protected String messageUuid;
    @XmlElement(required = true)
    protected InhouseMeta.OptionalValues optionalValues;
    protected String reponseToMessageUuid;
    protected String transmissionUuid;

    /**
     * Gets the value of the messageUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageUuid() {
        return messageUuid;
    }

    /**
     * Sets the value of the messageUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageUuid(String value) {
        this.messageUuid = value;
    }

    /**
     * Gets the value of the optionalValues property.
     * 
     * @return
     *     possible object is
     *     {@link InhouseMeta.OptionalValues }
     *     
     */
    public InhouseMeta.OptionalValues getOptionalValues() {
        return optionalValues;
    }

    /**
     * Sets the value of the optionalValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseMeta.OptionalValues }
     *     
     */
    public void setOptionalValues(InhouseMeta.OptionalValues value) {
        this.optionalValues = value;
    }

    /**
     * Gets the value of the reponseToMessageUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponseToMessageUuid() {
        return reponseToMessageUuid;
    }

    /**
     * Sets the value of the reponseToMessageUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponseToMessageUuid(String value) {
        this.reponseToMessageUuid = value;
    }

    /**
     * Gets the value of the transmissionUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionUuid() {
        return transmissionUuid;
    }

    /**
     * Sets the value of the transmissionUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionUuid(String value) {
        this.transmissionUuid = value;
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
     *         &amp;lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
        "entry"
    })
    public static class OptionalValues {

        protected List<InhouseMeta.OptionalValues.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the entry property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEntry().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link InhouseMeta.OptionalValues.Entry }
         * 
         * 
         */
        public List<InhouseMeta.OptionalValues.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<InhouseMeta.OptionalValues.Entry>();
            }
            return this.entry;
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
         *         &amp;lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
