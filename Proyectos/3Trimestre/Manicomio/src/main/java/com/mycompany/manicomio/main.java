package com.mycompany.manicomio;
/**
 *
 * @author Facundo Daniel Benitez Noguera
 */
import java.util.*;
import java.io.*;


public class main {
    public static void main(String[] args) {
        try {
            File pacientes=new File("C:\\Users\\Medac Tarde\\Desktop\\Apuntes\\Programacion"
                + "\\Proyectos\\3Trimestre\\Manicomio\\src\\main\\java\\com\\mycompany\\manicomio\\textos\\pacientes.txt");
            
            if(pacientes.createNewFile()){
                System.out.println("Archivo pacientes creado exitosamente");
            }
            else{
                System.out.println("Archivo ya pacientes o error no registrado");
            }//Crea archivo o verifica      
            BufferedReader lc=new BufferedReader(new FileReader(pacientes));//Lector lc de config.txt
            BufferedWriter es=new BufferedWriter(new FileWriter(pacientes,true));//Escritor es de config.txt
            Scanner sc=new Scanner(System.in);
            boolean noTerminado=true;
            ArrayList<String> lista=new ArrayList<>();
            String nombre="",apellido="",enfermedad="";
            do {   
                System.out.println("Elige una opción:\n1.Crear paciente\n2Borrar paciente\n3.Ver pacientes\n4.Salir");
                String opcion=sc.next();
                if(opcion.equals("1")||opcion.equalsIgnoreCase("Crear paciente")){
                //Metodo Crear paciente
                    System.out.println("Creando paciente...Digame el nombre:");
                    nombre=sc.next();
                    System.out.println("Ahora su apellido:");
                    apellido=sc.next();
                    System.out.println("Por ultimo su enfermedad:");
                    enfermedad=sc.next();
                    lista.add(new String((lista.size()+1) + " " + nombre + " " + apellido + " " + enfermedad));
                    System.out.println("Añadiendo "+ lista.get(lista.size()-1));
                    
                }
                else if(opcion.equals("2")||opcion.equalsIgnoreCase("Borrar paciente")){
                //Borrar paciente
                    System.out.println("Escriba la id del paciente a eliminar");
                    int idEliminda=sc.nextInt();         
                    lista.remove(idEliminda-1);
                    System.out.println("Paciente eliminado");
                }
                else if(opcion.equals("3")||opcion.equalsIgnoreCase("Ver paciente")){
                //Ver paciente
                    for(String a:lista){
                        System.out.println("NOMBRE Y APELLIDO:"+nombre+" "+apellido);
                        es.write(a);
                        es.newLine();
                    }
                }
                else if(opcion.equals("4")||opcion.equalsIgnoreCase("Salir")){
                noTerminado=false;
                }
                else{
                System.out.println("Datos incoherente,introduzca el nombre o la accion deseada");
                }  
            } while (noTerminado);
            //Cerramos las herramientas
            lc.close();
            es.close();
            sc.close();
     
        } catch (IOException e) {
        }
    }           
}
