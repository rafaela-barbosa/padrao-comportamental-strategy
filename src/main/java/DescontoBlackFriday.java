
public class DescontoBlackFriday implements Desconto {

    public float aplicarDesconto(float preco) {
        return preco - (preco * 0.40f);
    }
}
