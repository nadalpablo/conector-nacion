package com.wu.billersplus.connector.transformers;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wu.billersplus.connector.entities.ConnectorRequest;
import com.wu.billersplus.connector.entities.ConnectorResponse;
import com.wu.billersplus.connector.entities.DeudaParameters;
import com.wu.billersplus.connector.entities.ParametrosConector;
import com.wu.billersplus.connector.utils.BarcodeUtils;
import com.wu.billersplus.entities.BillersPlusRequest;
import com.wu.billersplus.entities.ConsultaDeudaResponse;
import com.wu.billersplus.entities.PagoResponse;
import com.wu.billersplus.framework.cdi.qualifiers.BillerPlusServiceBean;
import com.wu.billersplus.framework.configuration.PropertyHandler;
import com.wu.billersplus.framework.configuration.PropertyHelper;
import com.wu.billersplus.framework.entities.BillerResponseWrapper;
import com.wu.billersplus.framework.transformer.BillerPlusTransformerService;

import us.inswitch.mts.model.xsd.TransactionValues;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion;
import us.inswitch.mts.webservices.dto.service.request.xsd.ObjectFactory;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion;

/**
 * 
 * Se deberán implementar aquí todas las transformaciones de datos necesarias
 * desde las clases de 100Billers Plus a sus respectivos requests para los
 * billers
 *
 */
@Stateless
@BillerPlusServiceBean
public class BillerTransformer implements BillerPlusTransformerService {

	private static Logger logger = LoggerFactory.getLogger(BillerTransformer.class);

	@Override
	public ConnectorResponse<ConsultaDeudaResponse> getResponseForConsultaDeuda(ConsultaDeudaResponse response,
			BillerResponseWrapper<?> consultaResponse) {
		logger.warn("Operacion getResponseForConsultaDeuda no implementada");
		return null;
	}

	@Override
	public Object getDeudaRequest(BillersPlusRequest consulta) {
		logger.warn("Operacion getBillersPlusDeuda no implementada");
		return null;
	}

	@Override
	public Object getDirectaRequest(ConnectorRequest cdRequest) {
		BillersPlusRequest dRequest = cdRequest.getBillersPlusRequest();

		ObjectFactory requestFactory = new ObjectFactory();
		DTORequestCashOutConfirm requestSoap = requestFactory.createDTORequestCashOutConfirm();

		logger.debug("Transformando request de DIRECTA con [CodigoProducto = {}]", dRequest.getProductoUtilityCode());

		if (dRequest.getImporte() != null) {
			requestSoap.setAmount(requestFactory
					.createDTORequestCashOutConfirmAmount(Double.parseDouble(dRequest.getImporte().toString())));
		}

		if (dRequest.getCodigoMoneda() != null) {
			requestSoap.setCurrency(requestFactory
					.createDTORequestCashOutConfirmCurrency(Integer.parseInt(dRequest.getCodigoMoneda())));
		}

		if (dRequest.getCodigoBarra() != null) {
			requestSoap.setDocument(requestFactory.createDTORequestCashOutConfirmDocument(
					BarcodeUtils.getNumeroDocumento(dRequest.getCodigoBarra())));

			requestSoap.setMsisdnSource(requestFactory.createDTORequestCashOutConfirmMsisdnSource(
					BarcodeUtils.getNumeroCelular(dRequest.getCodigoBarra())));

			requestSoap.setOtp(requestFactory
					.createDTORequestCashOutConfirmOtp(BarcodeUtils.getNumeroPin(dRequest.getCodigoBarra())));
		}

		if (dRequest.getIdCaja() != null && dRequest.getIdTransaccionFe() != null) {
			requestSoap.setUtfi(requestFactory.createDTORequestCashOutConfirmUtfi(
					dRequest.getIdCaja().toString() + dRequest.getIdTransaccionFe().toString()));
		}

		requestSoap.setBrandId(requestFactory.createDTORequestCashOutConfirmBrandId(
				Integer.parseInt(PropertyHandler.getPropertyString(ParametrosConector.BRANDID_PROPERTY + ".value"))));

		requestSoap.setLanguage(requestFactory.createDTORequestCashOutConfirmLanguage(
				PropertyHandler.getPropertyString(ParametrosConector.LANGUAGE_PROPERTY + ".value")));

		requestSoap.setMsisdnTarget(requestFactory.createDTORequestCashOutConfirmMsisdnTarget(
				PropertyHandler.getPropertyString(ParametrosConector.MSISDNTARGET_PROPERTY + ".value")));

		requestSoap.setPassword(requestFactory.createDTORequestCashOutConfirmPassword(
				PropertyHandler.getPropertyString(ParametrosConector.PASSWORD_PROPERTY + ".value")));

		requestSoap.setPin(requestFactory.createDTORequestCashOutConfirmPin(
				PropertyHandler.getPropertyString(ParametrosConector.PIN_PROPERTY + ".value")));

		requestSoap.setUser(requestFactory.createDTORequestCashOutConfirmUser(
				PropertyHandler.getPropertyString(ParametrosConector.USER_PROPERTY + ".value")));

		logger.info("[Conector Codigo {}] Ejecutando DIRECTA con [CodigoProducto {}]",
				PropertyHelper.getConnectorCode(), cdRequest.getBillersPlusRequest().getProductoUtilityCode());

		return requestSoap;
	}

	@Override
	public ConnectorResponse<PagoResponse> getResponseForDirecta(PagoResponse pago, BillerResponseWrapper<?> directa) {
		if (directa == null) {
			logger.warn("La respuesta de la consulta es nula");
			return new ConnectorResponse<PagoResponse>(pago, null, null, null);
		}

		if (directa.getResponseBiller() == null) {
			logger.warn("La respuesta wrappeada del biller es nula");
			return new ConnectorResponse<PagoResponse>(pago, null, directa.getRequestBillerTrace(),
					directa.getResponseBillerTrace());
		}

		DTOResponseCashOutConfirm response = (DTOResponseCashOutConfirm) directa.getResponseBiller();

		logger.debug("Transformando respuesta de DIRECTA con [CodigoProducto = {}]", pago.getProductoUtilityCode());

		if (response.getCodeErrorId() != null) {
			Integer errorCode = Integer.parseInt(response.getCodeErrorId().getValue());
			// El '-1' implica para el biller transaccion exitosa, lo que equivale a '0' en billers-plus 
			pago.setCodigoError(errorCode == -1 ? 0 : errorCode);
		}

		if (response.getResultCode() != null) {
			pago.setNumeroOperacionBiller(response.getResultCode().toString());
		}

		if (response.getResultText() != null) {
			pago.setDescripcionError(response.getResultText().getValue());
		}

		Map<String, String> datoAdicional = new HashMap<String, String>();

		if (response.getTransactionValues() != null && !response.getTransactionValues().isEmpty()) {
			for (TransactionValues transactionValue : response.getTransactionValues()) {
				if (transactionValue != null) {
					datoAdicional.put(transactionValue.getKey().getValue(), transactionValue.getValue().getValue());
				}
			}
		}

		if (response.getUtfi() != null) {
			datoAdicional.put(DeudaParameters.UTFI, response.getUtfi().getValue());
		}

		ConnectorResponse<PagoResponse> cResponse = new ConnectorResponse<PagoResponse>();
		cResponse.setResponse(pago);

		logger.info("Tamaño del mapa de parametros_adicionales_directa {}", datoAdicional.size());

		cResponse.setDatosAdicionalesDirecta(datoAdicional);
		cResponse.setRequestOriginalBiller(directa.getRequestBillerTrace());
		cResponse.setResponseOriginalBiller(directa.getResponseBillerTrace());

		logger.info("[Conector Codigo {}] Ejecutando ANULACION con [CodigoProducto {}]",
				PropertyHelper.getConnectorCode(), pago.getProductoUtilityCode());

		return cResponse;

	}

	@Override
	public Object getReversaRequest(ConnectorRequest request) {
		ObjectFactory requestFactory = new ObjectFactory();
		DTORequestUtfiAutoReversion requestSoap = requestFactory.createDTORequestUtfiAutoReversion();

		logger.debug("Transformando request de ANULACION con  [CodigoProducto = {}]",
				request.getBillersPlusRequest().getProductoUtilityCode());

		requestSoap.setLanguage(requestFactory.createDTORequestUtfiAutoReversionLanguage(
				PropertyHandler.getPropertyString(ParametrosConector.LANGUAGE_PROPERTY + ".value")));

		requestSoap.setPassword(requestFactory.createDTORequestUtfiAutoReversionPassword(
				PropertyHandler.getPropertyString(ParametrosConector.PASSWORD_PROPERTY + ".value")));

		requestSoap.setUser(requestFactory.createDTORequestUtfiAutoReversionUser(
				PropertyHandler.getPropertyString(ParametrosConector.USER_PROPERTY + ".value")));

		if (request.getDatosAdicionalesAnulacion() != null) {
			requestSoap.setUtfi(requestFactory.createDTORequestUtfiAutoReversionUtfi(
					request.getDatosAdicionalesAnulacion().get(DeudaParameters.UTFI)));
		}

		return requestSoap;
	}

	@Override
	public ConnectorResponse<PagoResponse> getResponseForReversa(PagoResponse pago, BillerResponseWrapper<?> reversa) {
		if (reversa == null) {
			logger.warn("La respuesta de la consulta es nula");
			return new ConnectorResponse<PagoResponse>(pago, null, null, null);
		}
		
		if (reversa.getResponseBiller() == null) {
			logger.warn("La respuesta wrappeada del biller es nula");
			return new ConnectorResponse<PagoResponse>(pago, null, reversa.getRequestBillerTrace(),
					reversa.getResponseBillerTrace());
		}

		DTOResponseUtfiAutoReversion response = (DTOResponseUtfiAutoReversion) reversa.getResponseBiller();

		logger.debug("Transformando respuesta de ANULACION con [CodigoProducto = {}]", pago.getProductoUtilityCode());

		if (response.getCodeErrorId() != null) {
			Integer errorCode = Integer.parseInt(response.getCodeErrorId().getValue());
			// El '-1' implica para el biller transaccion exitosa, lo que equivale a '0' en billers-plus 
			pago.setCodigoError(errorCode == -1 ? 0 : errorCode);
		}

		if (response.getResultCode() != null) {
			pago.setNumeroOperacionBiller(response.getResultCode().toString());
		}

		if (response.getResultText() != null) {
			pago.setDescripcionError(response.getResultText().getValue());
		}

		Map<String, String> datoAdicional = new HashMap<String, String>();

		if (response.getTransactionValues() != null && !response.getTransactionValues().isEmpty()) {
			for (TransactionValues transactionValue : response.getTransactionValues()) {
				if (transactionValue != null) {
					datoAdicional.put(transactionValue.getKey().getValue(), transactionValue.getValue().getValue());
				}
			}
		}

		if (response.getUtfi() != null) {
			datoAdicional.put(DeudaParameters.UTFI, response.getUtfi().getValue());
		}

		ConnectorResponse<PagoResponse> cResponse = new ConnectorResponse<PagoResponse>();
		cResponse.setResponse(pago);

		logger.info("Tamaño del mapa de parametros_adicionales_directa {}", datoAdicional.size());

		cResponse.setDatosAdicionalesDirecta(datoAdicional);
		cResponse.setRequestOriginalBiller(reversa.getRequestBillerTrace());
		cResponse.setResponseOriginalBiller(reversa.getResponseBillerTrace());
		cResponse.setResponse(pago);

		return cResponse;
	}

	@Override
	public Object getConsultaEstadoRequest(ConnectorRequest request) {
		logger.warn("Operacion getConsultaEstadoRequest no implementada");
		return null;
	}

	@Override
	public ConnectorResponse<PagoResponse> getResponseForConsultaEstado(PagoResponse pago,
			BillerResponseWrapper<?> obj) {
		logger.warn("Operacion getResponseForConsultaEstado no implementada");
		return null;
	}

}
