package ejerciciot1c2;
import java.util.Random;
public class EJERCICIOT1C2 {
    public static void main(String[] args) {
 

/*Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100 (ambos incluidos) y que
los muestre por pantalla. A continuación, el programa deberá mostrar por separado los múltiplos de 2, de 3 y de 5. */
       
      Random random = new Random();  
      int [] a = new int[20];  //Declaramos el tamaño del array
      int d, t, c;
     
        System.out.print("Array generado:");
       
      for( int i=0; i<20; i++){
        a[i] = random.nextInt(100)+1; //Usamos un random para generar 20 numeros aleatorios
        System.out.print(a[i] + " ");
      }
        System.out.println(); // Este sout lo usamos para que realice un salto de linea y no se junte el primero con el segundo
 
        System.out.print("Multiplos de 2: ");  // Vamos a sacar los múltiplos de 2
            for ( d=2; d<=100; d +=2){         // Al ser 2, tiene que ir sacando numeros de 2 en 2, d=2 quiere decir que empieza en 2, d +=2 quiere decir que va sumando de 2 en 2
            System.out.print(d + " ");
      }
        System.out.println();  //Este sout lo usamos para que realice un salto de linea y no se junten
               
        System.out.print("Multiplos de 3: "); // Vamos a sacar los múltiplos de 3
            for (t=3; t<=100; t+=3){
                System.out.print(t + " ");
      }
        System.out.println();  //Este sout lo usamos para que realice un salto de linea y no se junten
           
           
         System.out.print("Multiplos de 5: "); // Vamos a sacar los múltiplos de 5
            for (c=5; c<=100; c+=5){
                System.out.print(c + " ");  
           
            }

    }

}
