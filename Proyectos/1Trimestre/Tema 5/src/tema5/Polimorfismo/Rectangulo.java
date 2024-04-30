package tema5.Polimorfismo;


public class Rectangulo extends Forma {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color, String nombre) {
        super(color, nombre);
        this.base = base;
        this.altura = altura;
    }
    public double CalcularArea(){
        return base*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    

}
