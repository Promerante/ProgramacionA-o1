package tema5.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma Objeto1= new Rectangulo(4.0, 5.1, "Azul", "Rectángulin");
        Forma Objeto2=new Cirulo(52.0, "Amarillo", "Ciculín");
        System.out.println(Objeto1.toString() + " - Área: " + Objeto1.CalcularArea());
        System.out.println(Objeto2.toString() + " - Área: " + Objeto2.CalcularArea());
}
}

    

