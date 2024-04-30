package excepcionesejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main105 {
    public static boolean ejemplo(int a,int b){
        boolean valido=true;
        if(a>=100||b<=-5){
            valido=false;
            throw new RuntimeException("Hey algo no ha salido bien");
            
        }
        return valido;
    }
    public static void main(String[] args) {
        try{
            int a;
            int b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Numerador: ");
            a=sc.nextInt();
            System.out.println("Denominador:");
            b=sc.nextInt();
            if(ejemplo(a, b)){
                System.out.println(a/b);
            }
            
        }
        catch(InputMismatchException E){
            System.out.println("Escaner no valido");
        }
        catch(ArithmeticException e){
            System.out.println("Operacion no valido");          
        }     
    }

}
