package excepcionesejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main104 {
    public static void main(String[] args) {
        try{
            System.out.println("Dime el tamaño de la array");
            Scanner sc=new Scanner(System.in);
            int[] b=new int[sc.nextInt()];
            for(int a=0;a<b.length;a++){
                System.out.println("Ponme un numero para la posicion "+ a);
                b[a]=sc.nextInt();            
            }           
        }
        catch(InputMismatchException e){
            System.out.println("Numero invalido");    
        }
        catch(NegativeArraySizeException e){
            System.out.println("Array negativa");
        }

    }

}
