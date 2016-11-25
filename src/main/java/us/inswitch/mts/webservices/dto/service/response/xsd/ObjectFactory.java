
package us.inswitch.mts.webservices.dto.service.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.service.response.xsd package. 
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

    private final static QName _DTOResponseUtfiAutoReversionCodeErrorId_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "codeErrorId");
    private final static QName _DTOResponseUtfiAutoReversionResultText_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "resultText");
    private final static QName _DTOResponseUtfiAutoReversionUtfi_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "utfi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.service.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTOResponseCashInPre }
     * 
     */
    public DTOResponseCashInPre createDTOResponseCashInPre() {
        return new DTOResponseCashInPre();
    }

    /**
     * Create an instance of {@link DTOResponseCashOutPre }
     * 
     */
    public DTOResponseCashOutPre createDTOResponseCashOutPre() {
        return new DTOResponseCashOutPre();
    }

    /**
     * Create an instance of {@link DTOResponseCashInConfirm }
     * 
     */
    public DTOResponseCashInConfirm createDTOResponseCashInConfirm() {
        return new DTOResponseCashInConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseCashOutConfirm }
     * 
     */
    public DTOResponseCashOutConfirm createDTOResponseCashOutConfirm() {
        return new DTOResponseCashOutConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseAgentAutoReversion }
     * 
     */
    public DTOResponseAgentAutoReversion createDTOResponseAgentAutoReversion() {
        return new DTOResponseAgentAutoReversion();
    }

    /**
     * Create an instance of {@link DTOResponseUtfiAutoReversion }
     * 
     */
    public DTOResponseUtfiAutoReversion createDTOResponseUtfiAutoReversion() {
        return new DTOResponseUtfiAutoReversion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionCodeErrorId_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionResultText_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUtfiAutoReversionUtfi_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

}
