package benítez_facundodaniel.Ejercicio3;
import java.util.Random;

public class RelojDigital {
    public int horas,minutos,segundos;
    public double bateria;

    public RelojDigital(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.bateria=100;//Todos los relojes empiezan con un 100 de bateria
    }//Constructor del objeto Reloj
    
    //Y ahora sus distintas acciones.
    public void revisarHora(RelojDigital Reloj){
        if(Reloj.horas>12||Reloj.horas<1){
            Reloj.horas=1;
        }
        if(Reloj.minutos>59||Reloj.minutos<1){
            Reloj.minutos=1;
        }
        if(Reloj.segundos>59||Reloj.segundos<1){
            Reloj.segundos=1;
        }
    }//Metodo que arregla si el reloj tiene una hora, minuto o segundo sin sentido.Lo cambia a 1.
 
    public void mostrarHora(RelojDigital Reloj){
        System.out.printf("%02d:%02d:%02d", Reloj.horas,Reloj.minutos,Reloj.segundos);
    }//Metodo que mostrar en pantallla el Reloj.
    
    public void cargarBateria(RelojDigital Reloj){
     Reloj.bateria=100;
        System.out.println("Batería cargada."); 
    }//Establecemos la bateria del reloj que haga la accion al 100(valor máximo)y el mensaje por consola pedido.
    
    public void sonarAlarma(){
        Random rn1=new Random();
        Random rn2=new Random();
        Random rn3=new Random();//Introducimos 3 Randoms para cada atributo para que los 3 sean un numero aleatorio para cada uno
        int horaA=rn1.nextInt(1,13);
        int minutoA=rn2.nextInt(1, 60);
        int segundoA=rn3.nextInt(1, 60);
        if(horaA==horas&&minutoA==minutos&&segundoA==segundos){
            System.out.println("ring ring!!! suena la alarma!!");
        }  
    }//Con este metodo seteamos una alarma con hora minuto y segundo aleatorio y si es igual al reloj dado que intenta sonar saldra en pantalla unn mensaje.

}
