package com.mycompany.facundobenitezt3p1;
import java.util.*;
import java.io.*;

public class Ejercicio3 {
   
    
    public static void main(String[] args) {
        boolean noValido=true;
        int N=1;
        Scanner sc=new Scanner(System.in);     
        do {    
            try {
                System.out.print("Introdduzca un número entero mayor que 3:");
                N=sc.nextInt();
                if(N<=3){
                    throw new ErroresN("Número no válido.");
                }
                noValido=false;
            } 
            catch (ErroresN e) {
                System.out.println(e.getMessage());
            }
            catch(Exception o){
                System.out.println("Carácteres introducidos no válidos");
                sc.next();
            }
            
        }while (noValido);//Con esto nos aseguramos introducir numeros validos
        
        try {
            File numeros=new File("numeros.txt"); 
            BufferedWriter escritor=new BufferedWriter(new FileWriter(numeros));
            if(numeros.createNewFile()){
                System.out.println("Archivo creado exitosamente");
            }
            else{
                System.out.println("Archivo ya existente");
            }
            int[] array=new int[N];
            Random rn=new Random();
            for(int c=0;c<array.length;c++){
                array[c]=rn.nextInt(50,58);/*Con esto guardamos los numeros en una array.OJO ESTOS NUMEROS EN UN FUTURO SERAN TRADUCIDOS AL FORMATO ASCII     
                es por ello  que no tomaremos este rango en especifico*/
                System.out.println(array[c]);//Prueba luego borrar
            }//Con esto tenemos la array de numeros aleatorios
            
            for(int d=0;d<array.length;d++){
                escritor.write((char)array[d]);
                escritor.newLine();
            }
            escritor.close();
            System.out.println("Programa finalizado correctamente");

        
            
        } catch (IOException e) {
        }
        
        
        
        
        
    }

}
