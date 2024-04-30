package com.mycompany.practicaevfacudani;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class Ejercicio2 {
    public static void numerarTareas(File archivo){
        
    }
    
    public static void añadirTarea(File archivo){
        try {
            File tareasTemp=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion\\Proyectos\\PracticaEvFacuDani"
                    +"\\src\\main\\java\\com\\mycompany\\practicaevfacudani\\textos\\tareasTemp.txt");//Crea el temp
            if(!tareasTemp.createNewFile()){
                System.out.println("Archivo temporal ya existente");//Pendiente de ver la utilidad de esto
            }
            BufferedReader lector=new BufferedReader(new FileReader(archivo));//Lector al original
            BufferedWriter escritor=new BufferedWriter(new FileWriter(archivo));//Escritor al original
            String linea;
            Scanner sc=new Scanner(System.in);
            while((linea=lector.readLine())==null){
                System.out.println("¿Que desea añadir?");
                String contenido=sc.next();
                escritor.write(contenido);
            }
            
        } catch (IOException e) {
        }
        
        
        
        
        
    }
    
    public static void eliminarTarea(File archivo){
        
    }
    
    public static void mostrarTarea(File archivo){
        
    }
    
    
    
    public static void main(String[] args) {
        try {
            File tareas=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion\\Proyectos\\PracticaEvFacuDani"
                + "\\src\\main\\java\\com\\mycompany\\practicaevfacudani\\textos\\tareas.txt");
            if(tareas.createNewFile()){
                System.out.println("Archivo tareas creado exitosamente.");
            }
            else{
                System.out.println("Archivo ya creado o error no reconocido por el catch");
            }//Hasta aqui creamos y verificamos archivo.Empieza menú.
            boolean activo=true;
            System.out.println("Bienvenido al menú");
            while(activo){
                System.out.println("¿Qué desea realizar con la tarea?\n1:Añadir.\n2:Eliminar\n3:Mostrar.");
                Scanner sc=new Scanner(System.in);
                int OpcionN=sc.nextInt();String OpcionL=sc.next();
                if(OpcionN==1||OpcionL.equalsIgnoreCase("Añadir")){//Opcion añadir tarea
                    
                }
                
                        
                
            }
            
            
            
            
            
            
        } catch (IOException e) {
        }
    }

}
