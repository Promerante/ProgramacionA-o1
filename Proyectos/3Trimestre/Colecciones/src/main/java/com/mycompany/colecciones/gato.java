package com.mycompany.colecciones;


public class gato implements Comparable<gato>{
    private String nombre,color,raza;
    public gato(String nombre, String color, String raza){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "gato{" + "nombre=" + nombre + ", color=" + color + ", raza=" + raza + '}';
    }

    
    public int compareTo(gato o){
        return (this.nombre).compareTo(o.getNombre());
    }

}
