package com.mycompany.circuloytriangulo;
import java.util.*;


public class Triangulo {



    /**
     * 
     */
    public int base;

    /**
     * 
     */
    public int altura;

    /**
     * 
     */
    public void Triangulo() {
        this.base=1;
        this.altura=1;
                
    }


    public  Triangulo( int base,  int altura) {
        this.base=base;
        this.altura=altura;
        // TODO implement here
    }

    /**
     * @return
     */
    public int getbase() {
        // TODO implement here
        return base;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return altura;
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return base*altura/2;
    }

    /**
     * 
     */
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * 
     */
    public void setAltura(int altura) {
        // TODO implement here
        this.altura=altura;
    }

}