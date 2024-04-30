package carreras_facundo;
import java.util.Scanner;
import java.util.Random;
public class Carreras_Facundo {
    public static void PistaInicial(Vehiculo[] Pista,Jugador[]Jugadores){
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Pista[0]=new Coche();
        Pista[1]=new Moto();
        Pista[2]=new Camion();        
        for(int a=0;a<3;a++){
            System.out.println("Elija un vehiculo\n1:Moto.\n2:Coche.\n3:Camion.");
            int opcion1=sc.nextInt();
            System.out.println("Ahora elija una carta objetivo:\n1-Camión primero y Moto segundo\n2-Camión segundo y coche primero\n3-Camión tercero y moto primero");
            int opcion2=sc.nextInt();
            Jugadores[a]=new Jugador(opcion1, opcion2);
        }
    }/*Con este método inicializamos los datos del juego.
    Dando a cada jugador la opción de elegir su vehículo(el cual no servirá pero es así mandado en el ejercicio) y su carta objetivo que
    es su manera de ganar esta partida y lo guardamos en la array de 3 jugadores(siempre es 3 porque así lo quieren),lo bueno de este método
    es que así no me falta suponer posibles fallos por si los jugadores escogen mismos vehículos u objetivos. Por último inicializa, un array
    con los distintos vehículos y sus valores del cual recurriremos posteriormente, lo malo es que entonces el orden de los jugadores esta 
    fijado.OJO: No la pista donde "correrán los vehículos,eso ya lo vemos en otro método.*/
    
    public static void FinJuego(Vehiculo[] Pista,Jugador[]Jugadores){
        boolean Jugador1Pierde=false;
        boolean Jugador2Pierde=false;
        boolean Jugador3Pierde=false;
        for(int a=0;a<3;a++){
            if(Jugadores[a].Jugador[1]==1){
                if(Pista[2].posx==9&&Pista[1].posx>Pista[0].posx){
                    System.out.println("Jugador "+(a+1)+" ha ganado el juego!!!"); 
                    Jugador1Pierde=false;
                }
                else{
                    Jugador1Pierde=true;
                    Jugador2Pierde=true;
                    Jugador3Pierde=true;

                }
            }
            else if(Jugadores[a].Jugador[1]==2){
                if(Pista[0].posx==9&&Pista[2].posx>Pista[1].posx){
                    System.out.println("Jugador "+(a+1)+" ha ganado el juego!!!"); 
                    Jugador2Pierde=false;
                }
                else{
                    Jugador1Pierde=true;
                    Jugador2Pierde=true;
                    Jugador3Pierde=true;
                }
                
            }
            else if(Jugadores[a].Jugador[1]==3){
                if(Pista[1].posx==9&&Pista[0].posx>Pista[2].posx){
                    System.out.println("Jugador "+(a+1)+" ha ganado el juego!!!"); 
                    Jugador3Pierde=false;
                } 
                else{
                    Jugador1Pierde=true;
                    Jugador2Pierde=true;
                    Jugador3Pierde=true;
                }
            }
            else{break;}
        }
        if(Jugador1Pierde&&Jugador2Pierde&&Jugador3Pierde){
            System.out.println("Nadie ha ganado...");
        }
    }/*Y este es el último método,con el cual comprobará 
    cogiendo la información de los distintos jugadores y comprobamos si sus objetivos se ha cumplido haceindo así que el jugador O 
    JUGADORES(ya que el ejercicio no lo específica) han ganado, y si no se ha cumplido ningunade ellas pues nadie ha ganado el juego,
    ya que no lo gana el jugador que su vehículo llegue primero,sino si su objetivo se cumple(NOTA:ya que hemos hecho el objeto jugador
    podríamos haber hecho un atributo boolean pierda para agilizar el proceso,pero he llegado a esta conclusión cuando he terminado el juego.*/
    
    
    
    public static void DibujarPista(Vehiculo[] Pista){
       String[][] Dibujo=new String[3][10];//1
        for (int i = 0; i < Dibujo.length; i++) {
            for (int j = 0; j < Dibujo[0].length; j++) {
            Dibujo[i][j]="-"   ;
            }
        }//2
        for(int a=0;a<3;a++){
            Dibujo[Pista[a].posy][Pista[a].posx]=Pista[a].nombre;
        }//3
        for (int i = 0; i < Dibujo.length; i++) {
            for (int j = 0; j < Dibujo[0].length; j++) {
                System.out.print(Dibujo[i][j]+" ");  
            }
            System.out.println();
        }//4
    }/*Este método es el principal ya que es el que usaremos al final de cada turno para 
    mostrar a los jugadores como van en la "Pista".El método realizo lo siguiente:
    1-Siempre inicializa la "Pista" que no es mas una array bidimendasional de Strings 3x10(fijo puesto que así se pide).
    2- Lo rellena de " - " que nos indicará los distintos carriles a los jugadores.
    3-Llama a la array Pista donde esta los vehículos que juegan,hacemos un bucle que lo recorra, y en la "Pista" pondremos el nombre de cada vehículo
    según donde esta  los vehículos despues de los turnos donde avanza y retroceden llamando a su posx y posy y poniéndolo en la columna y fila de la
    "Pista" respectivamente.
    4-Imprimimos la "Pista actualizada" para que así lo vean los jugadores como van actualmente cada jugador*/
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Jugador[] Jugadores=new Jugador[3];
        Vehiculo[] Pista=new Vehiculo[3];/*Estas 3 líneas originan el juego,creando las array de los vehículos y jugadores(junto al scanner),estas serán clave porque 
        aquí guardaremos la información necesaria para crear el juego*/
        PistaInicial(Pista, Jugadores);
        while(Pista[0].posx<9&&Pista[1].posx<9&&Pista[2].posx<9){
            for(int a=0;a<3;a++){
                System.out.println("Turno de "+Pista[a].nombre);
                Random rn=new Random();
                int Carta=rn.nextInt(1,3);
                switch (Carta) {
                    case 1:
                        System.out.println("Tienes una Carta de avanzar,quien quieres que avanze.");
                        Pista[sc.nextInt()-1].avanzar();
                        break;
                    case 2:
                        System.out.println("Tienes una Carta de retroceder,quien quieres que retrodezca.");
                        Pista[sc.nextInt()-1].retroceder();
                        break;
                    
                }
            }
            DibujarPista(Pista);
                System.out.println("Siguiente turno...");
        }
        System.out.println("Fin del juego!!!:");
        FinJuego(Pista, Jugadores);
        
        

    }

}
