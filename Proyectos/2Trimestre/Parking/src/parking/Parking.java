package parking;

import java.util.ArrayList;
import java.util.InputMismatchException;


public class Parking {
    String[] matriculas;
    String nombreParking;
    int plazas;

    public Parking(String nombreParking, int plazas) {
        this.nombreParking = nombreParking;
        matriculas=new String[plazas];
    }

    public String getNombreParking() {
        return nombreParking;
    }
    
    public void entrada(String nuevaMatricula,int plaza){
        try {
            boolean Coincide=false;
            if(nuevaMatricula==null || nuevaMatricula.isBlank() ){
                throw new CustomExcepcion("Matricula"+nuevaMatricula+ "vacía");
            }
            for(int a=0;a<matriculas.length;a++){
                if(matriculas[a]==null){}   
                else if(matriculas[a].equalsIgnoreCase(nuevaMatricula)){
                    Coincide=true;
                }   
            }
            if(nuevaMatricula.replaceAll("\\s", "").toCharArray().length<4){
                throw new CustomExcepcion("Matrícula"+nuevaMatricula+" demasiado corta.");
            }
            else if(matriculas[plaza-1]!=null){
                throw new CustomExcepcion("Plaza "+plaza+" ocupada.La matricula"+nuevaMatricula+" no puede entrar ");
            }
            else if(Coincide){
                throw new CustomExcepcion("Matrícula repetida");
            }
            matriculas[plaza-1]=nuevaMatricula;
        }   
        catch (CustomExcepcion e) {
            System.out.println(e.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Esa plaza no existe");
        }
    }
    
    public int salida(String nuevo){
        int a=0;
        try {
            for(int b=0;b<matriculas.length;b++){
                if (matriculas[b]==nuevo) {
                    System.out.println("La matricula "+nuevo+" la plaza "+ (b+1));
                    matriculas[b]="a";
                    a=b;  
                }
                else{
                    System.out.println("No pasa nada en esta plaza");
                }
            }
            
            
        } 
        catch (Exception e) {
            System.out.println("ME ELECTROCUTAS PEDRITO");
            
        }
        
        return a;
    }
    
    public String toString(){
        String toString="";
        toString+=nombreParking+":\n";
        for(int a=0;a<matriculas.length;a++){
            if(matriculas[a]==null){
                toString+="Plaza"+(a+1)+": vacia.\n";
            }
            else{
                toString+="Plaza"+(a+1)+": "+matriculas[a]+".\n";
            }    
        }
        return toString;
    }
    
}


    


