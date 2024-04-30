package heroes;
import java.util.Random;

public class Guerrero extends Heroe {
    Random rn=new Random();
    int vidaMax=rn.nextInt(8,21);
    
    public Guerrero(String nombre) {
        super(nombre);
        this.vida=vidaMax;
        this.fuerza=rn.nextInt(10,25);
        this.destreza=rn.nextInt(1,11);
        this.inteligencia=rn.nextInt(3,6); 
        this.clase="Guerrero";
        this.iniciativa=destreza+rn.nextInt(1,21);
    }
    
    
    public void furia(){
        if(vida>6){
            vida-=6;
            fuerza+=6;
            System.out.println(nombre+" ha usado furia! Ahora su fuerza es "+ fuerza+". Pero su vida es "+vida);
        }
        else{
            System.out.println("Has gastado tu turno en enfurecerse pero no tuviste suficiente vida!");
        }
    } 
    
    
    public boolean noEsquiva(){
        
       boolean Golpeado=true;//He visto  que lo más fácil es empezarlo verdadero y luego ponemos el condicionante para cuando no le golpea.
        if(destreza>rn.nextInt(3,31)){
            Golpeado=false;
            System.out.println(nombre+" lo ha esquivado!");
        }
        System.out.println(nombre+" no lo ha esquivado.");
        return Golpeado; 
    }
    
    
    public void atacado(Heroe heroe){
        if(noEsquiva()){
            vida-=heroe.fuerza;//Por ahora con este sencillo método tenemos cuando es atacado. 
        } 
        
    }
    
    
    public void curar(){
        
    }
    
    
    public void rapidez(){
        
    }
    
    
    public void bolaDeFuego(Heroe heroe){
        
    }//CLASES DE OTRAS CLASES QUE NECESITO GENERALIZAR PERO NO LAS HACEN TODAS
}
