package heroes;
import java.util.Random;

public class Mago extends Heroe{
    Random rn=new Random();
    int vidaMax=rn.nextInt(2,11);//Esto es importante,lo incializamos aparte puesto que queremos guardar el numero aleatorio dado.vida cambiara,vidaMax no.
   
    public Mago(String nombre) {
        super(nombre);
        this.vida=vidaMax;
        this.fuerza=rn.nextInt(3,8);
        this.destreza=rn.nextInt(5,13);
        this.inteligencia=rn.nextInt(10,21); 
        this.clase="Mago";
        this.iniciativa=destreza+rn.nextInt(1,21);
    }
    
    
    public void curar(){
        vida+=3;
        if(vida>vidaMax){//Este es un ejemplo de por qué guardamos la vida máxima que obtienes.
            vida=vidaMax;//Con este simple if y gracias a guardar el valor aleatorio guardado el mago no podra excederse de su vida máxima ¡.
            System.out.println(nombre+" se ha curado por completo.");
        }
        else{
            System.out.println("El mago "+ nombre+"se ha curado y ahora tiene "+vida+" puntos de golpe.");
        }  
    }
    
    
    public boolean noEsquiva(){
        
        boolean Golpeado=true;//He visto  que lo más fácil es empezarlo verdadero y luego ponemos el condicionante para cuando no le golpea.
        if(destreza>rn.nextInt(2,41)){
            Golpeado=false;
            System.out.println(nombre+" lo ha esquivado!");
        }
        System.out.println(nombre+" no lo ha esquivado.");
        return Golpeado;
    }
    
    
    public void atacado(Heroe heroe){
        if(noEsquiva()){
            vida-=heroe.fuerza/2;//Por ahora con este sencillo método tenemos cuando es atacado. 
        }  
    }
    
    
    public void bolaDeFuego(Heroe heroe){
        if(heroe.noEsquiva()){
            System.out.println("Ha impactado  su bola de fuego!");
            heroe.vida-=rn.nextInt(1,11)+rn.nextInt(1,11)+inteligencia;
        }
    }
    

    public void furia(){
        
    }
    
    
    public void rapidez(){
        
    }//CLASES DE OTRAS CLASES QUE NECESITO GENERALIZAR PERO NO LAS HACEN TODAS
}
