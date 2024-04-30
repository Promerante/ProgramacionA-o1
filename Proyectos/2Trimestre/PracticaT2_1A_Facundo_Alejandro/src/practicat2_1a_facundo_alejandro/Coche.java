package practicat2_1a_facundo_alejandro;


public class Coche extends Vehiculo{
    int[] posicion;
    public Coche(String nombre) {
        super(nombre);
        posicion= new int [2];
        posicion[0]=posy;
        posicion[1]=posx;
    }
    
        public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    public void avanzar(){
    posicion[1]+=3;
    }
    public void retroceder(){
    posicion[1]-=3;    
    }

}
