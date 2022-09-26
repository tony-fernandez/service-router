
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for JaNeinType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="JaNeinType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="J"/&amp;gt;
 *     &amp;lt;enumeration value="N"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "JaNeinType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum JaNeinType {

    J,
    N;

    public String value() {
        return name();
    }

    public static JaNeinType fromValue(String v) {
        return valueOf(v);
    }

}
