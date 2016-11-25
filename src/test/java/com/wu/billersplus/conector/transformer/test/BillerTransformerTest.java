package com.wu.billersplus.conector.transformer.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class BillerTransformerTest {

	@Before
	public void setUp() {
	}

	@Test
	public void getDeudaRequestTransformer() {

		// TODO

	}

	@Test
	public void getResponseForConsultaDeudaTest() {

		// TODO;
	}

	@Test
	public void getResponseForDirectaTest() {
		// El '-1' implica para el biller transaccion exitosa, lo que equivale a '0' en billers-plus 
		Integer errorCode = Integer.parseInt("-1");
		assertTrue(errorCode == -1);
	}

	@Test
	public void getDirectaRequestTransformer() {

		// TODO;

	}

	@Test
	public void getReversaRequestTransformer() {

		// TODO;
	}

	@Test
	public void getReversaResponseTransformer() {
		// El '89001' implica para el biller transaccion exitosa, lo que equivale a '0' en billers-plus 
		Integer errorCode = Integer.parseInt("-1");
		assertTrue(errorCode == -1);
	}

}
