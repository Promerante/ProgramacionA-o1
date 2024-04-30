package com.mycompany.facundobenitezt3p1;

import java.io.*;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            File dante=new File("dante.txt");      
            Scanner sc=new Scanner(System.in);
            System.out.print("Añada correctamente el nombre del archivo y su extension:");
            File ejemplo=new File(sc.next());
            BufferedReader lc=new BufferedReader(new FileReader(dante));//Lector para el archivo que deseamos que copie
            BufferedWriter es=new BufferedWriter(new FileWriter(ejemplo));//Escritor para el archivo objetivo
            String linea;
            int marcador=0;
            while((linea=lc.readLine())!=null){ 
                es.write(marcador+"=>"+linea) ;
                marcador++;
                es.newLine();
            }
            System.out.println("Archivo copiado exitosamente");
            lc.close();
            es.close();
            sc.close();//Lo cerramos por si en un futuro se desarolla no malgastar memoria en funciones ya acabadas.
     
        } 
        catch (IOException e) {
        }
    }

}
