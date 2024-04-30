package practicat2_1a_facundo_alejandro;
import  java.util.Scanner;
public class PracticaT2_1A_Facundo_Alejandro {
    public static void PistaInicial(Vehiculo[] Pista){
        Scanner sc=new Scanner(System.in);
        Pista[0]=new Coche("COCHE");
        Pista[1]=new Coche("MOTO");
        Pista[2]=new Coche("CAMION");
        Pista[1].posy=1;
        Pista[2].posy=2;
        int[]Jugadores=new int[3];
        
        for(int a=0;a<=3;a++){ 
            System.out.println("Jugador "+(a+1)+"elija un vehículo\n1:Moto\n2:Coche\n3:Camión.");
            int opcion=sc.nextInt();
            System.out.println("Ahora elija una carta objetivo:\n-Camión primero y Moto segundo\n" +"-Camión segundo y coche primero\n" +"-Camión tercero y moto primero");
            int opcion2=sc.nextInt();
            
            
        }
        
    }
    
    public static void main(String[] args) {
        Vehiculo[] Pista= new Vehiculo[3];

    }

}
