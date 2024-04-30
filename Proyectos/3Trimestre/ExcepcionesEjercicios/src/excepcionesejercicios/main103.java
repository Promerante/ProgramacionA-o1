package excepcionesejercicios;
import java.util.Scanner;
public class main103 {
    public static void textoDeEjemplo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("El textito puesto es" + sc.next());
        throw new RuntimeException("Soy una excepcion");          
    }
    public static void main(String[] args) {
        textoDeEjemplo(); 
    }

}
