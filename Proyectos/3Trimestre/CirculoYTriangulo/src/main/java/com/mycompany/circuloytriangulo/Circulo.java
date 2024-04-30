package com.mycompany.circuloytriangulo;
import java.util.*;


public class Circulo {



    public int radio;

    /**
     * 
     */
    public void Circulo() {
        this.radio=1;
        // TODO implement here
    }

    public  Circulo( int radio) {
        this.radio=radio;
        // TODO implement here
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return radio;
    }

 
    public void setRadio( int Radio) {
        this.radio=Radio;
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return Math.PI*Math.pow(radio, 2);
    }

    /**
     * @return
     */
    public double getPerimetro() {
        // TODO implement here
        return 2*Math.PI*radio;
    }

}