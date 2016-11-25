
package us.inswitch.mts.webservices.bn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.exceptions.xsd.ServiceException;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceException" type="{http://exceptions.mts.inswitch.us/xsd}ServiceException" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceException"
})
@XmlRootElement(name = "MTSServiceREDServiceException")
public class MTSServiceREDServiceException {

    @XmlElementRef(name = "ServiceException", namespace = "http://bn.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceException> serviceException;

    /**
     * Obtiene el valor de la propiedad serviceException.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     *     
     */
    public JAXBElement<ServiceException> getServiceException() {
        return serviceException;
    }

    /**
     * Define el valor de la propiedad serviceException.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     *     
     */
    public void setServiceException(JAXBElement<ServiceException> value) {
        this.serviceException = value;
    }

}
