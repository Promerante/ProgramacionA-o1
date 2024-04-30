package carreras_facundo;


public class Coche extends Vehiculo{
    //Creamos la distintas clases de vehículo que tiene su forma de avanzar y retroceder según lo manda el ejercicio.
    public Coche(){
        nombre="COCHE";
        posy=0;
        posicion[0]=posy;
        posicion[1]=posx;
    }
    public void avanzar(){
    posx+=3;
    if(posx>=10){
        posx=9;
    }
    }
    
    public void retroceder(){
    posx-=3;
    if(posx<=0){
        posx=0;
    }    
    }

}
