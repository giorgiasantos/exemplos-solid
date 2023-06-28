package Ex02OpenClosedPrinciple;

public class ResumoJardinagem {
    private Planta planta;

    public ResumoJardinagem(Planta planta) {
        this.planta = planta;
    }

    public void minutosNoJardim(){
        int minAparando = planta.apararGalhos(2);
        int minAguando = planta.aguar(8);
        int minTotal = minAguando + minAparando;
        System.out.println("HOJE VOCÊ PASSOU " + minTotal + " MIN CUIDANDO DO SEU JARDIM.");

    }
}
