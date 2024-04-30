package benítez_facundo;
//Facundo Daniel Benítez Noguera

public class ShinigamiPuroTenientes extends ShinigamiPuro{

    public ShinigamiPuroTenientes(int escuadron, String nombre, String origen, int edad, Zanpakuto espadaUsada) {
        super(escuadron, nombre, origen, edad, espadaUsada);
    }//No tiene propiedades nuevas.
    
    public String toString() {
        return nombre+"[vida: "+vida+",poder: "+poder+"]Teniente del "+escuadron+" escuadrón\n"+espada.toString();
    }
    
    public void invocarBankai(){
        System.out.println(nombre+" no puede invocar su bankai");   
    }
    
    public void pelear(Shinigami Rival){
        if(Rival instanceof ShinigamiMestizoSustituto){
            double ataque=espada.getAtaque();
            double defensa=Rival.espada.getResistencia()+((ShinigamiMestizoSustituto) Rival).poder;
                Rival.vida-=Math.abs(ataque-defensa);
                if(Rival.vida<0){//Esto nos asegura que su vida no bajará más alla del 0
                    Rival.vida =0;
                } 
        }
        else if(Rival instanceof ShinigamiPuroTenientes){
            double ataque=espada.getAtaque();
            double defensa=Rival.espada.getResistencia();
                Rival.vida-=Math.abs(ataque+poder-defensa);
                if(Rival.vida<0){
                    Rival.vida =0;
                }
            }  
        }  
    }

