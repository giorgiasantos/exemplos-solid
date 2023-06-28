package Ex05DependencyInversion;

public class Main {
    public static void main(String[] args) {
        Pet cachorro = new Cachorro();
        Pet gato = new Gato();
        Interacao interacaoCachorro = new Interacao(cachorro);
        Interacao interacaoGato = new Interacao(gato);

        interacaoCachorro.falaroComPet();
        interacaoGato.falaroComPet();
        interacaoCachorro.alimentarPet();
        interacaoGato.alimentarPet();
    }
}
