package tema5.Polimorfismo;
import java.util.Scanner;
public class textodeejmpleo {
    public static void main(String[] args) {
        boolean Continuar=true;
        for(int i=1;Continuar==true;i++){
            System.out.println(i);
            System.out.println("Desea continuar?");
            Scanner sc=new Scanner(System.in);
            Continuar=sc.nextBoolean();
            
        }

    }

}
