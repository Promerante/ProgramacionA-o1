package heroes;
import java.util.Scanner;



public class main {
    public static Heroe[] Inicio(){
        Scanner sc=new Scanner(System.in);//Iniciamos un muy util scanner en este metodo
        System.out.print("Cuántos jugadores van a combatir(mínimo 2): ");
        int jugadores=sc.nextInt();
        Heroe[] heroes=new Heroe[jugadores];//tengo la array de los jugadores para jugar 
        for(int a=0;a<heroes.length;a++){
            int clase=0;     
            do{  
                System.out.println("Escoge tu clase: \n1:Mago \n2:Guerrero.\n3:Elfo.");
                clase=sc.nextInt();
                if(clase<=0 || clase > 3){
                    System.out.println("Escoge apropiadamente entre 1,2,3 según la clase que desees");     
                }          
            }while (clase<=0 || clase > 3);//Con este bucle nos aseguramos que cada jugador pone una clase valida.Si escribes una letra explota            
            switch (clase) {
                case 1:
                    System.out.print("Ahora introduzca el nombre de tu mago(MAX 1 palabra):");
                    heroes[a]=new Mago(sc.next());
                    break;
                case 2:
                    System.out.print("Ahora introduzca el nombre de tu guerrero(MAX 1 palabra):");
                    heroes[a]=new Guerrero(sc.next());
                    break;
                case 3:
                    System.out.print("Ahora introduzca el nombre de tu elfo:(MAX 1 palabra):");
                    heroes[a]=new Elfo(sc.next());
                    break;
                default:
                    System.out.println("No se como has llegado a esto en consola,pero me has roto el juego :( " );
            }
        }return heroes;
    }//Con este senciliisimo método empezaremos el juego teniendo ya mi array con los jugadores


    public static int Turnos(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Cuántos turnos desea que dure el combate:");
        int turnos=sc.nextInt();
        return turnos;
    }//Aquí vamos a devolver el número máximo de turnos que puede tener la partida.
    
    
    public static boolean AlgunoMuerto(Heroe[] heroes){
        boolean algunoMuerto=false;
        for(int a=0;a<heroes.length;a++){
            if (heroes[a].estaMuerto()){
                algunoMuerto=true;
                System.out.println("Gracias por jugar!");
            }
        }return algunoMuerto;
    }/*Es por esto que hicimos el metodo general de estaMuerto.Así llamando al mismo y recorriendo la 
    array sabremos si alguno murió,dirá su nombre y acabará el juego en el bucle del main*/
    
    
    public static void OrdenarTurnos(Heroe[] heroes){
        System.out.println("Las iniciativas de cada jugador son:");
        for(int g=0;g<heroes.length;g++){
            System.out.println(heroes[g].nombre+": "+ heroes[g].iniciativa); 
        }//Mostramos la iniciativa de cada jugador desordenado.
        //Tenemos ya la array de heroes desordenados.Aplicamos una especie de método burbuja.
        for(int a=0;a<heroes.length-1;a++){
            for(int b=0;b<heroes.length-1;b++){
                if(heroes[b].iniciativa>heroes[b+1].iniciativa){
                    Heroe temp=heroes[b+1];
                    heroes[b+1]=heroes[b];
                    heroes[b]=temp; 
                }
            }
        }//Con estos bucles anidados los ordenamos DE MENOR A MAYOR.
        System.out.println("Por lo que los turnos ordenados junto su inciativa es:\n"+"|-----------------------|");
        for(int c=heroes.length-1;c>=0;c--){//Importante el menos uno,asi indicamos que es el indice mayor,el último de la array por lo que el de iniciativa más alta.
            System.out.println(heroes[c].nombre+": "+heroes[c].iniciativa+".");
        }
        System.out.println("|-----------------------|\n Empieza el combate!!!");
    }/*La idea es ordenar la array según cuanto más alto saquen en un dado de 20 caras sumado a su destreza.Así luego
     tendrá más posibilidades de empezar primero en el combate los que mas destreza tengan.Por simpleza es MUCHO más fácil hacer un atributo "iniciativa en cada héroe.
     CUIDADO: los ordenamos de MENOR A MAYOR.*/ 
    
    

    

    
    public static void main(String[] args) {
        Heroe[] heroes= Inicio() ;
        int turnos= Turnos();
        OrdenarTurnos(heroes);
        for(int a=1;a<=turnos && !AlgunoMuerto(heroes);a++){
            for(int p=heroes.length-1;p>=0;p--){//QUEDA HACER EL MENU Y LAS DISTINTAS INTERRACIONES,LO MAS DURO VAYA.
               
            }
            
             
        }
        
    }

}
