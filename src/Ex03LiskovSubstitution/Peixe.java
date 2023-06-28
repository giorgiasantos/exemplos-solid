package Ex03LiskovSubstitution;

public class Peixe {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nadar() {
        System.out.println(getNome() + " está nadando. WEEEEEE!!! :D");
    }

    public void darOi(String nome) {
        setNome(nome);
        System.out.println("Oi , " + getNome());
    }

}
