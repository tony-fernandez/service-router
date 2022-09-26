
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GeschaeftsfallMeldungType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="GeschaeftsfallMeldungType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NEU"/&amp;gt;
 *     &amp;lt;enumeration value="KUE-AG"/&amp;gt;
 *     &amp;lt;enumeration value="AEN-LMAE"/&amp;gt;
 *     &amp;lt;enumeration value="LAE"/&amp;gt;
 *     &amp;lt;enumeration value="EST"/&amp;gt;
 *     &amp;lt;enumeration value="PV"/&amp;gt;
 *     &amp;lt;enumeration value="KUE-LE"/&amp;gt;
 *     &amp;lt;enumeration value="GET"/&amp;gt;
 *     &amp;lt;enumeration value="SET"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "GeschaeftsfallMeldungType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum GeschaeftsfallMeldungType {

    NEU("NEU"),
    @XmlEnumValue("KUE-AG")
    KUE_AG("KUE-AG"),
    @XmlEnumValue("AEN-LMAE")
    AEN_LMAE("AEN-LMAE"),
    LAE("LAE"),
    EST("EST"),
    PV("PV"),
    @XmlEnumValue("KUE-LE")
    KUE_LE("KUE-LE"),
    GET("GET"),
    SET("SET");
    private final String value;

    GeschaeftsfallMeldungType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeschaeftsfallMeldungType fromValue(String v) {
        for (GeschaeftsfallMeldungType c: GeschaeftsfallMeldungType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
