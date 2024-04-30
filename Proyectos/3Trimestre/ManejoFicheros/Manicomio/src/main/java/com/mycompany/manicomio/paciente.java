package com.mycompany.manicomio;


public class paciente {
    private int id;
    private String nombre,apellido,enfermedad;

    public paciente(int id, String nombre, String apellido, String enfermedad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.enfermedad = enfermedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    @Override
    public String toString() {
        return id +" " + nombre + " " + apellido + " " + enfermedad ;
    }
    

 
    

}
