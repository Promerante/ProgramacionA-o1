package benitez_noguera_facundo_daniel.Ejercicio1;


public class Marketing extends Asignatura implements EsTeorica{

    public Marketing(int codigo, String[] temario, double[] notas) {
        super(codigo, temario, notas);
    }
    public void presentarInformacion(){
        String texto="Estas es la informacion actual:\nCodigo:"+codigo+"Temario:";
        for(int b=0;b<temario.length;b++){
            texto+=temario[b]+".\n";
        }
        texto+="--------------------------------\n";//Es para separar de forma simple la informacion;
        for(int a=0;a<notas.length;a++){
            texto+=notas[a]+".\n";
        }
        System.out.println(texto);
    }/*Hehcho el contructor que hereda de asignatura,ahora con esto al ser teorica presentara la informacion que tenga,en este simple caso temario y notas
    OJO:pueden estar vinculadas, pero creo que ese no es el punto del ejercicio.Ademas supongo que el profesor o alumno(clientes) usaran bien los metodos
    */
    

}
