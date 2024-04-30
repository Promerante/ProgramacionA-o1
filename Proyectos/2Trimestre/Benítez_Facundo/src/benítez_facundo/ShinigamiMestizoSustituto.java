package benítez_facundo;
//Facundo Daniel Benítez Noguera

public class ShinigamiMestizoSustituto extends ShinigamiMestizo{
    String zonaAsignada;

    public ShinigamiMestizoSustituto(String zonaAsignada, String nombre, String origen, int edad, Zanpakuto espadaUsada) {
        super(nombre, origen, edad, espadaUsada);
        this.zonaAsignada = zonaAsignada;
    }
    public void vigilar(){
        System.out.println(nombre+" vigila "+zonaAsignada);
    }

    public String toString() {
        return nombre+"[vida: "+vida+",poder: "+poder+"]Shinigami Sustituto\n"+espada.toString();
    }

    public void invocarBankai(){
        espada.bankai(porcentHollow/10, 2);//El método bankai nos viene perfecto para el método que invoca esta clase su espada
        System.out.println(nombre+"ha invocado su bankai"); 
    }
    
    public void pelear(Shinigami Rival){
        if(Rival instanceof ShinigamiMestizoSustituto){//Así sabemos que Rival es un Sustituto
            double ataque=espada.getAtaque();//OJO: es por esto que necesitabamos el método get del Zanpakuto anteriormente
            double defensa= Rival.espada.getResistencia();
                Rival.vida-=Math.abs(ataque-defensa);
                if(Rival.vida<0){
                    Rival.vida =0;
                }
            
           }
        else if(Rival instanceof ShinigamiPuroTenientes){
            double ataque=espada.getAtaque();
            double defensa= Rival.espada.getResistencia();
                Rival.vida-=Math.abs(ataque+poder-defensa);
                if(Rival.vida<0){
                    Rival.vida =0;
                }
            }  
        }
    }


    
    
           
    

