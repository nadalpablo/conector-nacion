package com.wu.billersplus.connector.utils;

public enum CodigoMoneda {

	ARGENTINA("ARS", 1);

    private String codigo;
    private Integer valor;

    private CodigoMoneda(String codigo, Integer valor) {
    	this.codigo = codigo;
    	this.valor = valor;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public Integer getValor() {
        return this.valor;
    }
}
