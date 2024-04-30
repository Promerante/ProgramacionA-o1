package exmanemurciarepaso.Ejercicio2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double numeros,suma=0,contador=0;
        System.out.println("Introudce diez números enteros positivos: ");
        for(int a=1;a<=10;a++){
            Scanner sc=new Scanner(System.in);
            numeros=sc.nextInt();
            boolean Esprimo=true;
            if(numeros==0||numeros==1){
                Esprimo=false;
            }        
            for(int b=2;b<numeros;b++){
                if(numeros%b==0){
                    Esprimo=false; 
                }
            }
            while(Esprimo){
                suma+=numeros;
                contador++;
                break;          
            }     
        }
        double media=suma/contador;
        System.out.println(contador!=0? "La media de los primos es: "+media :"No se ha introducido ningun primo,no puedo calcular la media");
    }
}
