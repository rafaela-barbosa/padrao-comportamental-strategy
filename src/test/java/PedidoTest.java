import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {


    @Test
    void deveaplicarDescontoBlackFriday() {
        Pedido pedido = new Pedido();
        pedido.aplicarDescontoBlackFriday(100.0f);
        assertEquals(60.0f, pedido.getValorComDesconto());
    }

    @Test
    void deveAplicarDescontoOfertaRelampago() {
        Pedido pedido = new Pedido();
        pedido.aplicarDescontoOfertaRelampago(100.0f);
        assertEquals(50.0f, pedido.getValorComDesconto());
    }

    @Test
    void deveAplicarDescontoPrimeiraCompra() {
        Pedido pedido = new Pedido();
        pedido.aplicarDescontoPrimeiraCompra(100.0f);
        assertEquals(80.0f, pedido.getValorComDesconto());
    }

}
