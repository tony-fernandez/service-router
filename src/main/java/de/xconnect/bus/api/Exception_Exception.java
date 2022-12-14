
package de.xconnect.bus.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.0
 * 2022-09-20T08:12:49.880+02:00
 * Generated source version: 3.4.0
 */

@WebFault(name = "Exception", targetNamespace = "api.bus.xconnect.de")
public class Exception_Exception extends java.lang.Exception {

    private de.xconnect.bus.api.Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, de.xconnect.bus.api.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, de.xconnect.bus.api.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public de.xconnect.bus.api.Exception getFaultInfo() {
        return this.exception;
    }
}
