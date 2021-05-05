package com.restaurante_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardapio")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private Long preco;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Long getPreco() {
	return preco;
    }

    public void setPreco(Long preco) {
	this.preco = preco;
    }

}
