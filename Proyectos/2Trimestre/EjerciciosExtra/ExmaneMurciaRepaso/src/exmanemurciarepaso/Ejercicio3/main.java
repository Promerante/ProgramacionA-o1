package exmanemurciarepaso.Ejercicio3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.print("Introduzca la longitud del lado(5 como mínimo): ");
        Scanner sc=new Scanner(System.in);
        int lado=sc.nextInt();
        char[][] Total=new char[lado][lado];
        for(int a=0;a<Total.length;a++){
            for(int b=0;b<Total[a].length;b++){
                Total[a][b]='*';
                if(a>=2 && b>=2&&a<(lado-2) && b<(lado-2)){
                    Total[a][b]=' ';
                }
                System.out.print(Total[a][b]);
                System.out.print("  ");//Los separa
            }
            
            System.out.println("");
        }
    }
}
