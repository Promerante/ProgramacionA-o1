package goldenaxet1;
import java.util.Scanner;
import java.util.Random;

public class GoldenAxeT1 {
    
        public static void PeleatoString(Jugador[] Grupo,Cthulhu Cthulhu){
        String Party;
            for(int a=0;a<Grupo.length;a++){
                Party="|Miembro "+(a+1)+": "+Grupo[a].toString()+"|" ;  
                System.out.println(Party);
            }    
            System.out.println(Cthulhu.toString());
        }//CON ESTO VEMOS COMO VA LA PARTY Y CTHULHU
        
        public static boolean GrupoVivo(Jugador[] Party){
            boolean TodosVivos=true;
            for(int s=0;s<Party.length&&TodosVivos==true;s++){
                if(Party[s].estaVivo==true){}
                else{TodosVivos=false;}
            }
            return TodosVivos;
        }//CON ESTE BUCLE COMPROBAMOS QUE TODOS ESTAN VIVOS,AHORA SI ESTO SE CUMPLE SIGA EL JUEGO
    
        public static void reponerVida(Jugador JugadorQueSeCura){
            JugadorQueSeCura.vida+=1;
        }//ACCION SIMPLE QUE LE DARA UNO DE VIDA AL JUGADOR QUE QUIERA
        
        public static void cogerCarta(Jugador JugadorQueSeLaJuega){
            Random cogeUnaCarta=new Random();
            int CogeunaCarta=cogeUnaCarta.nextInt(0,5);
            switch (CogeunaCarta) {
                case 0:
                    System.out.println(JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].toString());
                    JugadorQueSeLaJuega.vida+=JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].vida;
                    break;
                case 1:
                    System.out.println(JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].toString());
                    JugadorQueSeLaJuega.fuerza+=JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].fuerza;
                    
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println(JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].toString());
                    JugadorQueSeLaJuega.vida+=JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].vida;             
                    break;
                case 4:
                    System.out.println(JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].toString());
                    JugadorQueSeLaJuega.vida+=JugadorQueSeLaJuega.BarajaJugador[CogeunaCarta].vida;
                    break;
                default:
                    System.out.println("HAS ENCONTRADO UN EASTER EGG IMPOSIBLE JUGANDO.ESPERO QUE TE GUSTE MIRAR O TOQUETEAR MI CÓDIGO :D");
            }     
        }//COMPLEJO MÉTODO QUE JUNTAMOS NÚMEROS ALEATORIOS PARA QUE SALGAN CARTAS Y MODIFIQUE VALORES EN EL JUGADOR.
        
        public static void PelearCthulhu(Jugador JugadorQuePelea,Cthulhu cthulhu){
            Random dado=new Random();
            int DañoTotal=0 ;
            for(int D=1;D<=JugadorQuePelea.fuerza;D++){
                int Dado=dado.nextInt(0,7);
                System.out.println("TIRADA DEL DADO "+ D + ": "+ Dado ) ;
                DañoTotal+=Dado;
            }
            System.out.println("DAÑO TOTAL: "+DañoTotal);
            System.out.println("LA VIDA DE CTHULHU ERA: "+cthulhu.vida);
            cthulhu.vida-=DañoTotal;
            System.out.println("LA VIDA DE CTHULHU ES: "+cthulhu.vida);
            JugadorQuePelea.vida-=1;
            System.out.println("LA VIDA DEL JUGADOR AHORA ES"+JugadorQuePelea.vida);
        }
        
        
        
    
    public static void main(String[] args) {
        System.out.println("ELIGE EL NÚMERO DE JUGADORES DEL 1 AL 5:");
        Scanner sc=new Scanner(System.in);
        int Jugadores=sc.nextInt();
        while(Jugadores>5||Jugadores<1){
            System.out.println("NÚMERO DE JUGADORES NO VÁLIDO, INTRODUCE UNO VÁLIDO");
            System.out.println("ELIGE EL NÚMERO DE JUGADORES DEL 1 AL 5:");
            sc= new Scanner(System.in);
            Jugadores=sc.nextInt();
        }//BUCLE PARA QUE JUGADORES DEVUELVA NUMERO DE JUGADORES 1 AL 5
        Jugador[] Grupo=new Jugador[Jugadores];
        for(int a=0;a<Grupo.length;a++){
            System.out.println("Selecciona el jugador:ENANO,GUERRERO O AMAZONA.");
            Scanner sc2=new Scanner(System.in);
            String TipoJugador=sc2.next();
            if("ENANO".equalsIgnoreCase(TipoJugador)){
                Jugador Jugador=new Enano();
                Grupo[a]=Jugador;
            }
            else if("AMAZONA".equalsIgnoreCase(TipoJugador)){
                Jugador Jugador=new AMAZONA();
                Grupo[a]=Jugador;
            }
            else if("GUERRERO".equalsIgnoreCase(TipoJugador)){
                Jugador Jugador=new Guerrero();
                Grupo[a]=Jugador;
            }
            else{
                System.out.println("POR TONTO TE VAS A QUEDAR SIN PJ,COMO SOY BUENO TE DEJO INDICAR BIEN OTRA VEZ");
                a--;
            }
        }//CON ESTO HACEMOS UNA ARRAY GRUPO CON LOS JUGADORES Y SUS RESPECTIVAS CLASES.
        Cthulhu Boss=new Cthulhu((20+2*Jugadores));//CON EL FICHERO Y ESTA CREACION DEL OBJETO CTHULHU CREAMOS CORRECTAMENTE A CTHULHU
        System.out.println("TU GRUPO ENTONCES SON:");//CREAMOS UNA ARRAY DE JUGADORES "GRUPO" DE TAMAÑO JUGADORES.INTRODUCIDOS.
        PeleatoString(Grupo, Boss);//COMPROBAMOS QUE ESTAN TODOS LOS JUGADORES PREPARADOS
        System.out.println("QUE EMPIEZE EL COMBATE:");
        
        for(int p=1;p<=8&&GrupoVivo(Grupo)&&Boss.estaVivo;p++){
            System.out.println("TURNO "+p+':');
            for(int t=0;t<Grupo.length;t++){
                
            }
            
            
            
        }
        System.out.println("Game Over.");

        
        
        
        
        
    }
}
