package parking;

public class main {
    public static void main(String[] args) {
        
        Parking Astolfo=new Parking("Astolfo", 5);
      
        Astolfo.entrada("c2468", 2);
        System.out.println(Astolfo.toString());
        Astolfo.salida("c2268");
        System.out.println(Astolfo.toString());
        

        
        

    }

}
