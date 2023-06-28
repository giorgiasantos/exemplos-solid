package Ex01SingleResponsibility;

public class AdicionarLivro {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int paginas;
    private boolean jaLido;

    //GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isJaLido() {
        return jaLido;
    }

    public void setJaLido(boolean jaLido) {
        this.jaLido = jaLido;
    }

    //MÉTODOS
    public void adicionar(String titulo, String autor, int paginas, boolean jaLido){
        System.out.println("ADICIONANDO LIVRO....");
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        setJaLido(jaLido);
        System.out.println("O livro " + getTitulo() + " foi adicionado com sucesso!");
        System.out.println("-----------------------------");
    }
}
