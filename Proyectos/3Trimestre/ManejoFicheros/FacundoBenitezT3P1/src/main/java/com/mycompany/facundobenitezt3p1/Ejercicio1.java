package com.mycompany.facundobenitezt3p1;
import java.io.*;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            File datos=new File("datos.txt");
            Scanner sc=new Scanner(System.in);
            if(datos.createNewFile()){
                System.out.println("Archivo creado exitosamente");
            }
            else{
                System.out.println("Archivo ya existente");
            }//Con esto inicializamos y creamos los archivos.
            String nombre,apellido;
            System.out.print("Introduzca el nombre del alumno:");
            nombre=sc.next();
            System.out.print("Introduce apellidos del alumno:");
            apellido=sc.next();
            BufferedWriter es=new BufferedWriter(new FileWriter(datos));
            es.write("Nombre:"+nombre+"\nApellido:"+apellido+"\nestudia programacion en 1C de DAM");
            es.close();
            System.out.println("fichero datos.txt generado con exito");
            
        } 
        catch (IOException e) {//Por si hay una excepcion con el archivo
        }
    }
}
