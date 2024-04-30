package heroes;


public abstract class Heroe {
    int vida,fuerza,inteligencia,destreza;
    boolean muerto;
    String nombre;
    int iniciativa;
    String clase;
    
    public Heroe(String nombre){
        this.nombre=nombre;
        this.vida=0;
        this.fuerza=0;
        this.destreza=0;
        this.inteligencia=0;
        this.muerto=false;
        this.clase="";
        this.iniciativa=0;//Estos 2 son atributos opcionales introducidos para ahorrarme dolores de cabeza en distintos métodos.
        
               
    }

    abstract boolean noEsquiva();
    abstract void atacado(Heroe heroe);
    abstract void bolaDeFuego(Heroe heroe);
    abstract void furia();
    abstract void rapidez();
    abstract void curar();
    
    
    
    @Override
    public String toString() {
        return "Heroe: "+nombre+"\n Vida: "+vida+"\n Fuerza: "+fuerza+"\n Destreza: "+destreza+"\n Inteligencia: "+inteligencia ;
    }
    
    public boolean estaMuerto(){
        if(vida<=0){
            muerto=true;
        }
        else{
            muerto=false;//Es redundante pero por si acaso
        }
        if(muerto){
            System.out.println(nombre+" ha muerto.Fin del juego...");
        }
        return muerto;
    }
    

}
