
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnlagentypType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AnlagentypType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Kuendigungsschreiben"/&amp;gt;
 *     &amp;lt;enumeration value="Lageplan"/&amp;gt;
 *     &amp;lt;enumeration value="Kundenauftrag"/&amp;gt;
 *     &amp;lt;enumeration value="Portierungsanzeige"/&amp;gt;
 *     &amp;lt;enumeration value="Rechnung"/&amp;gt;
 *     &amp;lt;enumeration value="Sonstige"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AnlagentypType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum AnlagentypType {

    @XmlEnumValue("Kuendigungsschreiben")
    KUENDIGUNGSSCHREIBEN("Kuendigungsschreiben"),
    @XmlEnumValue("Lageplan")
    LAGEPLAN("Lageplan"),
    @XmlEnumValue("Kundenauftrag")
    KUNDENAUFTRAG("Kundenauftrag"),
    @XmlEnumValue("Portierungsanzeige")
    PORTIERUNGSANZEIGE("Portierungsanzeige"),
    @XmlEnumValue("Rechnung")
    RECHNUNG("Rechnung"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige");
    private final String value;

    AnlagentypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnlagentypType fromValue(String v) {
        for (AnlagentypType c: AnlagentypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
