
package us.inswitch.mts.webservices.dto.service.request.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.service.request.xsd package. 
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

    private final static QName _DTORequestUtfiAutoReversionLanguage_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "language");
    private final static QName _DTORequestUtfiAutoReversionPassword_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "password");
    private final static QName _DTORequestUtfiAutoReversionUser_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "user");
    private final static QName _DTORequestUtfiAutoReversionUtfi_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTORequestAgentAutoReversionIdTransaction_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "idTransaction");
    private final static QName _DTORequestCashOutConfirmAmount_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "amount");
    private final static QName _DTORequestCashOutConfirmBrandId_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "brandId");
    private final static QName _DTORequestCashOutConfirmCurrency_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "currency");
    private final static QName _DTORequestCashOutConfirmDocument_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "document");
    private final static QName _DTORequestCashOutConfirmMsisdnSource_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "msisdnSource");
    private final static QName _DTORequestCashOutConfirmMsisdnTarget_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "msisdnTarget");
    private final static QName _DTORequestCashOutConfirmOtp_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "otp");
    private final static QName _DTORequestCashOutConfirmPin_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "pin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.service.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTORequestCashInPre }
     * 
     */
    public DTORequestCashInPre createDTORequestCashInPre() {
        return new DTORequestCashInPre();
    }

    /**
     * Create an instance of {@link DTORequestCashOutPre }
     * 
     */
    public DTORequestCashOutPre createDTORequestCashOutPre() {
        return new DTORequestCashOutPre();
    }

    /**
     * Create an instance of {@link DTORequestCashInConfirm }
     * 
     */
    public DTORequestCashInConfirm createDTORequestCashInConfirm() {
        return new DTORequestCashInConfirm();
    }

    /**
     * Create an instance of {@link DTORequestCashOutConfirm }
     * 
     */
    public DTORequestCashOutConfirm createDTORequestCashOutConfirm() {
        return new DTORequestCashOutConfirm();
    }

    /**
     * Create an instance of {@link DTORequestAgentAutoReversion }
     * 
     */
    public DTORequestAgentAutoReversion createDTORequestAgentAutoReversion() {
        return new DTORequestAgentAutoReversion();
    }

    /**
     * Create an instance of {@link DTORequestUtfiAutoReversion }
     * 
     */
    public DTORequestUtfiAutoReversion createDTORequestUtfiAutoReversion() {
        return new DTORequestUtfiAutoReversion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionPassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "idTransaction", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionIdTransaction(String value) {
        return new JAXBElement<String>(_DTORequestAgentAutoReversionIdTransaction_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionPassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Double> createDTORequestCashOutConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashOutConfirmAmount_QNAME, Double.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Integer> createDTORequestCashOutConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmBrandId_QNAME, Integer.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Integer> createDTORequestCashOutConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmCurrency_QNAME, Integer.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmDocument_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnSource_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnTarget_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmPin_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Double> createDTORequestCashInConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashOutConfirmAmount_QNAME, Double.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Integer> createDTORequestCashInConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmBrandId_QNAME, Integer.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Integer> createDTORequestCashInConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmCurrency_QNAME, Integer.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmDocument_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnSource_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnTarget_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmPin_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashOutPre.class)
    public JAXBElement<Double> createDTORequestCashOutPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashOutConfirmAmount_QNAME, Double.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashOutPre.class)
    public JAXBElement<Integer> createDTORequestCashOutPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmBrandId_QNAME, Integer.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashOutPre.class)
    public JAXBElement<Integer> createDTORequestCashOutPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmCurrency_QNAME, Integer.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmDocument_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnSource_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnTarget_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmPin_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashInPre.class)
    public JAXBElement<Double> createDTORequestCashInPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashOutConfirmAmount_QNAME, Double.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashInPre.class)
    public JAXBElement<Integer> createDTORequestCashInPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmBrandId_QNAME, Integer.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashInPre.class)
    public JAXBElement<Integer> createDTORequestCashInPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashOutConfirmCurrency_QNAME, Integer.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmDocument_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionLanguage_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnSource_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmMsisdnTarget_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionPassword_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmPin_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreUser(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUser_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUtfiAutoReversionUtfi_QNAME, String.class, DTORequestCashInPre.class, value);
    }

}
