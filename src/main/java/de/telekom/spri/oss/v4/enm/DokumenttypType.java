
package de.telekom.spri.oss.v4.enm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DokumenttypType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DokumenttypType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="image/tiff"/&amp;gt;
 *     &amp;lt;enumeration value="image/jpeg"/&amp;gt;
 *     &amp;lt;enumeration value="application/msword"/&amp;gt;
 *     &amp;lt;enumeration value="application/excel"/&amp;gt;
 *     &amp;lt;enumeration value="application/pdf"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DokumenttypType", namespace = "http://spri.telekom.de/oss/v4/enm")
@XmlEnum
public enum DokumenttypType {

    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff"),
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("application/msword")
    APPLICATION_MSWORD("application/msword"),
    @XmlEnumValue("application/excel")
    APPLICATION_EXCEL("application/excel"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf");
    private final String value;

    DokumenttypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DokumenttypType fromValue(String v) {
        for (DokumenttypType c: DokumenttypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
