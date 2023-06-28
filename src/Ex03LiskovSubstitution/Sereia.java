package Ex03LiskovSubstitution;

public class Sereia extends Peixe{

    public void nadar() {
        System.out.println(getNome() + " está nadando. WEEEEEE!!! :D");
    }

    public void darOi(String nome) {
        setNome(nome);
        System.out.println("Oi , " + getNome());
    }
}
