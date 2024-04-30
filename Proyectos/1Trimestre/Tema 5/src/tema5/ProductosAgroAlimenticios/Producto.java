package tema5.ProductosAgroAlimenticios;


public class Producto {
    String Fecha_Caducidad;
    int numero_lote;
    public Producto(){}

    public Producto(String Fecha_Caducidad, int numero_lote) {
        this.Fecha_Caducidad = Fecha_Caducidad;
        this.numero_lote = numero_lote;
    }

    public String getFecha_Caducidad() {
        return Fecha_Caducidad;
    }

    public void setFecha_Caducidad(String Fecha_Caducidad) {
        this.Fecha_Caducidad = Fecha_Caducidad;
    }

    public int getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    @Override
    public String toString() {
        return "Producto{" + "Fecha_Caducidad=" + Fecha_Caducidad + ", numero_lote=" + numero_lote + '}';
    }

}
