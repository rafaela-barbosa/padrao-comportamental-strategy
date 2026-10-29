public class CalculadoraDesconto {

    private float preco;


    public CalculadoraDesconto(float preco) {
        this.preco = preco;
    }

    public float calcular(Desconto calculoDesconto) {
        return calculoDesconto.aplicarDesconto(preco);
    }
}
