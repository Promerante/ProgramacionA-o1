package tema4_arrays;

/*------------------------------------------------------------------------
-----
3) Crea un array de números de un tamaño pasado por teclado, el array
contendrá
números aleatorios primos entre los números deseados, por último nos
indica cual es el mayor de todos.
Haz un método para comprobar que el número aleatorio es primo, puedes
hacer
todos lo métodos que necesites.
número primo
Número entero que solamente es divisible por él mismo (positivo y
negativo)
y por 1.
"el 2 es un número primo porque solamente es divisible por 2, -2, 1 y
-1"
-------------------------------------------------------------------------
-----*/

import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
    Ejercicio1 metodo = new Ejercicio1();
Scanner teclado = new Scanner (System.in);
//Indicamos el tamaño
System.out.println("Introduce un tamaño");
int num = teclado.nextInt();
int[] array= new int[num];
//Invocamos las funciones
rellenarNumPrimosAleatorioArray(array, 1, 100);
mostrarArray(array);
//Saco el primo mayor
int primoMayor=mayor(array);
System.out.println("El primo más grande es el "+primoMayor);
}
public static void rellenarNumPrimosAleatorioArray(int lista[], int a,
int b){
int i=0;
//Usamos mejor un while, ya que solo aumentara cuando genere un primo

while(i<lista.length){
int num=((int)Math.floor(Math.random()*(a-b)+b));
if (esPrimo(num)){
lista[i]=num;
i++;
}
}
}
private static boolean esPrimo (int num){
//Un numero negativo, el 0 y el 1, son directamente no primos.
for(int i=2;i<num;i++) {
if(num%i==0)
return false;
}
return true;
}
public static void mostrarArray(int lista[]){
for(int i=0;i<lista.length;i++){
System.out.println("En el indice "+i+" esta el valor "+lista[i]);
}
}
public static int mayor(int lista[]){
int mayor=0;
for(int i=0;i<lista.length;i++){
if(lista[i]>mayor){
mayor=lista[i];
}
}
return mayor;
}
}
