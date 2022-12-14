package de.xconnect.bus.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2022-09-20T08:12:49.929+02:00
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "Spri_4_0_InhouseService",
                  wsdlLocation = "file:/Users/tonyfernandez/dev/pyur/repo/service-router/src/main/resources/wsdl/Spri_4_0_InhouseService.wsdl",
                  targetNamespace = "api.bus.xconnect.de")
public class Spri40InhouseService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("api.bus.xconnect.de", "Spri_4_0_InhouseService");
    public final static QName Spri40InhouseServicePort = new QName("api.bus.xconnect.de", "Spri_4_0_InhouseServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/tonyfernandez/dev/pyur/repo/service-router/src/main/resources/wsdl/Spri_4_0_InhouseService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Spri40InhouseService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/tonyfernandez/dev/pyur/repo/service-router/src/main/resources/wsdl/Spri_4_0_InhouseService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Spri40InhouseService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Spri40InhouseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Spri40InhouseService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Spri40InhouseService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Spri40InhouseService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Spri40InhouseService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Spri40InhouseServicePort
     */
    @WebEndpoint(name = "Spri_4_0_InhouseServicePort")
    public Spri40InhouseServicePort getSpri40InhouseServicePort() {
        return super.getPort(Spri40InhouseServicePort, Spri40InhouseServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Spri40InhouseServicePort
     */
    @WebEndpoint(name = "Spri_4_0_InhouseServicePort")
    public Spri40InhouseServicePort getSpri40InhouseServicePort(WebServiceFeature... features) {
        return super.getPort(Spri40InhouseServicePort, Spri40InhouseServicePort.class, features);
    }

}
