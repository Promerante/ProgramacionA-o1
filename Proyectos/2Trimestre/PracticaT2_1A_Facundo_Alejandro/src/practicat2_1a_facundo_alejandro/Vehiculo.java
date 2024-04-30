package practicat2_1a_facundo_alejandro;

    public abstract class Vehiculo {
String nombre;
int posx;
int posy;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.posx = 0;
        this.posy = 0;
    }

public abstract void avanzar();
public abstract void retroceder();
}
