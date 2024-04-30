
package multiplo_de_5;

import java.util.Scanner;

        
public class Multiplo_de_5 {

    public static void main(String[] args) {
Scanner teclado_int = new Scanner(System.in);

int numero;

System.out.println("Introduce un número: ");

numero = teclado_int.nextInt();

if( numero % 5 == 0){
            System.out.println("Es multiplo de 5");

}else{
    System.out.println("No es multiplo de 5");
}
}
}
