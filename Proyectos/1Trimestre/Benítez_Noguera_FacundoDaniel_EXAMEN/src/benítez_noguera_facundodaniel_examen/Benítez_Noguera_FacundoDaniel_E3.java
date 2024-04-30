package benítez_noguera_facundodaniel_examen;
import java.util.Scanner;
import java.util.Random;

public class Benítez_Noguera_FacundoDaniel_E3 {
    public static void MeterValor(int lista[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Que cajón vas a usar? ");
        int Cajon=sc.nextInt();
        while(Cajon>10||Cajon<0){
            System.out.println("Ese cajón no existe. Usa uno entre 0 y 10. ");
            System.out.print("Que cajón vas a usar");
            Cajon=sc.nextInt();}
        System.out.print("Qué valor vas a meter? ");
         int Valor=sc.nextInt();
       lista[(Cajon-1)]=Valor;
    }
    public static void MostrarCajon(int lista[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Que cajón quieres mostrar?");
        int Cajon=sc.nextInt();
        while(Cajon>10||Cajon<0){
            System.out.println("Ese cajón no existe. Usa uno entre 0 y 10. ");
            System.out.print("Que cajón quieres mostrar?");
            Cajon=sc.nextInt();}       
        System.out.println("En el cajon "+Cajon+" esta el valor "+lista[Cajon-1]);}
    public static void ImprimirArray(int lista[]){
        for(int i=0;i<lista.length;i++) {System.out.print(lista[i]+" ");}
        System.out.println("");
    }          
    public static void ResetearArray(int lista[]){
        Random Rn=new Random();
        for(int i=0;i<lista.length;i++){
            lista[i]= Rn.nextInt(-1,101) ;}
        
    }
  

    
    public static void main(String[] args) {
            boolean Continuar= true;
                    int[] Array=new int[10];
             for(int i=0;i<Array.length;i++){Array[i]=-1;}//Creamos el array y la llenamos de -1
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Manejo de Arrays");
        System.out.println("---------------------------------");  //Creación del menú básico
        System.out.println("1.Meter valor.");  
        System.out.println("2.Mostrar cajon.");          
        System.out.println("3.Imprimir Array.");  
        System.out.println("4.Resetear Array.");  
        System.out.println("5.Salir.");  
        System.out.print("Opción?>> ");  
        int Opcion=sc.nextInt();
        while(Opcion>5||Opcion<=0){System.out.print("Opción incorrecta.Elige un número entre 1 y 5>> ");Opcion=sc.nextInt();}

       
        switch (Opcion) {
            case 1:
                MeterValor(Array);
                                break;
            case 2:
                MostrarCajon(Array);
                break;
            case 3:
                ImprimirArray(Array);
                break;                  
            case 4:
                ResetearArray(Array);
                break;
            case 5:
                Continuar= false;
                System.out.println("Gracias por su visita!!");
                break;
        }
    }while(Continuar);
        }
    
    
}
