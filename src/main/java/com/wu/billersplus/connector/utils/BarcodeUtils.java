package com.wu.billersplus.connector.utils;

public abstract class BarcodeUtils {

	private static final int CB1_LENGTH = 8;
	private static final int CB2_LENGTH = 10;
	private static final int CB3_LENGTH = 8;
	private static final int CB4_LENGTH = 6;
	private static final int CB5_LENGTH = 10;

	public static String getNumeroBiller(String barcode) {
		return barcode.substring(0, CB1_LENGTH);
	}

	public static String getNumeroCelular(String barcode) {
		return barcode.substring(CB1_LENGTH, CB1_LENGTH + CB2_LENGTH);
	}

	public static String getFechaCobro(String barcode) {
		return barcode.substring(CB1_LENGTH + CB2_LENGTH, CB1_LENGTH + CB2_LENGTH + CB3_LENGTH);
	}

	public static String getNumeroPin(String barcode) {
		return barcode
				.substring(CB1_LENGTH + CB2_LENGTH + CB3_LENGTH, CB1_LENGTH + CB2_LENGTH + CB3_LENGTH + CB4_LENGTH);
	}

	public static String getNumeroDocumento(String barcode) {
		return barcode.substring(CB1_LENGTH + CB2_LENGTH + CB3_LENGTH + CB4_LENGTH,
				CB1_LENGTH + CB2_LENGTH + CB3_LENGTH + CB4_LENGTH + CB5_LENGTH); //.replaceFirst("^0+(?!$)", "");
	}

	public static String getFlagSinFactura(String barcode) {
		return barcode.substring(CB1_LENGTH + CB2_LENGTH + CB3_LENGTH + CB4_LENGTH + CB5_LENGTH);
	}

}
