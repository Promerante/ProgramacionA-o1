package benítez_facundodaniel.Ejercicio2;


public class Libro {
    private String Titulo,Autor;    
    private double Precio;

    public Libro(String Titulo, String Autor, double Precio) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
    }//Nuevamente hacemos el Constructor con el orden estipulado

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }//Y otra vez introducimos los metodos getter and setter por si el usuario desea variarlo.
    
    public double calcularPrecioFinal(double IVA){        
        return Precio+(Precio*IVA)/100;     
    }/*Y este método nos dara el valor con decimales del verdadero valor del libro.
    OJO!! NO LE ASIGNA AL ATRIBUTO PRECIO DEL OBJETO LIBRO ESTE RESULTADO FINAL.
    ESO SERIA OTRO PROCESO QUE NO EXIGE EL EJERCICIO*/

    public String toString(){
        return "LIBRO ("+Titulo+"; "+Autor+"; "+calcularPrecioFinal(21)+')' ; 
    }

}
