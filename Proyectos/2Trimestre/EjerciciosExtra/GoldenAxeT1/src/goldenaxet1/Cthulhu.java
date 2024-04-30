package goldenaxet1;

public class Cthulhu {
    protected int vida,fuerza;
    protected boolean estaVivo;
    public Cthulhu(int vida){
        this.vida=vida;
        this.fuerza=1;
        this.estaVivo=true;
    }

    @Override
    public String toString() {
        return "Cthulhu{" + "vida=" + vida + ", fuerza=" + fuerza + ", estaVivo=" + estaVivo + '}';
    }
    
    

}
