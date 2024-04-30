package tema5.Polimorfismo;

import java.util.Scanner;
public class Forma {
    private String color;
    private String nombre;

    public Forma(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.print("Introduce el color de tu forma");
        Scanner sc= new Scanner(System.in);
        String Color=sc.next();
        this.color = Color;
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double CalcularArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Forma{" + "color=" + color + ", nombre=" + nombre + '}';
    }
    

}
