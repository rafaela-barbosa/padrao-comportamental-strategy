
public class Pedido {

    private float valorComDesconto;

    public float getValorComDesconto() {
        return valorComDesconto;
    }

    public void aplicarDescontoBlackFriday(float preco) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(preco);
        this.valorComDesconto = calculadoraDesconto.calcular(new DescontoBlackFriday());
    }

    public void aplicarDescontoOfertaRelampago(float preco) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(preco);
        this.valorComDesconto = calculadoraDesconto.calcular(new DescontoOfertaRelampago());
    }

    public void aplicarDescontoPrimeiraCompra(float preco) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(preco);
        this.valorComDesconto = calculadoraDesconto.calcular(new DescontoPrimeiraCompra());
    }
}
