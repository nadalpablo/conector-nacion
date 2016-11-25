package us.inswitch.mts.webservices.bn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-03T14:45:07.632-03:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://bn.webservices.mts.inswitch.us", name = "MTSServiceREDPortType")
@XmlSeeAlso({us.inswitch.mts.model.xsd.ObjectFactory.class, us.inswitch.mts.exceptions.xsd.ObjectFactory.class, us.inswitch.mts.webservices.dto.service.request.xsd.ObjectFactory.class, ObjectFactory.class, us.inswitch.mts.webservices.dto.service.response.xsd.ObjectFactory.class})
public interface MTSServiceREDPortType {

    @WebMethod(operationName = "cashInConfirm_red", action = "urn:cashInConfirm_red")
    @Action(input = "urn:cashInConfirm_red", output = "urn:cashInConfirm_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:cashInConfirm_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "cashInConfirm_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashInConfirmRed")
    @ResponseWrapper(localName = "cashInConfirm_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashInConfirmRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm cashInConfirmRed(
        @WebParam(name = "dtoRequestCashInConfirm", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInConfirm dtoRequestCashInConfirm
    ) throws MTSServiceREDServiceException_Exception;

    @WebMethod(operationName = "cashInPre_red", action = "urn:cashInPre_red")
    @Action(input = "urn:cashInPre_red", output = "urn:cashInPre_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:cashInPre_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "cashInPre_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashInPreRed")
    @ResponseWrapper(localName = "cashInPre_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashInPreRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre cashInPreRed(
        @WebParam(name = "dtoRequestCashInPre", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInPre dtoRequestCashInPre
    ) throws MTSServiceREDServiceException_Exception;

    @WebMethod(operationName = "cashOutPre_red", action = "urn:cashOutPre_red")
    @Action(input = "urn:cashOutPre_red", output = "urn:cashOutPre_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:cashOutPre_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "cashOutPre_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashOutPreRed")
    @ResponseWrapper(localName = "cashOutPre_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashOutPreRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre cashOutPreRed(
        @WebParam(name = "dtoRequestCashOutPre", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutPre dtoRequestCashOutPre
    ) throws MTSServiceREDServiceException_Exception;

    @WebMethod(operationName = "agentAutoReversion_red", action = "urn:agentAutoReversion_red")
    @Action(input = "urn:agentAutoReversion_red", output = "urn:agentAutoReversion_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:agentAutoReversion_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "agentAutoReversion_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.AgentAutoReversionRed")
    @ResponseWrapper(localName = "agentAutoReversion_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.AgentAutoReversionRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseAgentAutoReversion agentAutoReversionRed(
        @WebParam(name = "dtoRequestAgentAutoReversion", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestAgentAutoReversion dtoRequestAgentAutoReversion
    ) throws MTSServiceREDServiceException_Exception;

    @WebMethod(operationName = "utfiAutoReversion_red", action = "urn:utfiAutoReversion_red")
    @Action(input = "urn:utfiAutoReversion_red", output = "urn:utfiAutoReversion_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:utfiAutoReversion_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "utfiAutoReversion_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.UtfiAutoReversionRed")
    @ResponseWrapper(localName = "utfiAutoReversion_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.UtfiAutoReversionRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion utfiAutoReversionRed(
        @WebParam(name = "dtoRequestUtfiAutoReversion", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion dtoRequestUtfiAutoReversion
    ) throws MTSServiceREDServiceException_Exception;

    @WebMethod(operationName = "cashOutConfirm_red", action = "urn:cashOutConfirm_red")
    @Action(input = "urn:cashOutConfirm_red", output = "urn:cashOutConfirm_redResponse", fault = {@FaultAction(className = MTSServiceREDServiceException_Exception.class, value = "urn:cashOutConfirm_redMTSServiceREDServiceException")})
    @RequestWrapper(localName = "cashOutConfirm_red", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashOutConfirmRed")
    @ResponseWrapper(localName = "cashOutConfirm_redResponse", targetNamespace = "http://bn.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bn.CashOutConfirmRedResponse")
    @WebResult(name = "return", targetNamespace = "http://bn.webservices.mts.inswitch.us")
    public us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm cashOutConfirmRed(
        @WebParam(name = "dtoRequestCashOutConfirm", targetNamespace = "http://bn.webservices.mts.inswitch.us")
        us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm dtoRequestCashOutConfirm
    ) throws MTSServiceREDServiceException_Exception;
}