package tema5.ProductosAgroAlimenticios;


public class ProductoRefrigerado extends Producto{
    int SupervisionAlimentaria;
    
    public ProductoRefrigerado(int SupervisionAlimentaria, String Fecha_Caducidad, int numero_lote) {
        super(Fecha_Caducidad, numero_lote);
        this.SupervisionAlimentaria = SupervisionAlimentaria;
    }

    public int getSupervisionAlimentaria() {
        return SupervisionAlimentaria;
    }

    public void setSupervisionAlimentaria(int SupervisionAlimentaria) {
        this.SupervisionAlimentaria = SupervisionAlimentaria;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "SupervisionAlimentaria=" + SupervisionAlimentaria + '}';
    }
 
}
