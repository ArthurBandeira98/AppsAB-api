package com.restaurante_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("restauranteapi")
public class RestauranteApiProperty {

    private String origemPermitida = "http://localhost:8100/";

    private Seguranca seguranca = new Seguranca();

    @SuppressWarnings("unused")
    private Seguranca getSeguranca() {
	return seguranca;
    }

    public String getOrigemPermitida() {
	return origemPermitida;
    }

    public void setOrigemPermitida(String origemPermitida) {
	this.origemPermitida = origemPermitida;
    }

}
