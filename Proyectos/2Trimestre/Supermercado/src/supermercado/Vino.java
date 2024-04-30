package supermercado;

import java.time.LocalDate;


public class Vino implements EsLiquido,ConDescuento,EsAlimento {
    String Marca;
    double Precio;
    double volumen;
    String envase,tipo;
    double descuento;
    int grados;
    int Calorias;
    LocalDate Caducidad;
    
   

    public Vino(String Marca, String tipo, int grados,double Precio) {
        this.Marca = Marca;
        this.Precio = Precio;
        this.tipo=tipo;
        this.grados=grados;
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

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
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
    public void setCaducidad(LocalDate fc){
        this.Caducidad=fc;
    }
    
    public LocalDate getCaducidad(){
        return Caducidad;
    }
    
    public int getCalorias(){
        
        return 10*grados;
    }
    @Override
    public String toString() {
        return "Vino{" + "Marca=" + Marca + ", Precio=" + Precio + ", volumen=" + volumen + ", envase=" + envase + ", tipo=" + tipo + ", descuento=" + descuento + ", grados=" + grados + '}';
    }
}
