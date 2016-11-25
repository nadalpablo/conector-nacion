
package us.inswitch.mts.model.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.model.xsd package. 
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

    private final static QName _TransactionValuesKey_QNAME = new QName("http://model.mts.inswitch.us/xsd", "key");
    private final static QName _TransactionValuesValue_QNAME = new QName("http://model.mts.inswitch.us/xsd", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.model.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionValues }
     * 
     */
    public TransactionValues createTransactionValues() {
        return new TransactionValues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.mts.inswitch.us/xsd", name = "key", scope = TransactionValues.class)
    public JAXBElement<String> createTransactionValuesKey(String value) {
        return new JAXBElement<String>(_TransactionValuesKey_QNAME, String.class, TransactionValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.mts.inswitch.us/xsd", name = "value", scope = TransactionValues.class)
    public JAXBElement<String> createTransactionValuesValue(String value) {
        return new JAXBElement<String>(_TransactionValuesValue_QNAME, String.class, TransactionValues.class, value);
    }

}
