
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.order.BereitstellungType;
import de.telekom.spri.oss.v4.order.DiagnoseGetType;
import de.telekom.spri.oss.v4.order.DiagnoseSetType;
import de.telekom.spri.oss.v4.order.EntstoerungType;
import de.telekom.spri.oss.v4.order.KuendigungType;
import de.telekom.spri.oss.v4.order.LeistungsaenderungType;
import de.telekom.spri.oss.v4.order.LeistungsmerkmalAenderungType;
import de.telekom.spri.oss.v4.order.ProviderwechselType;


/**
 * &lt;p&gt;Java class for GeschaeftsfallType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GeschaeftsfallType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeschaeftsfallType")
@XmlSeeAlso({
    LeistungsmerkmalAenderungType.class,
    EntstoerungType.class,
    DiagnoseGetType.class,
    KuendigungType.class,
    LeistungsaenderungType.class,
    BereitstellungType.class,
    ProviderwechselType.class,
    DiagnoseSetType.class
})
public abstract class GeschaeftsfallType {


}
