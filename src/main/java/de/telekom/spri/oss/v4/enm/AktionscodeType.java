
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AktionscodeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AktionscodeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="A"/&amp;gt;
 *     &amp;lt;enumeration value="W"/&amp;gt;
 *     &amp;lt;enumeration value="Z"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AktionscodeType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum AktionscodeType {

    A,
    W,
    Z;

    public String value() {
        return name();
    }

    public static AktionscodeType fromValue(String v) {
        return valueOf(v);
    }

}
