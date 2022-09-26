
package de.telekom.spri.oss.v4.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.telekom.spri.oss.v4.complex.GeschaeftsfallProduktType;
import de.telekom.spri.oss.v4.fttx.FTTXProviderwechselType;


/**
 * &lt;p&gt;Java class for ProviderwechselProduktType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProviderwechselProduktType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://spri.telekom.de/oss/v4/complex}GeschaeftsfallProduktType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderwechselProduktType")
@XmlSeeAlso({
    FTTXProviderwechselType.class
})
public abstract class ProviderwechselProduktType
    extends GeschaeftsfallProduktType
{


}
