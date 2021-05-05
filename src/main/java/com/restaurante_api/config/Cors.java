package com.restaurante_api.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Cors implements Filter {

    @Autowired
    private RestauranteApiProperty restauranteApiProperty;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {

	HttpServletRequest req = (HttpServletRequest) request;
	HttpServletResponse resp = (HttpServletResponse) response;

	resp.setHeader("Access-Control-Allow-Origin", restauranteApiProperty.getOrigemPermitida());
	resp.setHeader("Access-Control-Allow-Credentials", "true");

	if (req.getMethod().equals("OPTIONS")
		&& restauranteApiProperty.getOrigemPermitida().equals(req.getHeader("Origin"))) {
	    resp.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
	    resp.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
	    resp.setHeader("Access-Control-Max-Age", "3600");

	    resp.setStatus(HttpServletResponse.SC_OK);
	} else {
	    chain.doFilter(request, response);
	}

    }

}
