package excepcionesejercicios;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class main106 {
   
    public static void main(String[] args) {
        int numCorrecto=new Random().nextInt(101);
        int intentos=1;
        int numUsuario=-1;
        Scanner sc=new Scanner(System.in);        
            while(numUsuario!=numCorrecto){
                try {
                    System.out.println("Escribe el numero de tu intento "+ intentos);
                    numUsuario=sc.nextInt();
                    if (numUsuario>numCorrecto) {
                        System.out.println("El numero "+numUsuario +" es mayor,intentelo de nuevo");               
                    }
                    else if(numUsuario<numCorrecto){
                        System.out.println("El numero "+numUsuario +" es menor,intentelo de nuevo");         
                    }  
                intentos++;        
                }
                catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Deberias haber puesto un numero");
                }
            
            
        
            
        }
        
        

    }

}
