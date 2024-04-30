package tema5.Polimorfismo;


public class Cirulo extends Forma{
    private double radio;

    public Cirulo(double radio, String color, String nombre) {
        super(color, nombre);
        this.radio = radio;
    }
    public double CalcularArea(){
        return Math.PI*Math.pow(radio, 2.0);
    }

    @Override
    public String toString() {
        return "Cirulo{" + "radio=" + radio + '}';
    }
            
}
