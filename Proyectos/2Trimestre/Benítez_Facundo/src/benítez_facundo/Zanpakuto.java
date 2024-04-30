package benítez_facundo;
//Facundo Daniel Benítez Noguera
import java.util.Random;

public class Zanpakuto {
    private double anchura,altura,ataque,resistencia;
    private String nombre;
    private boolean estadoShikai;//OJO,tomamos que el boolean observara si esta en estado shikai o no
    private Random rn=new Random();
    private final double atqInicial  =rn.nextDouble(2,26);
    private final double resInicial=rn.nextDouble(70,151);/*Notesé que lo inicializamos aparte porque es un valor inicial que recurriremos más adelante,
    además le atribuyo final para que se convierta una constante*/

    public Zanpakuto(double anchura, double altura, String nombre) {
        this.anchura = anchura;
        this.altura = altura;
        this.ataque = atqInicial;
        this.resistencia = resInicial;
        this.nombre = nombre;
        this.estadoShikai = true;//Inicialmente esta en shikai por lo que es true y llamamos así al método para ser más claro
    }

    public double getAtaque() {
        return ataque;
    }

    public double getResistencia() {
        return resistencia;
    }//OJO EL ATAQUE Y RESISTENCIA LO NECESITAREMOS MÁS ADELANTE,POR LO QUE NECESITAMOS ESTOS GETTER PARA QUE PODAMOS USARLOS EN MÉTODOS DE OTROS OBJ.
    
    
    public void bankai(double MultAtq,double MultRes){
        this.ataque*=MultAtq;
        this.resistencia*=MultRes;
        this.estadoShikai=false;
    }
    public void shikai(){
        this.ataque=atqInicial;
        this.resistencia=resInicial;
        this.estadoShikai=true;
    }

    @Override
    public String toString() {
        return nombre+" [atq:"+ataque+", res:"+resistencia+"] "+estadoShikai;
    }
    
    
    
            

}
