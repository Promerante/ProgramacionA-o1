package tema4_arrays;

import java.util.Scanner;
public class Ejercicio1 {
    public static void MostrarArray(int Array[]){
        System.out.println("Tu array creada es: ");
        System.out.println("|-------------------|");
            for(int i=0;i<Array.length;i++){
                System.out.println("Elemento "+(i+1)+":---->"+Array[i]);}
        System.out.println("|-------------------|");}

    
    public static void main(String[] args) {
        
       
        int[] Array=new int[10];
        
        for(int i=0;i<Array.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Escribe el valor del elemento con índice "+(i+1)+" de la array:");
        Array[i]=sc.nextInt();
        
        
        }
        MostrarArray(Array);
        
    }
    
}
