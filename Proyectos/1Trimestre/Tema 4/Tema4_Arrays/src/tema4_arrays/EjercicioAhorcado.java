/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Medac Tarde
 */
public class EjercicioAhorcado {
   /*------------------------------------------------------------------------
-----
9) Juego AHORCADO
Realizar el juego del ahorcado.
1. Al iniciar el programa, este deberá escoger una palabra al azar de
entre 3.
* Esta será la palabra secreta que el usuario deberá adivinar.
2. El programa contará la cantidad de letras de la palabra escogida y
creará
* ese número de letras (inicialmente con guiones bajos).
3.El usuario deberá ir introduciendo letra a letra hasta adivinar la
palabra
* secreta.
4. Si el usuario acierta alguna de las letras de la palabra, su
correspondiente
* guion bajo será sustituido por la letra correspondiente.
--------------------------------------------------------------------------
--- */


public class Ahorcado {
    public static void main (String[] args) {
//Declaramos variables
boolean juegoTerminado = false;
boolean juegoGanado= false;
Scanner entrada = new Scanner(System.in);
boolean algunaLetraAcertada =false;
//Obtenemos una palabras secreta
String palabraSecreta = getPalabraSecreta();
char [] palabraGuiones = getGuionesPalabra(palabraSecreta);
do {
System.out.println("Adivina la palabra!");
System.err.println(palabraGuiones);
System.out.println(" Introduce una letra de la palabra ");
char letra = entrada.next().toLowerCase().charAt(0);
for (int i = 0; i < palabraSecreta.length(); i++) {
if (palabraSecreta.charAt(i) == letra) {
palabraGuiones[i]=letra;
algunaLetraAcertada=true;
}
}
if(!algunaLetraAcertada){
System.err.println("¡No has acertado ninguna letra!");
}else
juegoGanado = !hayGuiones(palabraGuiones);
if (juegoGanado) {
System.err.println("HAS GANADO!");
juegoTerminado=true;
}
} while (!juegoTerminado);
entrada.close();
}
public static String getPalabraSecreta() {
/*----------------------------------------------------------------------
--
Función: getPalabraSecreta
Devuelve un tipo String con la palabra seleccionada aleatoriamente de
un
array de String con 3 palabras
-----------------------------------------------------------------------
-*/
//Declaramos el array de String con 3 palabras secretas
String[] palabras = {"padel", "tenis","futbol"};
/*---------------------------------------------------------------------
--
Generar numero aleatorios con la clase Random de java.util
Random r = new Random();
int valorDado = r.nextInt(10); // Entre 0 y 9, el 10 excluido.
int valorDado = r.nextInt(10)+1; // Entre 0 y 10 excluido, más 1,
es decir, del 1 al 10 ambos
incluidos
----------------------------------------------------------------------
--*/
//Definimos un numero aleatorio de tipo Random
Random aleatorio = new Random();
//Obtenemos un numero aletorio de 0 a 2 que es el tamaño del array palabras

int eleccion = aleatorio.nextInt(palabras.length);
//Devolvemos una de las palabras del array
return palabras[eleccion];
}
public static char [] getGuionesPalabra(String palabra){
/*----------------------------------------------------------------------
--
Función: getGuionesPalabra(String palabra)
Devuelve un array de caracteres rellenos de guiones '-' del tamaño de
la
palabra que recibimos como parametros.
-----------------------------------------------------------------------
-*/
//Obtenemos el nº de caracteres de la palabra que nos llega por parametro

int nLetrasPalabra = palabra.length();
//Declaramos un array de caracteres del tamaño de la palabra
char[] palabraGuiones = new char[nLetrasPalabra];
//Rellenemos el array con guiones
for (int i = 0; i < palabraGuiones.length; i++) {
palabraGuiones[i]='-';
}
//Retornamos el array relleno de guiones
return palabraGuiones;
}
public static boolean hayGuiones(char [] array) {
for (int i = 0; i < array.length; i++) {
if (array[i]=='-') {
return true;
}
}
return false;
}
} 
}
