package supermercado;

import java.time.LocalDate;


public class Cereales implements EsAlimento{
    String tipoCereal,Marca;
    double Precio;
    LocalDate Caducidad;
    int Calorias;

    public Cereales(String tipoCereal, String Marca, double Precio) {
        this.tipoCereal = tipoCereal;
        this.Marca = Marca;
        this.Precio = Precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
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
    public void setCaducidad(LocalDate fc){
        this.Caducidad=fc;
    }
    
    public LocalDate getCaducidad(){
        return Caducidad;
    }
    
    public int getCalorias(){
        switch (tipoCereal.toLowerCase()) {
            case ("espelta"):
                Calorias=5;
                break;   
            case "maiz":
                Calorias=8;
                break;
            case "trigo":
                Calorias=12;
                break;
            default:
                Calorias=15;
        }
        return Calorias;
    }
    
    @Override
    public String toString() {
        return "Cereales{" + "tipoCereal=" + tipoCereal + ", Marca=" + Marca + ", Precio=" + Precio + ", Caducidad=" + Caducidad + ", Calorias=" + Calorias + '}';
    }

}
