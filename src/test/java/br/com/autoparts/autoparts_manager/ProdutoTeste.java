
package br.com.autoparts.autoparts_manager;

import br.com.autoparts.autoparts_manager.model.Produto;

import java.math.BigDecimal;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto1 = new Produto(
                "Filtro de óleo",
                "Bosch",
                20
        );

        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getMarca());
        System.out.println(produto1.getEstoque());

        produto1.setEstoque(35);
        System.out.println(produto1.getEstoque());


        try {
            produto1.setEstoque(-10);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao alterar estoque!");
            System.out.println(e.getMessage());
        }
        System.out.println("Estoque final: " + produto1.getEstoque());

        produto1.setPrecoVenda(new BigDecimal("89.90"));

        System.out.println("Preço atual: R$ " + produto1.getPrecoVenda());


        try {
            produto1.setPrecoVenda(new BigDecimal(-50.00));

        } catch (IllegalArgumentException e) {

            System.out.println("Erro ao alterar o preço");
            System.out.println(e.getMessage());

            System.out.println("Preço final: R$ " + produto1.getPrecoVenda());


        }


    }
    }

