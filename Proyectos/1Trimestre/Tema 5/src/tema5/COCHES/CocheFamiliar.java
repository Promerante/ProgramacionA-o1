package tema5.COCHES;


public class CocheFamiliar extends Coche{
    int asientos;
    String maletero;

    public CocheFamiliar(int asientos, String maletero, String color, double anchura, double altura, int numPuertas, boolean estaArrancado, int gasolina) {
        super(color, anchura, altura, numPuertas, estaArrancado, gasolina);
        this.asientos = asientos;
        this.maletero = maletero;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getMaletero() {
        return maletero;
    }

    public void setMaletero(String maletero) {
        this.maletero = maletero;
    }
    
}
