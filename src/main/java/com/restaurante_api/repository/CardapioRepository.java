package com.restaurante_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurante_api.model.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Integer>{

}
