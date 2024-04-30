package benítez_facundo;
//Facundo Daniel Benítez Noguera



public class ShinigamiMestizo extends Shinigami {
    double porcentHollow,porcentQuincy;
    

    public ShinigamiMestizo(String nombre, String origen, int edad, Zanpakuto espadaUsada) {
        super(nombre, origen, edad, espadaUsada);
        this.porcentHollow = rn.nextDouble(10,51);
        this.porcentQuincy = 50-porcentHollow; 
    }
  
    public void invocarBankai(){
        
    }
    public void pelear(Shinigami Rival){
        
    }
    

}





