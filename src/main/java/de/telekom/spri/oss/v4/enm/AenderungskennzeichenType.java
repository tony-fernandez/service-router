
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AenderungskennzeichenType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AenderungskennzeichenType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Standard"/&amp;gt;
 *     &amp;lt;enumeration value="Storno"/&amp;gt;
 *     &amp;lt;enumeration value="Terminverschiebung"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AenderungskennzeichenType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum AenderungskennzeichenType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Storno")
    STORNO("Storno"),
    @XmlEnumValue("Terminverschiebung")
    TERMINVERSCHIEBUNG("Terminverschiebung");
    private final String value;

    AenderungskennzeichenType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AenderungskennzeichenType fromValue(String v) {
        for (AenderungskennzeichenType c: AenderungskennzeichenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
