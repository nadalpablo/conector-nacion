package com.wu.billersplus.connector.service;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;

import org.apache.commons.validator.routines.UrlValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wu.billersplus.connector.entities.ParametrosConector;
import com.wu.billersplus.connector.exceptions.ConectorException;
import com.wu.billersplus.connector.exceptions.ProxyException;
import com.wu.billersplus.framework.configuration.PropertyHelper;
import com.wu.billersplus.framework.entities.BillerResponseWrapper;
import com.wu.billersplus.framework.service.ProxyService;
import com.wu.billersplus.framework.service.impl.ProxyServiceAbstract;

import ar.com.sepsa.commons.model.RespuestaPago;
import us.inswitch.mts.webservices.bn.MTSServiceRED;
import us.inswitch.mts.webservices.bn.MTSServiceREDPortType;
import us.inswitch.mts.webservices.bn.MTSServiceREDServiceException_Exception;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion;

public class ProxyServiceImpl extends ProxyServiceAbstract {

	private static Logger logger = LoggerFactory.getLogger(ProxyServiceImpl.class);

	private MTSServiceREDPortType service;

	public ProxyServiceImpl() {
		super();
	}

	@Override
	public BillerResponseWrapper<?> consulta(Object request) throws ConectorException {
		logger.error("[Conector Codigo {}] La operacion CONSULTA no debería invocarse en este conector",
				PropertyHelper.getConnectorCode());

		return new BillerResponseWrapper<RespuestaPago>();
	}

	@Override
	public BillerResponseWrapper<?> directa(Object request) throws ConectorException {

		DTORequestCashOutConfirm reqDirecta = (DTORequestCashOutConfirm) request;

		logConectorTraceRequest(reqDirecta, null);

		DTOResponseCashOutConfirm responseDirecta = null;

		try {
			responseDirecta = service.cashOutConfirmRed(reqDirecta);
		} catch (MTSServiceREDServiceException_Exception e) {
			e.printStackTrace();
		}

		logConectorTraceResponse(responseDirecta, null);

		return new BillerResponseWrapper<DTOResponseCashOutConfirm>(responseDirecta, mapBillerTrace(request),
				mapBillerTrace(responseDirecta));
	}

	@Override
	public BillerResponseWrapper<?> reversa(Object request) throws ConectorException {
		DTORequestUtfiAutoReversion reqAnulacion = (DTORequestUtfiAutoReversion) request;

		logConectorTraceRequest(request, null);

		DTOResponseUtfiAutoReversion responseReversa = null;

		try {
			responseReversa = service.utfiAutoReversionRed(reqAnulacion);
		} catch (MTSServiceREDServiceException_Exception e) {
			e.printStackTrace();
		}

		logConectorTraceResponse(request, null);

		return new BillerResponseWrapper<DTOResponseUtfiAutoReversion>(responseReversa, mapBillerTrace(request),
				mapBillerTrace(responseReversa));
	}

	@Override
	public BillerResponseWrapper<?> consultaEstado(Object request) throws ConectorException {
		logger.error("[Conector Codigo {}] La operacion CONSULTA DE ESTADO no debería invocarse en este conector",
				PropertyHelper.getConnectorCode());

		return new BillerResponseWrapper<RespuestaPago>();
	}

	@Override
	public ProxyService createClient(Map<String, String> arguments) throws ProxyException {
		/**
		 * Esta operación es la que instancia el proxy que se usará en la
		 * invocación de los servicios. Dentro del mapa de parámetros que viene
		 * como argumentos están todos los parámetros que el usuario de la
		 * aplicación de billers configuró para este conector. Estos parámetros
		 * son los que definimos nosotros al momento de registrar el conector
		 * con la operación com.wu.billersplus.framework.service.impl.
		 * ActualizarConectorServiceImpl.registrarConector(). Este listado de
		 * parametros es el que definimos en el archivo de propiedades en el
		 * atributo connector.parameters
		 * 
		 * En este caso se tenía una interfaz de servicio, por lo que usamos
		 * Resteasy junto con la clase TimeoutExecutor que provee setear un
		 * timeout y sockettimeout al cliente REST. En caso de usar una conexión
		 * HTTP plana se deberá instanciarla a mano
		 * 
		 * POR FAVOR, COMPLETAR LOS LOGS DE INSTANCIACION CON LOS PARAMETROS CON
		 * LOS QUE SE INSTANCIARÁ EL PROXY ASI EN EL SERVIDOR SE PUEDE HACER UN
		 * TRACE DE LOS PROXIES INSTANCIADOS
		 */

		try {
			if (this.service == null) {

				if (arguments.get(ParametrosConector.PROXY_URL_PARAMETER) == null) {
					throw new ProxyException(null, ProxyException.URL_INEXISTENTE);
				}

				logger.info(
						"[Conector Codigo {}] Instanciando proxy para el con URL {} connection timeout {} y socket timeout {}",
						PropertyHelper.getConnectorCode(), arguments.get(ParametrosConector.PROXY_URL_PARAMETER),
						arguments.get(ParametrosConector.PROXY_TIMEOUT_PROPERTY),
						arguments.get(ParametrosConector.PROXY_SOCKETTIMEOUT_PROPERTY));

				boolean trustAllCerts = Boolean
						.parseBoolean(arguments.get(ParametrosConector.TRUSTED_CERTIFICATES_PROPERTY));

				if (!trustAllCerts) {
					boolean valid = UrlValidator.getInstance()
							.isValid(arguments.get(ParametrosConector.PROXY_URL_PARAMETER));
					if (!valid) {
						throw new ProxyException(null, ProxyException.URL_INVALIDA);
					}
				}

				// Configuro el proxy
				this.prepareWebServiceConnection(trustAllCerts, arguments.get(ParametrosConector.USER_PROPERTY),
						arguments.get(ParametrosConector.PASSWORD_PROPERTY));

				URL url = new URL(arguments.get(ParametrosConector.PROXY_URL_PARAMETER) + "?wsdl");

				service = new MTSServiceRED(url).getMTSServiceREDHttpsSoap11Endpoint();

				((BindingProvider) service).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,
						arguments.get(ParametrosConector.USER_PROPERTY));
				((BindingProvider) service).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
						arguments.get(ParametrosConector.PASSWORD_PROPERTY));

			}

		} catch (Exception e) {
			logger.error("[Conector Codigo {}] Excepcion al crear el proxy");
			throw new RuntimeException(e);
		}

		return this;
	}

	private void prepareWebServiceConnection(Boolean trustAllCertificates, String username, String password)
			throws NoSuchAlgorithmException, KeyManagementException {

		if (trustAllCertificates) {
			// Marco todos los certificados como validos
			this.disableSSL();

			// Deshabilito la validacion de CN para los certificados
			this.disableCNValidation();
		}

		// Configuro el usuario y la contraseña a utilizar en cada request
		this.configureWebServiceUser(username, password);
	}

	private void disableSSL() throws NoSuchAlgorithmException, KeyManagementException {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		} };

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};

		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
	}

	private void disableCNValidation() {
		// Realizado con una property en el standalone-full.xml
	}

	private void configureWebServiceUser(String username, String password) {
		final String authUser = username;
		final String authPassword = password;

		Authenticator.setDefault(new Authenticator() {
			@Override
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword.toCharArray());
			}
		});
	}

}
