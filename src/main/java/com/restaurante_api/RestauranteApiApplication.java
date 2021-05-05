package com.restaurante_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.restaurante_api.config.RestauranteApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(RestauranteApiProperty.class)
public class RestauranteApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(RestauranteApiApplication.class, args);
    }

}
