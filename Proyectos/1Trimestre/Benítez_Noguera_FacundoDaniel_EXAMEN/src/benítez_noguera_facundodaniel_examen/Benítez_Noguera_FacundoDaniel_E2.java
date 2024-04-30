package benítez_noguera_facundodaniel_examen;
import java.util.Random;
import java.util.Scanner;

public class Benítez_Noguera_FacundoDaniel_E2 {
    private static void RellenarArray(int lista[][]){
        Random rn = new Random();
        for (int[] lista1 : lista) {
            lista1[0] = rn.nextInt(5,51);
        }
    }   
    
    
    
    public static void main(String[] args) {
        Scanner tamaño=new Scanner(System.in);
        System.out.print("Introduce un número entero positivo mayor a 2: ");
        int Tamaño=tamaño.nextInt(); 
            while(Tamaño<=2){
            System.out.print("Introduce un número entero positivo mayor a 2: ");
            Tamaño=tamaño.nextInt();}//Con este bucle nos aseguramos que el tamaño de la array sera mayor que 0
        int[][] Array=new int[Tamaño][Tamaño];
        RellenarArray(Array);//Llamamos el metodo para que rellene la Array
    System.out.println("El array generado es: ");
        for (int[] Array1 : Array) {
            for(int[] Array2:Array){
               System.out.print(Array[0][0] + " ");
               System.out.print(Array[0][0] + " ");
            }
        } //Imprimimos la array
    }
  



}
