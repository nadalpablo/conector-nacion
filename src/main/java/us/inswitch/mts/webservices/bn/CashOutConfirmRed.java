
package us.inswitch.mts.webservices.bn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm;


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
 *         &lt;element name="dtoRequestCashOutConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashOutConfirm" minOccurs="0"/&gt;
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
    "dtoRequestCashOutConfirm"
})
@XmlRootElement(name = "cashOutConfirm_red")
public class CashOutConfirmRed {

    @XmlElementRef(name = "dtoRequestCashOutConfirm", namespace = "http://bn.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashOutConfirm> dtoRequestCashOutConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashOutConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashOutConfirm> getDtoRequestCashOutConfirm() {
        return dtoRequestCashOutConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashOutConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutConfirm }{@code >}
     *     
     */
    public void setDtoRequestCashOutConfirm(JAXBElement<DTORequestCashOutConfirm> value) {
        this.dtoRequestCashOutConfirm = value;
    }

}
