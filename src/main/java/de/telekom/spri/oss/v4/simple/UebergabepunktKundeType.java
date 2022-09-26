
package de.telekom.spri.oss.v4.simple;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UebergabepunktKundeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="UebergabepunktKundeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="TAE"/&amp;gt;
 *     &amp;lt;enumeration value="RJ45"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "UebergabepunktKundeType", namespace = "http://spri.telekom.de/oss/v4/simple")
@XmlEnum
public enum UebergabepunktKundeType {

    TAE("TAE"),
    @XmlEnumValue("RJ45")
    RJ_45("RJ45");
    private final String value;

    UebergabepunktKundeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UebergabepunktKundeType fromValue(String v) {
        for (UebergabepunktKundeType c: UebergabepunktKundeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
