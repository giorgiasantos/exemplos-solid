package Ex01SingleResponsibility;

public class MostrarNaBiblioteca {
    //ATRIBUTOS
    private AdicionarLivro adicionarLivro;
    //CONSTRUCTOR
    public MostrarNaBiblioteca(AdicionarLivro adicionarLivro) {
        this.adicionarLivro = adicionarLivro;
    }

    // MÉTODOS
    public void exibirInfos() {
        System.out.println("DETALHES DO LIVRO");
        System.out.println("Título: " + adicionarLivro.getTitulo());
        System.out.println("Autor: " + adicionarLivro.getAutor());
        System.out.println("Número de páginas: " + adicionarLivro.getPaginas());
        System.out.println("Já lido: " + adicionarLivro.isJaLido());
        System.out.println("-----------------------------");
    }
}
