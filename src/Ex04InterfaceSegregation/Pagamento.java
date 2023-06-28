package Ex04InterfaceSegregation;

import java.util.HashMap;
import java.util.Map;

public class Pagamento implements AVista, Cartao{

    String item;

    public Pagamento(String item) {
        this.item = item;
    }

    public void pagamentoAVista(double valor) {
        System.out.println("ITEM = " + item);
        System.out.println("VALOR = R$ " + valor);
        System.out.println("SEU MÉTODO DE PAGAMENTO ESCOLHIDO É À VISTA. SEU TOTAL SERÁ R$" + valor);
    }


    public void pagamentoCartao(double valor) {
        System.out.println("ITEM = " + item);
        double valorCartao = valor + (valor * 0.1);
        System.out.println("VALOR = R$ " + valor);
        System.out.println("SEU MÉTODO DE PAGAMENTO ESCOLHIDO É CARTÃO. VOCÊ PAGARÁ UMA TAXA DE 10% A MAIS. SEU TOTAL SERÁ R$" + valorCartao);
    }
}
