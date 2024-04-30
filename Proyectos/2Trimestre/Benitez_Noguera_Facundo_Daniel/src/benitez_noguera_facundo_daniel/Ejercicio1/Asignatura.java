package benitez_noguera_facundo_daniel.Ejercicio1;
import java.util.Scanner;

public class Asignatura implements EsEvaluable{
    public int codigo;//lo considero como la id de una asignatura
    public String[] temario;
    Scanner sc=new Scanner(System.in);
    public double [] notas;
    

    public Asignatura(int codigo, String[] temario,double [] notas) {
        this.codigo = codigo;
        this.temario = temario;
        this.notas= notas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String[] getTemario() {
        return temario;
    }

    public void setTemario(String[] temario) {
        this.temario = temario;
    }//Creamos estos metodos para crear las asignaturas y que un profesor pueda modificar el temario
    
    public void asignarCalificacion(double calificacion){
        System.out.println("Que temario desea asignarle la nota");/*Podria realizar un metodo para vincularlo con la String de temario pero supongamos 
        que el usuario implementa bien el método para ahorrarnos tiempo.*/
        int notatemario=sc.nextInt();
        notas[notatemario-1]=calificacion;  //Al ser matrix le restamos uno para mejorar la experiencia del usuario     
    }
            

    public double obtenerCalificacion(){
        System.out.println("Que temario desea obtener la nota");
        int notatemario=sc.nextInt();
        return notas[notatemario-1];
    }
    public boolean estaAprobada(){
        System.out.println("Que temario desea saber si esta aprobado?");
        int notatemario=sc.nextInt()-1;
        boolean aprobado=true;
        if(notas[notatemario]<5){
            aprobado=false;
        }
    return aprobado;
    }
   
    
    
    

}
