package exmanemurciarepaso.Ejercicio1;
import java.util.Scanner;

public class Teslas {
    double precio;
    int bateria;
    String modelo;
    boolean condauto;
    public Teslas(double precio, int bateria,String modelo,boolean condauto) {
        this.precio = precio;
        this.bateria = bateria;
        this.modelo=modelo;
        this.condauto=false;
    }
    public static Teslas SeleccioneModelo(){
        Teslas Coche=new Teslas(0, 0, "",false);//Creamos un objeto Tesla de prueba que iremos cambiando sus atributos
        Scanner sc=new Scanner(System.in);
        System.out.print("Seleccione el modelo coche (a) Modelo 5 (b) Modelo 8: ");
        String eleccion=sc.next();
        if(eleccion.equalsIgnoreCase("a")){
            Coche.modelo="Modelo 5";
            Coche.precio=30000;
        }
        else if(eleccion.equalsIgnoreCase("b")){
            Coche.modelo="Modelo 8";
            Coche.precio=36000;
        }
        else{
            System.out.println("Modelo elegido incorrectamente.");
        }//Hasta aqui esta accion de los Teslas creara un objeto del mismo y le dara los atributos modelos y precios.
        return Coche;
    }
    public void SeleccioneBateria(Teslas Coche){
        int opcion1=0,opcion2=0;
        if(Coche.modelo.equalsIgnoreCase("Modelo 5")){
            opcion1=50;
            opcion2=70;
        }
        else if(Coche.modelo.equalsIgnoreCase("Modelo 8")){
            opcion1=80;
            opcion2=120;
        }
        else{
            System.out.println("Raro error al introducir mas el dato,reinicie el programa");
        }//Hasta aqui creamos las opciones y le asignamos sus posibles valores segun el modelo
        Scanner sc=new Scanner(System.in);
        String eleccion="";//Inicializamos el scanner y la string eleccion.
        if(Coche.modelo.equalsIgnoreCase("Modelo 5")){
            System.out.print("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
            eleccion=sc.next();
        }
        else if(Coche.modelo.equalsIgnoreCase("Modelo 8")){
            System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
            eleccion=sc.next();
        }
            
        if(eleccion.equalsIgnoreCase("a")){
            Coche.bateria=opcion1;
        }
        else if(eleccion.equalsIgnoreCase("b")){
            Coche.bateria=opcion2;
        }
        else{
            System.out.println("Bateria elegida incorrectamente.");
        } 
    }
    public void SeleccionCondAuto(Teslas Coche){
        if(Coche.modelo.equalsIgnoreCase("Modelo 8")){
            Scanner sc=new Scanner(System.in);
            String eleccion="";
            System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
            eleccion=sc.next();
            if(eleccion.equalsIgnoreCase("s")){
                Coche.condauto=true;
            }
            else if(eleccion.equalsIgnoreCase("n")){
                Coche.condauto=false;
            }
            else{
                System.out.println("Error raro,reinicie el programa");
            }
        }//Si el modelo es el 8 podra elegier si tiene conduccion automatica o no.
        else if(Coche.modelo.equalsIgnoreCase("Modelo 5")){
            Coche.condauto=false;//Siempre el modelo 5 NO va a tener conduccion automatica
        }
        else{
            System.out.println("Error raro,reinicie el programa.");
        }
        
    }

    @Override
    public String toString() {
        return "Teslas{" + "precio=" + precio + ", bateria=" + bateria + ", modelo=" + modelo + ", condauto=" + condauto + '}';
    }
    
    
    
    
    
}
