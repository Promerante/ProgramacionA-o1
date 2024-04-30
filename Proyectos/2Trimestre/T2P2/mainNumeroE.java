package T3P1;


import java.util.Scanner;
import java.util.Objects;

public class mainNumeroE {

    public static void main(String[] args) {
        
        //Variables
        String nombre =""; //PON AQUI TU NOMBRE Y PRIMER APELLIDO
        
        Scanner entrada = new Scanner(System.in);
        int v1 = -100, v2 = -100; //valores que se piden al usuario
        int cociente=0; //resultado de la division
        double raiz = 0; //resultado de la raiz cuadrada

        //Solicito el un valor y creo el primer número
        System.out.print("Introduce primer valor positivo: ");
        v1 = entrada.nextInt();
        NumeroE n1 = new  NumeroE(v1);
        
        //Solicito el otro valor y creo el segundo número
        System.out.print("Introduce segundo valor positivo: ");
        v2 = entrada.nextInt();
        NumeroE n2 = new  NumeroE(v2);
         
        //Realizo las operaciones
        cociente = n1.getNumero() / n2.getNumero();
        raiz = Math.sqrt(n1.getNumero()-n2.getNumero());
        
        System.out.println("El cociente da como resultado: "+cociente);
        System.out.println("La raiz de la suma da como resultado: "+raiz);
        
        
        //Fin del programa
        
        
        //----------------------------------------------
        //Linea de comprobación: NO HACER CASO y NO TOCAR
        System.out.print("\n Codigo de chequeo de alumno: ");
        System.out.println(checkNumber(nombre, v1, v2));
        //----------------------------------------------
        
    }
    
    //NO HACER CASO y NO TOCAR
    public static int checkNumber(String n, int a, int b){         
        return Objects.hash(String.valueOf(n),Integer.valueOf(a),Integer.valueOf(b));
    }

}
