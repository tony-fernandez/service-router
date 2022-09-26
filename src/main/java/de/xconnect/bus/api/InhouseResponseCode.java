
package de.xconnect.bus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for inhouseResponseCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="inhouseResponseCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="OK"/&amp;gt;
 *     &amp;lt;enumeration value="ERROR"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "inhouseResponseCode")
@XmlEnum
public enum InhouseResponseCode {

    OK,
    ERROR;

    public String value() {
        return name();
    }

    public static InhouseResponseCode fromValue(String v) {
        return valueOf(v);
    }

}
