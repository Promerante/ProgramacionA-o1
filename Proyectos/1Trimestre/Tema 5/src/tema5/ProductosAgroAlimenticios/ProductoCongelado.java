package tema5.ProductosAgroAlimenticios;


public class ProductoCongelado extends Producto{
    int TemperaturaRecomendada;

    public ProductoCongelado(int TemperaturaRecomendada, String Fecha_Caducidad, int numero_lote) {
        super(Fecha_Caducidad, numero_lote);
        this.TemperaturaRecomendada = TemperaturaRecomendada;
    }

    public int getTemperaturaRecomendada() {
        return TemperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int TemperaturaRecomendada) {
        this.TemperaturaRecomendada = TemperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "TemperaturaRecomendada=" + TemperaturaRecomendada + '}';
    }
    

}
