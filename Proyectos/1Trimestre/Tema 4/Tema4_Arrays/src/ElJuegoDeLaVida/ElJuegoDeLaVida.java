package ElJuegoDeLaVida;
import java.util.Scanner;
import java.util.Random;
public class ElJuegoDeLaVida {
    public static void LlenarElTablero(char [][] Tablero){
        for(int i=0; i<Tablero.length;i++){
            for(int j = 0; j<Tablero[i].length;j++){
                Tablero[i][j] = '.';
            }
        }   
    }//Con este senccillo método llenamos de "muertos" el tablero.
    public static String MostrarTablero(char [][] Actual){
           String Actualidad="";
           for(int i=0; i<Actual.length;i++){
                System.out.print(Actualidad+" | ");
                for(int j = 0; j<Actual[i].length;j++){
                    System.out.print(Actualidad+Actual[i][j]);
                }
                System.out.println(Actualidad+" | ");
            }       
           return Actualidad;
    }//Ahora creo esta función para llamarla cuantas veces quiera.
    public static void IntroducirVivos(char [][] TableroVivo){
        System.out.println("Introduce cuántos vivos deseas al inicio:");
        Scanner vivos=new Scanner(System.in);
        int Vivos=vivos.nextInt();
        Random RnX=new Random();
        Random RnY=new Random();//Con esto creamos los objetos Random importados que usaremos para meter vivos aleatoriamente
        for(int a=0;a<=Vivos;a++){
            int X=RnX.nextInt(0,40);//Ahora introducimos el objeto y le decimos sus límites,como el valor máximo es 39 como índice,
            int Y=RnY.nextInt(0,40);//el limite es 40.Tener en cuenta que el límite no es posible que salga(Rango máximo 39 entonces).
            TableroVivo[X][Y]='O';            
        }
        
    }//Hecho este un poco más complejo método,ya podemos crear la primera generación.
    public static int GeneracionDada(){
        boolean NoVálido=true;
        int Generaciones=0;
        do { 
            System.out.println("Introduce cuántas generaciones desea observar:");
            Scanner Sc=new Scanner(System.in);
            Generaciones=Sc.nextInt();
            if(Generaciones>3){
                NoVálido=false;
                break;
            }
            else{                            
                System.out.println("El ejercicio pide que sea mayor que 3.");         
            }
        } 
        while (NoVálido);
        return Generaciones;
    }    //Así pedimos las generaciones y que habrá mas de 3 generaciones .
    public static void Cambios(char [][] Tablero){
        for(int i=0; i<Tablero.length;i++){
            for(int j = 0; j<Tablero[i].length;j++){
                if(Tablero[i][j]==Tablero[0][0] || Tablero[i][j]==Tablero[40][0] || Tablero[i][j]==Tablero[0][40] || Tablero[i][j]==Tablero[40][40]){
                    
                }
            }
        
        }
    }    
    
    
    
    
        
    
    public static void main(String[] args) {
        char[][] JuegoDeLaVida=new char[40][40];//Definimos Tablero
        LlenarElTablero(JuegoDeLaVida);//Comienza el juego vacío
        IntroducirVivos(JuegoDeLaVida);
        System.out.println("Generación 0: ");
        MostrarTablero(JuegoDeLaVida); //Enseña generación 0
        int Generacion=GeneracionDada();
        for(int b=0;b<Generacion;b++){
            System.out.println("Generación "+(b+1)+":");
            
            MostrarTablero(JuegoDeLaVida);
            
        }
        

    }
    

}


/*Si deseamos ademas introducir nuevos vivos iniciales sean elegidos usuariamos esto
            System.out.println("Define en qué columna deseas las casilla viva número"+ a+1);
            Scanner sc=new Scanner(System.in);
            int X=sc.nextInt();
            System.out.println("Ahora define en qué fila deseas las casilla viva número"+ a+1);
            Scanner sc2=new Scanner(System.in);
            int Y=sc.nextInt();
            TableroVivo[X][Y]='O';
*/