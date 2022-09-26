
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GeschaeftsfallArtType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="GeschaeftsfallArtType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Bereitstellung"/&amp;gt;
 *     &amp;lt;enumeration value="Kuendigung"/&amp;gt;
 *     &amp;lt;enumeration value="Aenderung"/&amp;gt;
 *     &amp;lt;enumeration value="Entstoerung"/&amp;gt;
 *     &amp;lt;enumeration value="Endkundenanbieterwechsel"/&amp;gt;
 *     &amp;lt;enumeration value="Diagnose"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "GeschaeftsfallArtType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum GeschaeftsfallArtType {

    @XmlEnumValue("Bereitstellung")
    BEREITSTELLUNG("Bereitstellung"),
    @XmlEnumValue("Kuendigung")
    KUENDIGUNG("Kuendigung"),
    @XmlEnumValue("Aenderung")
    AENDERUNG("Aenderung"),
    @XmlEnumValue("Entstoerung")
    ENTSTOERUNG("Entstoerung"),
    @XmlEnumValue("Endkundenanbieterwechsel")
    ENDKUNDENANBIETERWECHSEL("Endkundenanbieterwechsel"),
    @XmlEnumValue("Diagnose")
    DIAGNOSE("Diagnose");
    private final String value;

    GeschaeftsfallArtType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeschaeftsfallArtType fromValue(String v) {
        for (GeschaeftsfallArtType c: GeschaeftsfallArtType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
