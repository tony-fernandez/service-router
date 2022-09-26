
package de.telekom.spri.oss.v4.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.order.BereitstellungProduktType;
import de.telekom.spri.oss.v4.order.EntstoerungProduktType;
import de.telekom.spri.oss.v4.order.KuendigungProduktType;
import de.telekom.spri.oss.v4.order.LeistungsaenderungProduktType;
import de.telekom.spri.oss.v4.order.LeistungsmerkmalAenderungProduktType;
import de.telekom.spri.oss.v4.order.ProviderwechselProduktType;


/**
 * &lt;p&gt;Java class for GeschaeftsfallProduktType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GeschaeftsfallProduktType"&amp;gt;
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
@XmlType(name = "GeschaeftsfallProduktType")
@XmlSeeAlso({
    LeistungsaenderungProduktType.class,
    LeistungsmerkmalAenderungProduktType.class,
    EntstoerungProduktType.class,
    KuendigungProduktType.class,
    BereitstellungProduktType.class,
    ProviderwechselProduktType.class
})
public abstract class GeschaeftsfallProduktType {


}
