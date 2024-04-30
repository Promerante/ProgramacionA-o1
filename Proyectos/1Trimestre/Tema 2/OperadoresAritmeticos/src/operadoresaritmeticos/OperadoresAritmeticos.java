package operadoresaritmeticos;
import java.util.Scanner;
public class OperadoresAritmeticos {






    public static double numerosAleatorios() {
        double aleatorios;
        aleatorios=Math.floor(Math.random()*(9-0+1)+0 );
        return aleatorios;
    }

    public static void rellenarArray(int array[]) {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<array.length;i++) {
            array[i]=(int)numerosAleatorios();

        }


    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int var,suma=0;
    System.out.print("Introduce longitud del array: ");
    var = sc.nextInt();


    int array []= new int [var];

    rellenarArray(array);

    for(int i=0;i<var;i++) {
        suma+=array[i];
        System.err.println(array[i]);
    }


    System.out.println("La suma de los números de los arrays es: "+suma);

    }}


