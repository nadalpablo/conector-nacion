package com.wu.billersplus.connector.entities;

/**
 * Clase que podría usarse como parámetros del conector así todas las properties
 * están configuradas en un solo lugar
 *
 */
public class ParametrosConector {

	public static final String PROXY_TIMEOUT_PROPERTY = "client.connectionTimeout";
	public static final String PROXY_URL_PARAMETER = "client.url";
	public static final String PROXY_SOCKETTIMEOUT_PROPERTY = "client.socketTimeout";
	public static final String MAX_CONNECTIONS_PROPERTY= "client.cantidadMaximaConexiones";
	public static final String TRUSTED_CERTIFICATES_PROPERTY= "client.trustAllCertificates";
	
	public static final String USER_PROPERTY = "user";
	public static final String PASSWORD_PROPERTY = "password";
	public static final String LANGUAGE_PROPERTY = "language";
	public static final String BRANDID_PROPERTY = "brandid";
	public static final String MSISDNTARGET_PROPERTY = "msisdntarget";
	public static final String PIN_PROPERTY = "pin";
	
	public static final String SEPARATOR_PROPERTY = ".";

}
