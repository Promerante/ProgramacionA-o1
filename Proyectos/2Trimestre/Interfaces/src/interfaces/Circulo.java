package interfaces;


public class Circulo implements Figura{
    double radio;
    public Circulo(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        return pi*radio*radio;   
    }

}
