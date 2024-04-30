package tema5.ProductosAgroAlimenticios;


public class ProductoFresco extends Producto{
    String PaísOrigen;
    String FechaEnvasado;

    public ProductoFresco(String PaísOrigen, String FechaEnvasado, String Fecha_Caducidad, int numero_lote) {
        super(Fecha_Caducidad, numero_lote);
        this.PaísOrigen = PaísOrigen;
        this.FechaEnvasado = FechaEnvasado;
    }

    public String getPaísOrigen() {
        return PaísOrigen;
    }

    public void setPaísOrigen(String PaísOrigen) {
        this.PaísOrigen = PaísOrigen;
    }

    public String getFechaEnvasado() {
        return FechaEnvasado;
    }

    public void setFechaEnvasado(String FechaEnvasado) {
        this.FechaEnvasado = FechaEnvasado;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "Pa\u00edsOrigen=" + PaísOrigen + ", FechaEnvasado=" + FechaEnvasado + '}';
    }
    


}


