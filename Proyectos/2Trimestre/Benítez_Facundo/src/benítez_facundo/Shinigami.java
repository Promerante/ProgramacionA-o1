package benítez_facundo;
//Facundo Daniel Benítez Noguera
import java.util.Random;

public abstract class Shinigami {
    protected String nombre,origen;
    protected int edad;
    protected double vida,poder;
     Random rn=new Random();
    protected final double poderInicial=rn.nextDouble(5,51);
    protected Zanpakuto espada=new Zanpakuto(0, 0, "Texto De Ejemplo");/*Esta es una espada inicial y de ejemplo que luego;cada vez que hagamos un shinigami
    le asignaremos los valores de la espada que usara a esta, por lo que sus valores iniciales solo es para que funcione el constructor y el método.*/
    
   

    public Shinigami(String nombre, String origen, int edad,Zanpakuto espadaUsada) {
        this.vida=1500;
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada=espadaUsada;
    }
    
    abstract protected void invocarBankai();
    abstract protected void pelear(Shinigami Rival);

    @Override
    public String toString() {
        return nombre+"[vida: "+vida+",poder: "+poder+"]\n"+espada.toString();
    }

  
    
    
    
          
    

}
