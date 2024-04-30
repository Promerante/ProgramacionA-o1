package practicarepaso;

import java.util.Scanner;

public class Coche {
    int modelo;
    double precio;
    int bateria;
    boolean conduccionAutomatica;

    public Coche(int modelo,double precio, int bateria, boolean conduccionAutomatica) {
        this.precio = precio;
        this.bateria = bateria;
        this.conduccionAutomatica = conduccionAutomatica;
    }

    
    public void SeleccionaBateria(Coche CocheDeseado){
        Scanner sc=new Scanner(System.in);
        boolean Error;
        do{
        System.out.print("Seleccione el tipo de batería (a) 50kWh (b) 70kWh: ");
        String Modelo=sc.next();
        switch (Modelo) {
            case "a":
                CocheDeseado.bateria=5;
                Error=false;
                break;
            case "b":
                CocheDeseado.modelo=8;
                Error=false;
                break;
            default:
                System.out.println("No existe ninguna batería aparente,pruebe de nuevo");
                Error=true;
        }
        }while(Error);
    
}
    

}
