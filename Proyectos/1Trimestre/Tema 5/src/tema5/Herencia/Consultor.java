package tema5.Herencia;


public class Consultor extends Persona{
    int numConsultor;
    String Empresa;
    public Consultor(){
    }
    public Consultor(int numConsultor, String Empresa, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numConsultor = numConsultor;
        this.Empresa = Empresa;
    }
    

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }



    }

   


