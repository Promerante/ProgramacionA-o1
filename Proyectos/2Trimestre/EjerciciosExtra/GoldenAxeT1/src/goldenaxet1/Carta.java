package goldenaxet1;


public class Carta {
    String FraseCarta;
    int vida,fuerza;

    public Carta(String FraseCarta, int vida, int fuerza) {
        this.FraseCarta = FraseCarta;
        this.vida = vida;
        this.fuerza = fuerza;
    }
    public Carta(){   
    }
    public Carta[] BarajaInicial(){
        Carta[] BarajaInicial=new Carta[5];
        BarajaInicial[0]=new Carta("Obtienes un punto de vida",1,0);
        BarajaInicial[1]=new Carta("Obtienes un punto de fuerza",0,1);
        BarajaInicial[2]=new Carta("Pierdes un punto de vida",-1,0);
        BarajaInicial[3]=new Carta("Pierdes un punto de vida",0,-1);
        BarajaInicial[4]=new Carta("Obtienes dos punto de vida",2,0);
    return BarajaInicial;
    }

    @Override
    public String toString() {
        return "Carta{" + FraseCarta +".Vida obtenida: "+ vida + ".Fuerza obtenida: "+fuerza + '}';
    }
    
    
       


}
