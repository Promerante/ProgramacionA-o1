package benítez_facundo;

public class Main {
    public static void main(String[] args) {//En este main compprobaremos si funciona las distintas funciones
        Zanpakuto Espada1=new Zanpakuto(1, 2, "Espada Carmesí");
        Zanpakuto Espada2=new Zanpakuto(4, 2, "Juramentada");
        ShinigamiMestizoSustituto Lejia=new ShinigamiMestizoSustituto("Cáceres", "Lejía", "Soria", 18, Espada1);
        //Es un pequeño chiste ya que este ejercicio esta inspirado en una anime llamado Bleach(Lejia).
        ShinigamiPuroTenientes Dalinar=new ShinigamiPuroTenientes(24, "Dalinar", "Roshar", 42, Espada2);
        System.out.println(Lejia.toString());
        System.out.println(Dalinar.toString());
        Lejia.vigilar();
        Lejia.invocarBankai(); 
        Dalinar.Shunpo();
        Dalinar.invocarBankai();
        Lejia.pelear(Dalinar);
        Dalinar.pelear(Lejia);
        System.out.println(Lejia.toString());
        System.out.println(Dalinar.toString());
   
        

    }

}
