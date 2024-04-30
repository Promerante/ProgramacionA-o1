/*------------------------------------------------------------------------------
Se desea implementar en JAVA la clase Coche. Cada coche debe tener un color,
una anchura, una altura, un numero de puertas y un numero de ruedas.

a) Programa la clase coche usando un constructor con parámetros. Ten en cuenta
que todo coche tiene 4 ruedas siempre.

b) Implementa el método arrancar() para arrancar el coche. Un coche sólo puede
arrancarse si está parado/apagado. El método mostrará por pantalla si consigue
arrancar el coche o no.

c) Implementa el método parar() para parar/apagar el coche. Un coche sólo puede
pararse si está arrancado. El método mostrará por pantalla si consigue parar el
coche o no.

d) Implementa el método desplazarse() para hacer que el coche se mueva. Un
coche sólo puede moverse si está arrancado. El método mostrará por pantalla si
consigue desplazarse con el coche o no.

e) Añade el atributo de clase gasolina (tipo entero), el cual indicará la cantidad de
gasolina que posee el coche en cada momento (valores entre 0 y 50).
 
f) Haz que el método arrancar consuma 5 unidades de gasolina y el método
desplazarse, 20 unidades. 

g) Crea el método echar gasolina, el cual añadirá tantas unidades de gasolina como
indique su argumento. Recuerda que para echar gasolina debes apagar el coche.

h) Crea el método chequear() el cual devolverá un valor booleano. Verdadero si el
coche tiene gasolina y falso en caso contrario. Además, el coche sólo podrá
arrancar si este método devuelve true.

i) Crea la el método pintar() el cual “pintará” el coche con el color que se le pase
como parámetro.

j) Implementa el método toString() para la clase coche.
---------------------------------------------------------------------------------*/
package tema5.COCHES;
//Definimos los atributos de una clase
public class Coche {
    private String color;
    private double anchura;
    private double altura;
    private int numPuertas;
    private final int  NUMRUEDAS = 4;      // El coche siempre tiene 4 ruedas
    private boolean estaArrancado = false; // El coche comienza parado 
    private int gasolina = 0;              // Sin gasolina al inicio
   
    public Coche(String color, double anchura, double altura, int numPuertas, 
                 boolean estaArrancado, int gasolina) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numPuertas = numPuertas;
        this.estaArrancado = estaArrancado;
        // Controlamos en el constructor que el valor de la gasolina esté en el
        // rango especificado de 0 a 50
        if (gasolina < 0) {
            this.gasolina = 0; // Si el valor es negativo,reseteamos la gasolina
        } else if (gasolina > 50) {
            this.gasolina = 50; // Si el valor es mayor que 50,lo limitamos a 50
        }else
           this.gasolina = gasolina;
    }


    public void arrancar() {
        // Hay gasolina y no está arrancado
        if (this.gasolina > 0 ) {
            if (!this.estaArrancado){
                this.estaArrancado = true;
                this.gasolina -= 5; // Al arrancar consumimos 5 unidades de gasolina
                System.out.println("El coche está arrancado.");        
             }else { // Si está arrancado
               System.out.println("El coche está arrancado.");
            }
        } else {  //No hay gasolina
             if(!this.estaArrancado){
                System.out.println("No hay suficiente gasolina para arrancar el coche.");
        }
    }
    }
    
   // Mejora metodo arrancar mas compacto y usamos la función chequear para ver 
   // si tiene gasolina
    public void arrancar2() {
        if (chequear()) {
            if (!this.estaArrancado) {
                this.estaArrancado = true;
                this.gasolina -= 5;
                System.out.println("El coche está arrancado.");
            } else {
                System.out.println("El coche está arrancado.");
            }
        } else {
            System.out.println("No hay suficiente gasolina para arrancar el coche.");
        }
    }

    public void parar() {
        if (this.estaArrancado) {
            this.estaArrancado = false;
            System.out.println("El coche está parado.");
        } else {
            System.out.println("El coche está parado");
        }
    }

   public void desplazarse() {
    if (!this.estaArrancado) {
        System.out.println("El coche no puede desplazarse, no está arrancado.");
        return; // Salir del método si no está arrancado
    }
    if (this.gasolina > 0) {
        System.out.println("El coche se ha desplazado.");
        this.gasolina -= 20; // Al desplazarse consumimos 20 unidades de gasolina
    } else {
        System.out.println("No hay suficiente gasolina para desplazar el coche.");
    }
}

    public void echarGasolina(int cantidad) {
        if (!this.estaArrancado) {
            gasolina += cantidad;
            if (gasolina > 50) {
                gasolina = 50; // Limitamos la cantidad de gasolina a 50.
            }
        } else {
            System.out.println("Apaga el coche antes de echar gasolina.");
        }
    }
    public boolean chequear() {
        return gasolina > 0;
    }

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El coche ha sido pintado de color " + nuevoColor);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", anchura=" + anchura +
                ", altura=" + altura +
                ", numeroPuertas=" + numPuertas +
                ", numeroRuedas=" + NUMRUEDAS +
                ", gasolina=" + gasolina +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isEstaArrancado() {
        return estaArrancado;
    }

    public void setEstaArrancado(boolean estaArrancado) {
        this.estaArrancado = estaArrancado;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    
    
}