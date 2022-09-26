
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MeldungstypType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MeldungstypType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="TEQ"/&amp;gt;
 *     &amp;lt;enumeration value="QEB"/&amp;gt;
 *     &amp;lt;enumeration value="ABM"/&amp;gt;
 *     &amp;lt;enumeration value="ERLM"/&amp;gt;
 *     &amp;lt;enumeration value="ENTM"/&amp;gt;
 *     &amp;lt;enumeration value="ABBM"/&amp;gt;
 *     &amp;lt;enumeration value="VZM"/&amp;gt;
 *     &amp;lt;enumeration value="TAM"/&amp;gt;
 *     &amp;lt;enumeration value="MTAM"/&amp;gt;
 *     &amp;lt;enumeration value="KDLE"/&amp;gt;
 *     &amp;lt;enumeration value="ZWM-LE"/&amp;gt;
 *     &amp;lt;enumeration value="ZWM-AG"/&amp;gt;
 *     &amp;lt;enumeration value="TBK-LE"/&amp;gt;
 *     &amp;lt;enumeration value="TBK-AG"/&amp;gt;
 *     &amp;lt;enumeration value="AKM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="RUEM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="ABM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="ERLM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="ENTM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="ABBM-PV"/&amp;gt;
 *     &amp;lt;enumeration value="ERLM-K"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MeldungstypType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum MeldungstypType {

    TEQ("TEQ"),
    QEB("QEB"),
    ABM("ABM"),
    ERLM("ERLM"),
    ENTM("ENTM"),
    ABBM("ABBM"),
    VZM("VZM"),
    TAM("TAM"),
    MTAM("MTAM"),
    KDLE("KDLE"),
    @XmlEnumValue("ZWM-LE")
    ZWM_LE("ZWM-LE"),
    @XmlEnumValue("ZWM-AG")
    ZWM_AG("ZWM-AG"),
    @XmlEnumValue("TBK-LE")
    TBK_LE("TBK-LE"),
    @XmlEnumValue("TBK-AG")
    TBK_AG("TBK-AG"),
    @XmlEnumValue("AKM-PV")
    AKM_PV("AKM-PV"),
    @XmlEnumValue("RUEM-PV")
    RUEM_PV("RUEM-PV"),
    @XmlEnumValue("ABM-PV")
    ABM_PV("ABM-PV"),
    @XmlEnumValue("ERLM-PV")
    ERLM_PV("ERLM-PV"),
    @XmlEnumValue("ENTM-PV")
    ENTM_PV("ENTM-PV"),
    @XmlEnumValue("ABBM-PV")
    ABBM_PV("ABBM-PV"),
    @XmlEnumValue("ERLM-K")
    ERLM_K("ERLM-K");
    private final String value;

    MeldungstypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeldungstypType fromValue(String v) {
        for (MeldungstypType c: MeldungstypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
