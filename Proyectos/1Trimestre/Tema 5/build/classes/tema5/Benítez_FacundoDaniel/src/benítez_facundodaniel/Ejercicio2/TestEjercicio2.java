package benítez_facundodaniel.Ejercicio2;

public class TestEjercicio2 {
    public static void main(String[] args) {
        Libro ElQuijote=new Libro("Quijote", "Cervantes", 10.95);
        System.out.println(ElQuijote.calcularPrecioFinal(10));
        System.out.println(ElQuijote.toString());       
    }

}
