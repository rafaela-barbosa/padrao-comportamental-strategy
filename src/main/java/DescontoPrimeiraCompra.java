public class DescontoPrimeiraCompra implements Desconto {

    public float aplicarDesconto(float preco) {
        return preco - (preco * 0.20f);
    }
}
