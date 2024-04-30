package tema5.ProductosAgroAlimenticios;

public class testHerencia2 {
    public static void main(String[] args) {
        Producto Producto1= new Producto("12/7/28", 65);
        ProductoRefrigerado Producto2= new ProductoRefrigerado(126569, "13/4/28",8435);
        ProductoFresco Producto3= new ProductoFresco("España","2/2/28", "4/2/26",84);
        ProductoCongelado Producto4= new ProductoCongelado(34, "13/1/25",69);
        System.out.println(Producto1);
        System.out.println(Producto2);
        System.out.println(Producto3);
        System.out.println(Producto4);
        
        
    
    }

}
