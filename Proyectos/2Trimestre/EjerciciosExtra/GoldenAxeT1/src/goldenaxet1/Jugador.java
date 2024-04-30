package goldenaxet1;

public class Jugador {
    protected Carta carta = new Carta();
    protected  int vida,fuerza;
    protected boolean estaVivo;
    protected String nombre;
    protected Carta[] BarajaJugador = carta.BarajaInicial();

    public Jugador() {
    }

    @Override
    public String toString() {
        return "Jugador{" + "vida=" + vida + ", fuerza=" + fuerza + ", estaVivo=" + estaVivo + ", nombre=" + nombre +'}';
    }
    
}
