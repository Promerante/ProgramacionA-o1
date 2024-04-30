package benítez_noguera_facundodaniel_examen;
import benítez_noguera_facundodaniel_examen.Benítez_Noguera_FacundoDaniel_E3 ;
import java.util.Random;
import java.util.Scanner;

public class Benítez_Noguera_FacundoDaniel_E1 {
    
    private static void RellenarArray(int lista[]){
        Random rn = new Random();
        for(int i=0;i<lista.length;i++){
            lista[i]= rn.nextInt(0,106);}//Con este bucle rellenamos el array con numeros entre 0 a 105(ya que el 106 no lo cuenta)
       
    }    
    public static int mayor(int lista[]){
        int M=0;
        for(int i=0;i<lista.length;i++){
        if(lista[i]>M){M=lista[i];}}/*Y con este vamos comparando todos los valores dentro de la array y se queda con el mayor en cada uno,por lo 
        que cuando termine el bucle revisando todo nos dara el mayor*/
    return M;}
    public static int menor(int lista[]){
          int N=106;//106 porque no puede ser igual o mayor a este.
        for(int i=0;i<lista.length;i++){
            if(lista[i]<N){N=lista[i];}}//Lo mismo con el menor
    return N;}  
    public static int ContarMayor(int lista[]){
        int VecesMayor=0;
            for(int i=0;i<lista.length;i++){
                if (lista[i]==mayor(lista)){VecesMayor++;}
                else{}
            }//Y con este sencillo bucle cuenta las veces que sale el mayor, ahora haremos los mismo con el menor
        return VecesMayor;}
    public static int ContarMenor(int lista[]){
        int VecesMenor=0;
            for(int i=0;i<lista.length;i++){
                if (lista[i]==menor(lista)){VecesMenor++;}
                else{}
            
            }//Y con este sencillo bucle cuenta las veces que sale el mayor, ahora haremos los mismo con el menor
        return VecesMenor;}
    
    
    public static void main(String[] args) {
        Scanner tamaño=new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int Tamaño=tamaño.nextInt(); 
            while(Tamaño<=0){
            System.out.print("Error.El número debe ser mayor a 0:");
            Tamaño=tamaño.nextInt();}//Con este bucle nos aseguramos que el tamaño de la array sera mayor que 0
        int[] Array=new int[Tamaño];
        RellenarArray(Array);//Llamamos el metodo para que rellene la Array
        System.out.println("El array generado es: ");
            for(int j=0;j<Array.length;j++){System.out.print(Array[j]+" ");}//Imprimimos la array
        System.out.println("");
        int Mayor=mayor(Array);//nuevamento llamamos el metodo para esta vez nos devuelve el valor del mayor(M)
        int Menor=menor(Array);
        int m=ContarMayor(Array);
        int n=ContarMenor(Array);//Y con la declaracion de estas variables y llamando a los metodos ya tenemos todo en el main,solo falta imprimir
        
        System.out.println("El valor máximo es el "+Mayor+" y aparece "+m+" veces.");
        System.out.println("El valor máximo es el "+Menor+" y aparece "+n+" veces.");
        
    }
    
}
