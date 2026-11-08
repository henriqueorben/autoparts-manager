package br.com.autoparts.autoparts_manager.model;

import java.math.BigDecimal;

public class Produto {

    private Long codigo;
    private String descricao;
    private String categoria;
    private String marca;
    private String modeloAplicacao;
    private BigDecimal precoVenda;
    private Integer estoque;


    public Produto(String descricao, String marca, Integer estoque) {
        setDescricao(descricao);
        this.marca = marca;
        setEstoque(estoque);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return this.descricao;
    }


    public void setDescricao(String descricao) {

        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException(
                    "A descrição do produto é obrigatória!"
            );
        }

        this.descricao = descricao;
    }



    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        if (estoque == null || estoque < 0) {
            throw new IllegalArgumentException(
                    "O estoque não pode ser nulo ou negativo!"
            );
        }
        this.estoque = estoque;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {

        if (precoVenda == null) {
            throw new IllegalArgumentException(
                    "O preço não pode ser nulo!"
            );
        }

        if (precoVenda.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(
                    "O preço não pode ser negativo!"
            );
        }

        this.precoVenda = precoVenda;
    }

}

