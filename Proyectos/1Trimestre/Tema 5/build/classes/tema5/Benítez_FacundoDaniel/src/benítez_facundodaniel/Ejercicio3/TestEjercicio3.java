package benítez_facundodaniel.Ejercicio3;
import java.util.Scanner;
public class TestEjercicio3 {
    public static void RelojEncendido(RelojDigital Reloj){
        boolean Encendido=true;
        Scanner sc=new Scanner(System.in);
            do{
                System.out.println("Encendiendo reloj...");
                Reloj.revisarHora(Reloj);
                System.out.printf("%02d:%02d:%02d", Reloj.horas,Reloj.minutos,Reloj.segundos);
                System.out.println("");
                System.out.println("Desea apagar el reloj?(S/N)");
                String deseo=sc.next();
                    switch (deseo) {
                    case "S":
                        Encendido=false;
                        break;
                    case "N":
                        break;       
                        
                    }
                
                
            }while(Encendido);
    }
    
    public static boolean RelojApagado(RelojDigital Reloj){
        boolean Encendido=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Reloj apagado");
        System.out.println("Desea cargar la bateria(S/N)?");
        String Carga=sc.next();
            switch (Carga) {
                    case "S":
                        Reloj.cargarBateria(Reloj);
                        break;
                    case "N":
                        break;       
            }
        System.err.println("Desea volver a encender el Reloj(S/N)?");
        String Reinicio=sc.next();
        switch (Reinicio) {
                    case "S":
                        
                        break;
                    case "N":
                        Encendido=false;
                                
                        break;       
            }
        return Encendido;
    }
    
    
    public static void main(String[] args) {
        boolean Encendido=true;
        
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la hora inicial de tu reloj:");
        int horas=sc.nextInt();
        System.out.println("Ahora introduzca los minutos iniciales de tu reloj:");
        int minutos=sc.nextInt();
        System.out.println("Por último. Introduzca los segundos iniciales de tu reloj:");
        int segundos=sc.nextInt();
        RelojDigital Reloj=new RelojDigital(horas, minutos, segundos);
        RelojEncendido(Reloj);
            Encendido=RelojApagado(Reloj);
            
        }while(Encendido);
        

           
                
                
            
        

    }

}
