package supermercado;

public class Supermercado {
    public static void main(String[] args) {
        try{
            int resultado= 3/0;
        }
        catch(Exception e){
            System.out.println("No se puede dividir por cero !");
            
        }

        int edades[]={15,21,4,3};
        try{
            System.out.println("La edad de 4 es "+edades[4]);
        }
        catch (Exception e){
            System.out.println("Intentas un indice incorrecto");
        }
        
                
    }

}

