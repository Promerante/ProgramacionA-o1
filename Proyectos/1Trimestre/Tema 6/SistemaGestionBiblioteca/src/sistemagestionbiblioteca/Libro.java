package sistemagestionbiblioteca;


public class Libro {
    private String titulo,autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo:" + titulo + ", autor:" + autor + ", a\u00f1oPublicacion:" + añoPublicacion + '}';
    }
    
    
    

}
