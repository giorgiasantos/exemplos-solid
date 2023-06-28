package Ex02OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Cacto cacto = new Cacto();
        cacto.colocarNoSol("varanda");
        ResumoJardinagem novoResumo = new ResumoJardinagem(cacto);
        novoResumo.minutosNoJardim();



    }
}
