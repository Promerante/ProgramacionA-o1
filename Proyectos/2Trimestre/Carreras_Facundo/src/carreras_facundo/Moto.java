package carreras_facundo;


public class Moto extends Vehiculo{
    //Creamos la distintas clases de vehículo que tiene su forma de avanzar y retroceder según lo manda el ejercicio.
    public Moto(){
        nombre="MOTO";
        this.posy=1;
        posicion[0]=posy;
        posicion[1]=posx;
        
    }
    public void avanzar(){
    posx+=4;
    if(posx>=9){
        posx=9;
    }
    }
    
    public void retroceder(){
    posx-=4;
    if(posx<=0){
        posx=0;
    }    
    }

}
