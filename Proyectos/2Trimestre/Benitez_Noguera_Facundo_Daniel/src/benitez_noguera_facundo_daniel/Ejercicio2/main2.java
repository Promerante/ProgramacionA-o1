package benitez_noguera_facundo_daniel.Ejercicio2;


import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
       
            //Variables
        String nombre ="Facundo Daniel Benítez Noguera"; //Facundo Daniel Benítez Noguera
        Scanner entrada = new Scanner(System.in);
        int v1 = -100, v2 = -100; //valores que se piden al usuario
        int cociente=0; //resultado de la division
        double raiz = 0; //resultado de la raiz cuadrada
        boolean noValido=true;
        NumeroE n1 = new  NumeroE(0);
        NumeroE n2 = new  NumeroE(0);//CREAMOS LOS CONSTRUCTORES AQUI para que lo tenga en cuenta durante todo el main, si no,no podremos hacer filtros para cada numero
        //Solicito el un valor y creo el primer número
 
        while(noValido){
            try {
            System.out.print("Introduce primer valor positivo: ");
            v1 = entrada.nextInt();
            n1 = new  NumeroE(v1);
                if(v1<0){
                    noValido=true;
                    throw new NumeroError("Este valor es negativo");
                }
                else{
                noValido=false;
                }
            }
            catch (NumeroError e) {
            System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Caracter no valido");
                entrada.nextLine();
            }
        }
        noValido=true;//OJO VOLVEMOS A PONERLO EN TRUE PARA EL FILTRO DEL SEGUNDO VALOR

        //Solicito el otro valor y creo el segundo número

        while(noValido){
            try {
            System.out.print("Introduce segundo valor positivo: ");
            v2 = entrada.nextInt();
            n2 = new  NumeroE(v2);
                if(v2<0){
                    noValido=true;
                    throw new NumeroError("Este valor es negativo");
                }
                else{
                noValido=false;
                }
            }
            catch (NumeroError e) {
            System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Caracter no valido");
                entrada.nextLine();
            }
        }
        try {
            if(n2.getNumero()==0&&n1.getNumero()==0){
            throw new NumeroError("0/0. Operacion indeterminada");
            }
            
            if(n2.getNumero()==0){
            throw new NumeroError("El divisor es 0. No se puede realizar operacion");
            }
            cociente = n1.getNumero() / n2.getNumero();//HASTA AQUI DIVISION Y POSIBLES PROBLEMAS
        if (n1.getNumero()<n2.getNumero()) {
                throw new NumeroError("Radical negativa. No existe resultado real(imaginario si)");   
            }
        raiz = Math.sqrt(n1.getNumero()-n2.getNumero());
        System.out.println("El cociente da como resultado: "+cociente);
        System.out.println("La raiz de la resta da como resultado: "+raiz);//Errata arreglada,ponia suma
            
        
        } 
        catch (NumeroError e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
       
     
        //Fin del programa
        
        
        //----------------------------------------------
        //Linea de comprobación: NO HACER CASO y NO TOCAR
        System.out.print("\n Codigo de chequeo de alumno: ");
        System.out.println(checkNumber(nombre, v1, v2));
        //----------------------------------------------
            
        }
    public static int checkNumber(String n, int a, int b){         
        return Objects.hash(String.valueOf(n),Integer.valueOf(a),Integer.valueOf(b));
    }

    }



