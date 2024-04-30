
package com.mycompany.circuloytriangulo;


public class CirculoYTriangulo {

    public static void main(String[] args) {
        
        Circulo a=new Circulo(3);
        Triangulo b=new Triangulo(3, 4);
        b.setAltura(5);
        System.out.println("Las carateristicas de los ejemplos son:\nCirculo:\nArea="+a.getArea()+"\nPerimetro"+a.getPerimetro()+"\nTriangulo Area="+(double)b.getArea());
    }
}
