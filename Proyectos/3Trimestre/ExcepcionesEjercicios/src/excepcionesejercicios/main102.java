package excepcionesejercicios;
import java.util.Scanner;
public class main102 {
    public static void main(String[] args) {
       try{
         Scanner sc=new Scanner(System.in);
        System.out.println("Ponme una palabra");
        String palabra=sc.next();
        System.out.println("Ahora ponme un numero para decirte que letra tiene esa posicion");
        int pos=sc.nextInt();      
        char[] pal=palabra.toCharArray();
        System.out.println("La letra es "+ pal[pos-1]); 
                
       }
       catch(Exception e){
           System.out.println("No existe ese numero en la cadena");       
       }
      
        

    }

}
