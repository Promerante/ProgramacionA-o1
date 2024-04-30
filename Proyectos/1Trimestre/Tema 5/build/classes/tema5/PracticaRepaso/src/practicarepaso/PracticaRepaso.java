package practicarepaso;
import java.util.Scanner;
public class PracticaRepaso {
    public static int SeleccionModelo(){
        Scanner sc=new Scanner(System.in);
        boolean Error;
        int tipo=0;
        do{
        System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
        String Modelo=sc.next();
        switch (Modelo) {
            case "a":
                tipo=5;
                Error=false;
                break;
            case "b":
               tipo=8;
                Error=false;
                break;
            default:
                System.out.println("No existe ningun modelo aparente,pruebe de nuevo");
                Error=true;
        }
        }while(Error);
        return tipo;
    }
    public static void main(String[] args) {
        SeleccionModelo();

        new Coche( SeleccionModelo(), 0, 0, false);


    }

}
