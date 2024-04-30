package exmanemurciarepaso.Ejercicio1;

public class main {
    public static void main(String[] args) {
        Teslas Coche=Teslas.SeleccioneModelo();
        Coche.SeleccioneBateria(Coche);
        Coche.SeleccionCondAuto(Coche); 
        int preciobateria=125*Coche.bateria;
        System.out.println("Gracias.Aquí tiene el presupuesto del coche.");
        System.out.println("Tesla"+Coche.modelo);
        System.out.println("Precio base             "+Coche.precio+" €");
        System.out.println("Bateria de "+Coche.bateria+" kWh            "+preciobateria+" €");
        double descuento=((preciobateria+Coche.precio)*(-0.05));
        if(Coche.condauto){
            System.out.println("Con conducción aut.          1800.0 €");
            descuento=((preciobateria+Coche.precio+1800.0)*(-0.05));
            System.out.println("Subvención estatal          "+descuento+" €");
        }
        else if(!Coche.condauto){
            System.out.println("Subvención estatal          "+descuento+" €");
        }
        
        if(Coche.condauto){
            System.out.println("Total:                  "+((preciobateria+Coche.precio+1800.0)*(0.95))+" €");
        }
        else if (!Coche.condauto){
            System.out.println("Total:                  "+((preciobateria+Coche.precio)*(0.95))+" €");    
                }
        
         
        System.out.println(Coche.toString());
    }
}
