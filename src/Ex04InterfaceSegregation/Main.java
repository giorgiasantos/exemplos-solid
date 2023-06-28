package Ex04InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        Cartao pagamento1 = new Pagamento("Bolo de Laranja");
        AVista pagamento2 = new Pagamento("Café com leite de castanha");
        pagamento1.pagamentoCartao(15.5);
        pagamento2.pagamentoAVista(13.0);
    }
}
