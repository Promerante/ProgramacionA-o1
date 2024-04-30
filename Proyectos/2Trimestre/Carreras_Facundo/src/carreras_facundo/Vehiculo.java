package carreras_facundo;


public abstract class Vehiculo {
    int[] posicion=new int[2];
    String nombre;
    int posx,posy;

    public Vehiculo(){
        posx=0;
        posy=0;
    }
    abstract void avanzar();
    abstract void retroceder();
//Creamos clase vehículo que es trivial y regalado por el ejercicio.
}
