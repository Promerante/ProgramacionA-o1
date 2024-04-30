package sistemagestionbiblioteca;

public class SistemaGestionBiblioteca {
    public static void main(String[] args) {
        Libro Libro1=new Libro("Juramentada", "Sanderson", 2020);
        Libro Libro2=new Libro("El heroe de las eras", "Sanderson", 2010);
        Libro libro3 =new Libro("La rueda del tiempo", "Jordan", 2005);
        Biblioteca Libreria=new Biblioteca();
        Libreria.agregarLibro(Libro1);
        Libreria.agregarLibro(Libro2);
        Libreria.agregarLibro(libro3);
        Libreria.mostrarLibros();
        

    }

}
