package com.mycompany.manicomio;
/**
 *
 * @author Facundo Daniel Benitez Noguera
 */
import java.io.*;
import java.util.*;

public class Manicomio {

    public static void main(String[] args) {
        try {
            //Creando los archivos y comprobando su existencia
            File config=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion\\Proyectos"
                    + "\\3Trimestre\\ManejoFicheros\\Manicomio\\src\\main\\java\\com\\mycompany\\manicomio\\textos\\config.txt");
            File pacientes=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion\\Proyectos"
                    + "\\3Trimestre\\ManejoFicheros\\Manicomio\\src\\main\\java\\com\\mycompany\\manicomio\\textos\\pacientes.txt");
            if (!config.exists()) {
                config.createNewFile();
            }
            else if(!pacientes.exists()){
                pacientes.createNewFile();
            }
            //Creamos los lectores,escritores...Todo las herramientas necesarias
            BufferedWriter esConfig=new BufferedWriter(new FileWriter(config,true));
            BufferedReader lcConfig=new BufferedReader(new FileReader(config));
            BufferedWriter esPaciente=new BufferedWriter(new FileWriter(pacientes,true));
            BufferedReader lcPaciente=new BufferedReader(new FileReader(pacientes));
            Scanner sc=new Scanner(System.in);
            ArrayList<paciente> lista=new ArrayList<>();
            boolean terminado=false;
            String linea="",opcion="";
           
           
            do {    
                
                
                //Caso de que config tenga false
                if(true){
                    //Menu con la opciones necesarias
                    System.out.println("Elige una opcion:\n1.Crear paciente\n2.Salir");
                    opcion=sc.next();
                    //Opcion crear paciente
                    if (opcion.equalsIgnoreCase("1")||opcion.equalsIgnoreCase("Crear paciente")){
                        System.out.println("Introduzca su nombre");
                        String nombre=sc.next();
                        System.out.println("Introduzca su apellido");
                        String apellido=sc.next();
                        System.out.println("Introduzca su enfermedad");
                        String enfermedad=sc.next();
                        lista.add(new paciente(0 , nombre, apellido, enfermedad));
                        lista.get(lista.size()-1).setId(lista.size());
                        esPaciente.write(lista.get(lista.size()-1).toString());
                        System.out.println("Paciente"+lista.get(lista.size()-1).toString()+ "creado exitosamente");
                        
                        
                        
                        
                    }
                    
                    
                }
                //Caso de que config tenga true
                if((linea=lcConfig.readLine()).equalsIgnoreCase("true")){
                    
                }
                
            } while (!terminado);
            
            
            
            
        } catch (IOException e) {
        }
        
    }
}
