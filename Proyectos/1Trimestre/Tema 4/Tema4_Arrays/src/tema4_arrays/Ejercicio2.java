package tema4_arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio2 {
    private static void RellenarArray(int array[]){
        Random rn = new Random();
        for(int i=0;i<array.length;i++){
            //array[i]= (int)Math.random()*(9-0+1)+0;   La forma de la clase,prefiero esta:
            array[i]= rn.nextInt(0,10);}
        }
    
    public static void AcabarArray(int array[]){
           int Total=0;
        System.out.println("Tu array generada es la siguiente: ");
        System.out.println("|-------------------|");
        for(int i=0;i<array.length;i++){
            System.out.println("Elemento "+(i+1)+":--->"+array[i]);
            Total=Total+array[i];
        }
         System.out.println("|-------------------|");
         System.out.println("Por último,el total de todos es igual a: "+Total);
    }
       
    public static void main (String[] args){
        int Tamaño;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el tamaño que desea en su array de números aleatorios:");
        Tamaño=sc.nextInt();
        int[] array=new int[Tamaño];
        RellenarArray(array);
        AcabarArray(array);
    }
    
}
