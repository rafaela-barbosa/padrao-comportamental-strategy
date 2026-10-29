
public class DescontoOfertaRelampago implements Desconto {

    public float aplicarDesconto(float preco) {
        return preco - (preco * 0.50f);
    }
}
