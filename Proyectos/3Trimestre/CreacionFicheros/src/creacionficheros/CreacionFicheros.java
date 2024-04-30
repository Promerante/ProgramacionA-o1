package creacionficheros;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreacionFicheros {
    public static void main(String[] args) {
        try {
            String Pregunta1="Dime tu nombre>>";
            String Pregunta2="Dime tu edad>>";
            Scanner sc=new Scanner(System.in);
            System.out.println(Pregunta1);
            String nombre=sc.next();
            System.out.println(Pregunta2);
            String Edad=sc.next();
            System.out.println("Datos guardados en ficher datos.txt");
        } 
        catch (Exception e) {
        }
    }

}
