package com.mycompany.modelosStarUml;
import java.util.*;

public class Rectangulo {

    public int base;
    public int altura;

    public  Rectangulo() {
        base=1;
        altura=1;
    }


    public void Rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    /**
     * @return
     */
    public int getArea() {
        // TODO implement here
        return base*altura;
    }

    /**
     * @return
     */
    public int getPerimetro() {
        // TODO implement here
        return 2*base+2*altura;
    }

    /**
     * @return
     */
    public int getBase() {
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

    public void setBase( int Base) {
        base=Base;
    }

    public void setAltura( int Altura) {
        altura=Altura;
    }

    /**
     * 
     */


}