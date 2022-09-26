
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnsprechpartnerRolleType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AnsprechpartnerRolleType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Auftragsmanagement"/&amp;gt;
 *     &amp;lt;enumeration value="Technik"/&amp;gt;
 *     &amp;lt;enumeration value="Endkunde"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AnsprechpartnerRolleType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum AnsprechpartnerRolleType {

    @XmlEnumValue("Auftragsmanagement")
    AUFTRAGSMANAGEMENT("Auftragsmanagement"),
    @XmlEnumValue("Technik")
    TECHNIK("Technik"),
    @XmlEnumValue("Endkunde")
    ENDKUNDE("Endkunde");
    private final String value;

    AnsprechpartnerRolleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnsprechpartnerRolleType fromValue(String v) {
        for (AnsprechpartnerRolleType c: AnsprechpartnerRolleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
