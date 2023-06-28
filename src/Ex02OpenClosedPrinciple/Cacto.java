package Ex02OpenClosedPrinciple;

public class Cacto extends Planta {
    String local;
    public void colocarNoSol(String local){

        if (local.equalsIgnoreCase("jardim") || local.equalsIgnoreCase("varanda")) {
            System.out.println("Seu cacto já está recebendo bastante sol!");
        } else {
            System.out.println("Coloque seu cacto em " + local + " para receber sol.");
        }

    }
    public int apararGalhos (int qtdeDeGalhos){
        return qtdeDeGalhos * 2;
    }

    public int aguar (int qtdeDePlantas) {
        return qtdeDePlantas;
    }

}
