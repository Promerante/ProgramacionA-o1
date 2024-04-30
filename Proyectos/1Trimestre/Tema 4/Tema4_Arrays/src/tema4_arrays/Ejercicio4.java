package tema4_arrays;


public class Ejercicio4 {
/*------------------------------------------------------------------------
-
* 4) Crea un array de números de 100 posiciones, que contendrá los
números
* del 1 al 100.
* Obtén la suma de todos ellos y la media.
-------------------------------------------------------------------------
-*/
public static void main(String[] args) {
//Creo un array
int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media;
//Recorro el array, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la meda
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
}
    

