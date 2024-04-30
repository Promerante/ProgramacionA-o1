package benítez_facundo;
//Facundo Daniel Benítez Noguera



public class ShinigamiPuro extends Shinigami {
    int escuadron;
  

    public ShinigamiPuro(int escuadron, String nombre, String origen, int edad, Zanpakuto espadaUsada) {
        super(nombre, origen, edad, espadaUsada);
        if(escuadron<=0||escuadron>13){
            this.escuadron=rn.nextInt(1,14);//Notesé que no hace falta importar el random de nuevo,ya esta implementado en la clase padre.
        }
        else{
            this.escuadron = escuadron;
        }//Con este if lo que hacemos es comprobar si el número introducido cuando metamos es válido según lo pedido o si no asignará uno aleatorio.
     
        
    }

    public void Shunpo(){
        System.out.println(nombre+" se ha desplazado usando Zunpo.");
    }
    
    protected void invocarBankai(){
        
    }
    
    public void pelear(Shinigami Rival){
        
    }

}
