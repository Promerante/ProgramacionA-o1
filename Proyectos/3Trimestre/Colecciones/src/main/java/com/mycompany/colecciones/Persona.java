package com.mycompany.colecciones;


public class Persona {
    private int num;
    private String nombre;
    private int edad;
    
    
    public Persona(){}
    public Persona(int num,String nombre,int edad){
        this.num=num;
        this.nombre=nombre;
        this.edad=edad;
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
