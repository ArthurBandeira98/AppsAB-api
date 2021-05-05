package com.restaurante_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante_api.model.Cardapio;
import com.restaurante_api.repository.CardapioRepository;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private CardapioRepository cardapioRepository;

    @GetMapping
    private List<Cardapio> buscaCardapio() {
	return cardapioRepository.findAll();
    }

}
