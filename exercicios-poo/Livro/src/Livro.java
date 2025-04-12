public class Livro {
    private String autor;
    private String titulo;

    void exibeDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
