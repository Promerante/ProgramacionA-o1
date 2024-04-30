package exmanemurciarepaso.Ejercicio4;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.print("Introdduzca un número entero positivo: ");
        Scanner sc=new Scanner(System.in);//Mete numero
        String a=sc.next();//lo hace string
        char[] Chars=a.toCharArray();//Transforma en array de chars
        boolean EsDonut=false;
        if(Chars.length%2==0){//Si tiene cifras pares
            if(Chars[(Chars.length/2)]=='0'&&Chars[(Chars.length/2)-1]=='0'){
                EsDonut=true;
            }
        }
        else{//Si tiene cifras impares
            if(Chars[(Chars.length-1)/2]=='0'){
                EsDonut=true;
            }
        }
        if(EsDonut){
            System.out.println("El "+a+" es un número donut.");
        }
        else{
            System.out.println("El "+a+" no es un número donut.");        
        }            
    }
}
