
package us.inswitch.mts.webservices.bn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm;


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
 *         &lt;element name="return" type="{http://response.service.dto.webservices.mts.inswitch.us/xsd}DTOResponseCashInConfirm" minOccurs="0"/&gt;
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
    "_return"
})
@XmlRootElement(name = "cashInConfirm_redResponse")
public class CashInConfirmRedResponse {

    @XmlElementRef(name = "return", namespace = "http://bn.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTOResponseCashInConfirm> _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}
     *     
     */
    public JAXBElement<DTOResponseCashInConfirm> getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}
     *     
     */
    public void setReturn(JAXBElement<DTOResponseCashInConfirm> value) {
        this._return = value;
    }

}
