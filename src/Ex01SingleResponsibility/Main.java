package Ex01SingleResponsibility;

public class Main {
    public static void main(String[] args) {

        AdicionarLivro novoLivro = new AdicionarLivro();
        MostrarNaBiblioteca biblioteca = new MostrarNaBiblioteca(novoLivro);
        novoLivro.adicionar("Dom Casmurro", "Machado de Assis", 378, true);
        biblioteca.exibirInfos();
    }
}
