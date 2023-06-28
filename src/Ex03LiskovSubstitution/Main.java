package Ex03LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Peixe linguado = new Peixe();
        linguado.darOi("Linguado");
        linguado.nadar();
        Peixe sereia = new Sereia();
        sereia.darOi("Ariel");
        sereia.nadar();

    }
}
