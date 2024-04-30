package tema5.AritmeticaPOOBasica71;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        double Primero=sc.nextDouble();
        System.out.println("Ahora el segundo:");
        Scanner sc2= new Scanner(System.in);        
        double Segundo=sc2.nextDouble();
        Aritmetica Numeros= new Aritmetica( Primero,Segundo) ;

        System.out.println(Numeros.toString());
        
        
       
        
        
        
    }

}
