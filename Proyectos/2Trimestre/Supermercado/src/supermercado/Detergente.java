package supermercado;


public class Detergente implements EsLiquido,ConDescuento{
    String Marca;
    double Precio;
    double volumen;
    String envase;
    double descuento;
   

    public Detergente(String Marca, double Precio) {
        this.Marca = Marca;
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

   public void setVolumen(double v){
        this.volumen=v;
   }

    public double getVolumen(){
        return volumen;
    }
    public void setTipoEnvase(String a){
        this.envase=a;
    }
    public String getTipoEnvase(){
        return envase;
    }
    
    public void setDescuento(double des){
        this.descuento=des;  
    }
    public double getDescuento(){
        return descuento;
    }
    public double getPrecioDescuento(){
        return Precio*(100-descuento/100);//El desccuento es porcentual.
    }

    @Override
    public String toString() {
        return "Detergente{" + "Marca=" + Marca + ", Precio=" + Precio + ", volumen=" + volumen + ", envase=" + envase + ", descuento=" + descuento + '}';
    }


    

}
