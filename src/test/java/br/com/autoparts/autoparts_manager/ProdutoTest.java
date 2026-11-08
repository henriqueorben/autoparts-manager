
package br.com.autoparts.autoparts_manager;

import br.com.autoparts.autoparts_manager.model.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigDecimal;

public class ProdutoTest {


    @Test
    void naoDeveAceitarEstoqueNegativo() {

        Produto produto = new Produto(
                "Filtro de óleo", "Bosch", 20
        );

        assertThrows(IllegalArgumentException.class, () -> {
            produto.setEstoque(-10);
        });

    }


    @Test
    void deveAtualizarEstoqueCorretamente() {

        Produto produto = new Produto(
                "Filtro de óleo", "Bosch", 20
        );

        produto.setEstoque(35);

        assertEquals(35, produto.getEstoque());
    }
    @Test
    void naoDeveAceitarPrecoNegativo() {

        Produto produto = new Produto("Pastilha de freio", "Cobreq", 15);

        assertThrows(IllegalArgumentException.class, () -> {
            produto.setPrecoVenda(new BigDecimal("-50.00"));
        });
    }

    @Test
    void deveAceitarPrecoValido() {

        Produto produto = new Produto(
                "Pastilha de freio", "Cobreq", 15
        );
        produto.setPrecoVenda(new BigDecimal("89.90"));
        assertEquals(new BigDecimal("89.90"), produto.getPrecoVenda());

    }
}
