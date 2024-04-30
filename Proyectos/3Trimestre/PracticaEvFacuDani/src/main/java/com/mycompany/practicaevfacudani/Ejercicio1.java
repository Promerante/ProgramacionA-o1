package com.mycompany.practicaevfacudani;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.SecureRandom;
import java.util.Random;

public class Ejercicio1 {
    public static String [] generadorContraseñas(){
        String[] contraseñas= new String[10];
        for (int a=0;a<10;a++){
            Random generador=new Random();
            
            String contraseña="";
            while(contraseña.length()<=8){
                int contraseñaASCII= generador.nextInt(33,123);//Este rango es para caracteres en ASCII
                //Tiene que tener este rango para traducirlo el numero a la letra(lo tomara como numero ASCCI)
                contraseña+=(char)contraseñaASCII;
            }
            contraseñas[a]=contraseña;
        }
        return contraseñas;
    }

    public static void main(String[] args) {
        try {
            File archivo=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion\\Proyectos\\PracticaEvFacuDani"
                + "\\src\\main\\java\\com\\mycompany\\practicaevfacudani\\textos\\contraseñas.txt");
            if(archivo.createNewFile()){//Hasta aqui creamos el archivo de texto
                System.out.println("Archivo creado exitosamente");
            }
            else{
                System.out.println("Ha habido un problema al crearlo o ya existia");
            }            
            FileWriter escritor= new FileWriter(archivo);
            BufferedWriter buffer=new BufferedWriter(escritor);
            
            for(int a=0;a<10;a++){
                String[] contraseñas=generadorContraseñas();
                buffer.write("Contraseña "+a+": "+contraseñas[a]+".\n");
            }
            buffer.close();   
        }
        catch (IOException e) {//Esta excepcion es el general y esta misma la utilizaremos por si aparece cualquier tipo de error
        }
        
    
    }
}
