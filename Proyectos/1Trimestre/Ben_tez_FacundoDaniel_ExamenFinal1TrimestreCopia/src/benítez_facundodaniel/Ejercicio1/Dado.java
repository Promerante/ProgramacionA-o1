package benítez_facundodaniel.Ejercicio1;
import java.util.Random;

public class Dado {
    public int[] Caras={1,2,3,4,5,6};//Inicializamos una variable de tipo array de numeros enteros que señala las caras de un dado,siempre es un D6.
    public double Peso;//Esta variable digamos que esta en gramos.
    public String Color;

    public Dado(double Peso, String Color) {
        this.Peso = Peso;
        this.Color = Color;
    }//Creamos constructo del dado que lo que varia es el peso y el color,siempre es un D6.

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    //Introducimos los metodos getter and setter por si el  usuario desea cambiar las características del d6.
    public String DadoLanzado(Dado DadoQueTiras){
        Random rn=new Random();
        int Rn=rn.nextInt(0,6);
        int Resultado=DadoQueTiras.Caras[Rn];/*Con el uso del Random(siempre recordar que el límite no cuentas,es decir,el máximo es 5) 
        indica el valor de la cara en ese indice por ejemplo en el indice 0 esta 1 por lo que saldra 1*/
        return "Ha salido un "+Resultado+'.';
        
        
    }
    

}
