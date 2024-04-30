package com.mycompany.colecciones;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class Colecciones {

    public static void main(String[] args) {
        List<Persona> lista=new ArrayList<Persona>();
        lista.add(new Persona(1,"Cristina",30));
        lista.add(new Persona(2,"Ale",20));
        lista.add(new Persona(3,"David",40));
        lista.add(new Persona(4,"Daniela",50));
        System.out.println("----------FOR----------");
        for(int a=0;a<lista.size();a++){
            System.out.println("Prueba"+lista.get(a).getNum());
        }
        System.out.println("-----------FOREACH-----------");
        for(Persona perso:lista){
            System.out.println("Prueba"+perso.getNum());
        }
        ArrayList numeros=new ArrayList<Integer>();
        ArrayList <gato> gatos=new ArrayList<gato>();
                gatos.add(new gato("mocha","negro","decente"));
        gatos.add(new gato("michi","naranja","negro"));

        Collections.sort(gatos);
        for(gato gatoAux:gatos){
            System.out.println(gatoAux+"\n");
        }
        

    }
}
