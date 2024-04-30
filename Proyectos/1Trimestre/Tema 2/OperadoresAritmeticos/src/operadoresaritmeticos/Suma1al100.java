
package operadoresaritmeticos;

public class Suma1al100 {
    public static void main(String[] args){
        
int num[]=new int[100];
int suma=0;
for(int i=0;i<num.length;i++){
    num[i]=i+1;
    suma+=num[i];}
System.out.println("La suma es "+suma);
double media= suma/num.length;
System.out.println("La media es "+media);
}}
