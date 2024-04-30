package tema5.Herencia;


public class Empleado extends Persona{
    int num_Empleado;
    String cargo;
    Double sueldo;
    public Empleado(){
    }
    public Empleado(int num_Empleado, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_Empleado = num_Empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_Empleado() {
        return num_Empleado;
    }

    public void setNum_Empleado(int num_Empleado) {
        this.num_Empleado = num_Empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
