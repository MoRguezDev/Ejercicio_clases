public class Libros {
    String titulo;
    String autor;

    // Constructor
    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void consultar(){
        System.out.println("El libro " + titulo + " fue realizado por el autor " + autor);
    }
}
