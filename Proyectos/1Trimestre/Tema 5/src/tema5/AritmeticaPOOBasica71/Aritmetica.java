package tema5.AritmeticaPOOBasica71;

import static java.lang.Double.NaN;

public class Aritmetica {
    
double num1;
double num2;

    public Aritmetica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double Suma(){
        double Suma=num1+num2;
        return Suma;
    }
    
        public double Resta(){
        double Resta=num1-num2;
        return Resta;
    }
        
    public double Multiplicaion(){
        double Multiplicacion=num1*num2;
            return Multiplicacion;
    }
    
    public double Division(){
        double Division = NaN;
        if(num2!=0){Division=num1/num2;}
        return Division;
    }
                
    public double Potencia(){
        double Potencia=Math.pow(num1, num2);
        return Potencia;
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "num1=" + num1 + ", num2=" + num2 +"Suma= "+Suma()+"Resta= "+Resta()+"Multiplicacion= "+Multiplicaion()+"Division= "+Division()+"Potencia= "+Potencia()+"}" ;
    }   
    
}
