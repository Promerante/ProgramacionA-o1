package tema5.COCHES;


public class CocheDeportivo extends Coche {
    int caballos;
    String marca;
    String tipoMotor;

    public CocheDeportivo(int caballos, String marca, String tipoMotor, String color, double anchura, double altura, int numPuertas, boolean estaArrancado, int gasolina) {
        super(color, anchura, altura, numPuertas, estaArrancado, gasolina);
        this.caballos = caballos;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    

}
