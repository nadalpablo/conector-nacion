
package us.inswitch.mts.webservices.bn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import us.inswitch.mts.exceptions.xsd.ServiceException;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestAgentAutoReversion;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseAgentAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.bn package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTSServiceREDServiceExceptionServiceException_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "ServiceException");
    private final static QName _CashInPreRedDtoRequestCashInPre_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestCashInPre");
    private final static QName _CashInPreRedResponseReturn_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "return");
    private final static QName _CashOutPreRedDtoRequestCashOutPre_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestCashOutPre");
    private final static QName _CashInConfirmRedDtoRequestCashInConfirm_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestCashInConfirm");
    private final static QName _CashOutConfirmRedDtoRequestCashOutConfirm_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestCashOutConfirm");
    private final static QName _AgentAutoReversionRedDtoRequestAgentAutoReversion_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestAgentAutoReversion");
    private final static QName _UtfiAutoReversionRedDtoRequestUtfiAutoReversion_QNAME = new QName("http://bn.webservices.mts.inswitch.us", "dtoRequestUtfiAutoReversion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.bn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MTSServiceREDServiceException }
     * 
     */
    public MTSServiceREDServiceException createMTSServiceREDServiceException() {
        return new MTSServiceREDServiceException();
    }

    /**
     * Create an instance of {@link CashInPreRed }
     * 
     */
    public CashInPreRed createCashInPreRed() {
        return new CashInPreRed();
    }

    /**
     * Create an instance of {@link CashInPreRedResponse }
     * 
     */
    public CashInPreRedResponse createCashInPreRedResponse() {
        return new CashInPreRedResponse();
    }

    /**
     * Create an instance of {@link CashOutPreRed }
     * 
     */
    public CashOutPreRed createCashOutPreRed() {
        return new CashOutPreRed();
    }

    /**
     * Create an instance of {@link CashOutPreRedResponse }
     * 
     */
    public CashOutPreRedResponse createCashOutPreRedResponse() {
        return new CashOutPreRedResponse();
    }

    /**
     * Create an instance of {@link CashInConfirmRed }
     * 
     */
    public CashInConfirmRed createCashInConfirmRed() {
        return new CashInConfirmRed();
    }

    /**
     * Create an instance of {@link CashInConfirmRedResponse }
     * 
     */
    public CashInConfirmRedResponse createCashInConfirmRedResponse() {
        return new CashInConfirmRedResponse();
    }

    /**
     * Create an instance of {@link CashOutConfirmRed }
     * 
     */
    public CashOutConfirmRed createCashOutConfirmRed() {
        return new CashOutConfirmRed();
    }

    /**
     * Create an instance of {@link CashOutConfirmRedResponse }
     * 
     */
    public CashOutConfirmRedResponse createCashOutConfirmRedResponse() {
        return new CashOutConfirmRedResponse();
    }

    /**
     * Create an instance of {@link AgentAutoReversionRed }
     * 
     */
    public AgentAutoReversionRed createAgentAutoReversionRed() {
        return new AgentAutoReversionRed();
    }

    /**
     * Create an instance of {@link AgentAutoReversionRedResponse }
     * 
     */
    public AgentAutoReversionRedResponse createAgentAutoReversionRedResponse() {
        return new AgentAutoReversionRedResponse();
    }

    /**
     * Create an instance of {@link UtfiAutoReversionRed }
     * 
     */
    public UtfiAutoReversionRed createUtfiAutoReversionRed() {
        return new UtfiAutoReversionRed();
    }

    /**
     * Create an instance of {@link UtfiAutoReversionRedResponse }
     * 
     */
    public UtfiAutoReversionRedResponse createUtfiAutoReversionRedResponse() {
        return new UtfiAutoReversionRedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "ServiceException", scope = MTSServiceREDServiceException.class)
    public JAXBElement<ServiceException> createMTSServiceREDServiceExceptionServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_MTSServiceREDServiceExceptionServiceException_QNAME, ServiceException.class, MTSServiceREDServiceException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestCashInPre", scope = CashInPreRed.class)
    public JAXBElement<DTORequestCashInPre> createCashInPreRedDtoRequestCashInPre(DTORequestCashInPre value) {
        return new JAXBElement<DTORequestCashInPre>(_CashInPreRedDtoRequestCashInPre_QNAME, DTORequestCashInPre.class, CashInPreRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = CashInPreRedResponse.class)
    public JAXBElement<DTOResponseCashInPre> createCashInPreRedResponseReturn(DTOResponseCashInPre value) {
        return new JAXBElement<DTOResponseCashInPre>(_CashInPreRedResponseReturn_QNAME, DTOResponseCashInPre.class, CashInPreRedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestCashOutPre", scope = CashOutPreRed.class)
    public JAXBElement<DTORequestCashOutPre> createCashOutPreRedDtoRequestCashOutPre(DTORequestCashOutPre value) {
        return new JAXBElement<DTORequestCashOutPre>(_CashOutPreRedDtoRequestCashOutPre_QNAME, DTORequestCashOutPre.class, CashOutPreRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = CashOutPreRedResponse.class)
    public JAXBElement<DTOResponseCashOutPre> createCashOutPreRedResponseReturn(DTOResponseCashOutPre value) {
        return new JAXBElement<DTOResponseCashOutPre>(_CashInPreRedResponseReturn_QNAME, DTOResponseCashOutPre.class, CashOutPreRedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestCashInConfirm", scope = CashInConfirmRed.class)
    public JAXBElement<DTORequestCashInConfirm> createCashInConfirmRedDtoRequestCashInConfirm(DTORequestCashInConfirm value) {
        return new JAXBElement<DTORequestCashInConfirm>(_CashInConfirmRedDtoRequestCashInConfirm_QNAME, DTORequestCashInConfirm.class, CashInConfirmRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = CashInConfirmRedResponse.class)
    public JAXBElement<DTOResponseCashInConfirm> createCashInConfirmRedResponseReturn(DTOResponseCashInConfirm value) {
        return new JAXBElement<DTOResponseCashInConfirm>(_CashInPreRedResponseReturn_QNAME, DTOResponseCashInConfirm.class, CashInConfirmRedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestCashOutConfirm", scope = CashOutConfirmRed.class)
    public JAXBElement<DTORequestCashOutConfirm> createCashOutConfirmRedDtoRequestCashOutConfirm(DTORequestCashOutConfirm value) {
        return new JAXBElement<DTORequestCashOutConfirm>(_CashOutConfirmRedDtoRequestCashOutConfirm_QNAME, DTORequestCashOutConfirm.class, CashOutConfirmRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = CashOutConfirmRedResponse.class)
    public JAXBElement<DTOResponseCashOutConfirm> createCashOutConfirmRedResponseReturn(DTOResponseCashOutConfirm value) {
        return new JAXBElement<DTOResponseCashOutConfirm>(_CashInPreRedResponseReturn_QNAME, DTOResponseCashOutConfirm.class, CashOutConfirmRedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestAgentAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestAgentAutoReversion", scope = AgentAutoReversionRed.class)
    public JAXBElement<DTORequestAgentAutoReversion> createAgentAutoReversionRedDtoRequestAgentAutoReversion(DTORequestAgentAutoReversion value) {
        return new JAXBElement<DTORequestAgentAutoReversion>(_AgentAutoReversionRedDtoRequestAgentAutoReversion_QNAME, DTORequestAgentAutoReversion.class, AgentAutoReversionRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseAgentAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = AgentAutoReversionRedResponse.class)
    public JAXBElement<DTOResponseAgentAutoReversion> createAgentAutoReversionRedResponseReturn(DTOResponseAgentAutoReversion value) {
        return new JAXBElement<DTOResponseAgentAutoReversion>(_CashInPreRedResponseReturn_QNAME, DTOResponseAgentAutoReversion.class, AgentAutoReversionRedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestUtfiAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "dtoRequestUtfiAutoReversion", scope = UtfiAutoReversionRed.class)
    public JAXBElement<DTORequestUtfiAutoReversion> createUtfiAutoReversionRedDtoRequestUtfiAutoReversion(DTORequestUtfiAutoReversion value) {
        return new JAXBElement<DTORequestUtfiAutoReversion>(_UtfiAutoReversionRedDtoRequestUtfiAutoReversion_QNAME, DTORequestUtfiAutoReversion.class, UtfiAutoReversionRed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseUtfiAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bn.webservices.mts.inswitch.us", name = "return", scope = UtfiAutoReversionRedResponse.class)
    public JAXBElement<DTOResponseUtfiAutoReversion> createUtfiAutoReversionRedResponseReturn(DTOResponseUtfiAutoReversion value) {
        return new JAXBElement<DTOResponseUtfiAutoReversion>(_CashInPreRedResponseReturn_QNAME, DTOResponseUtfiAutoReversion.class, UtfiAutoReversionRedResponse.class, value);
    }

}
