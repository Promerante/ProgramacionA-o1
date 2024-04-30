/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_arrays;
import java.util.Scanner;
/**
 *
 * @author Medac Tarde
 */
public class Ejercicio6 {
  /*------------------------------------------------------------------------
----
6)CON METODOS STRING
Pide al usuario por teclado una frase y pasa sus caracteres a un array
de caracteres. Puedes hacer con o sin métodos de String.
/-------------------------------------------------------------------------
*/


public class MostrarCaracteresCadena {
public static void main(String[] args) {
Scanner sn=new Scanner(System.in);
//Pido al usuario que escriba una frase
System.out.println("Escriba una frase");
//Recomiendo usar nextLine en lugar de next por los espacios
String frase=sn.nextLine();
//Creamos un array de caracteres usando el metodo de String
char caracteres[]=frase.toCharArray();
//Recorremos la frase y cogemos cada caracter y lo metemos en el array

for(int i=0;i<frase.length();i++){
System.out.println(caracteres[i]);
}
}
}  
}
