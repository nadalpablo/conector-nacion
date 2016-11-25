
package us.inswitch.mts.webservices.bn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInConfirm;


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
 *         &lt;element name="dtoRequestCashInConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashInConfirm" minOccurs="0"/&gt;
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
    "dtoRequestCashInConfirm"
})
@XmlRootElement(name = "cashInConfirm_red")
public class CashInConfirmRed {

    @XmlElementRef(name = "dtoRequestCashInConfirm", namespace = "http://bn.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashInConfirm> dtoRequestCashInConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashInConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashInConfirm> getDtoRequestCashInConfirm() {
        return dtoRequestCashInConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashInConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}
     *     
     */
    public void setDtoRequestCashInConfirm(JAXBElement<DTORequestCashInConfirm> value) {
        this.dtoRequestCashInConfirm = value;
    }

}
