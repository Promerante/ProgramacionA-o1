package heroes;

import java.util.Random;
public class Elfo extends Heroe {
    Random rn=new Random();
    int vidaMax=rn.nextInt(8,21);
    
    public Elfo(String nombre) {
        super(nombre);
        this.vida=vidaMax;
        this.fuerza=rn.nextInt(10,25);
        this.destreza=rn.nextInt(1,11);
        this.inteligencia=rn.nextInt(3,6); 
        this.clase="Elfo";
        this.iniciativa=destreza+rn.nextInt(1,21);
    }
    
    
    public void Rapidez(){
        if(fuerza>5){
            destreza+=4;
            fuerza-=5;
            System.out.println(nombre+" ha usado rapidez. Su destreza es "+ destreza+" pero ahora su fuerza es"+ fuerza+ ".");        
        }
        else{
            System.out.println("Has gastado tu turno en intentar se más rapido,,pero no tienes la suficiente fuerza.");
        } 
    }
    
    
    public boolean noEsquiva(){
       boolean Golpeado=true;//He visto  que lo más fácil es empezarlo verdadero y luego ponemos el condicionante para cuando no le golpea.
        if(destreza>rn.nextInt(4,51)){
            Golpeado=false;
            System.out.println(nombre+" lo ha esquivado!");
        }
        System.out.println(nombre+" no lo ha esquivado.");
        return Golpeado; 
    }
    
    
    public void atacado(Heroe heroe){
        if(noEsquiva()){
            vida-=heroe.fuerza/3;//Por ahora con este sencillo método tenemos cuando es atacado. 
        } 
    
    }
    
    
    public void furia(){
        
    }
    
    public void bolaDeFuego(Heroe heroe){
        
    }
    
    
    public void curar(){
        
    }
    
    
    public void rapidez(){
        
    }//CLASES DE OTRAS CLASES QUE NECESITO GENERALIZAR PERO NO LAS HACEN TODAS
}
