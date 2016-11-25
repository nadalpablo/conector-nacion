
package us.inswitch.mts.webservices.bn;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-03T14:45:07.583-03:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "MTSServiceREDServiceException", targetNamespace = "http://bn.webservices.mts.inswitch.us")
public class MTSServiceREDServiceException_Exception extends Exception {
    
    private us.inswitch.mts.webservices.bn.MTSServiceREDServiceException mtsServiceREDServiceException;

    public MTSServiceREDServiceException_Exception() {
        super();
    }
    
    public MTSServiceREDServiceException_Exception(String message) {
        super(message);
    }
    
    public MTSServiceREDServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public MTSServiceREDServiceException_Exception(String message, us.inswitch.mts.webservices.bn.MTSServiceREDServiceException mtsServiceREDServiceException) {
        super(message);
        this.mtsServiceREDServiceException = mtsServiceREDServiceException;
    }

    public MTSServiceREDServiceException_Exception(String message, us.inswitch.mts.webservices.bn.MTSServiceREDServiceException mtsServiceREDServiceException, Throwable cause) {
        super(message, cause);
        this.mtsServiceREDServiceException = mtsServiceREDServiceException;
    }

    public us.inswitch.mts.webservices.bn.MTSServiceREDServiceException getFaultInfo() {
        return this.mtsServiceREDServiceException;
    }
}