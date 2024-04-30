package benitez_noguera_facundo_daniel.Ejercicio1;


public class Taller extends Asignatura implements EsPractica{//YA TIENE LA INTERFAZ ES EVALUABLE HEREDADA POR ASIGNATURA
    String[] practica;
    boolean[] practicaRealizada;

    public Taller(String[] practica, boolean[] practicaRealizada, int codigo, String[] temario, double[] notas) {
        super(codigo, temario, notas);
        this.practica = practica;
        this.practicaRealizada = practicaRealizada;
    }//Creamos un constructor taller que sera como asignutara pero ademas tendra practicas
    
    public void realizarPractica(){
        System.out.println("Diga el numero de la practica que ha realizado");
        int numPractica=sc.nextInt();//Notese como hicimos el Scanner en el padre no tenemos que crear mas y ahorramos tiempo y recurso
        practicaRealizada[numPractica-1]=true;//Otra vez ponemos el -1 para mejorar la experiencia
    }
    public void mostrarinfo(){
        String texto="Estas es la informacion actual:\nCodigo:"+codigo+"Temario:";
        for(int b=0;b<temario.length;b++){
            texto+=temario[b]+".\n";
        }
        texto+="--------------------------------\n";//Es para separar de forma simple la informacion;
        for(int a=0;a<notas.length;a++){
            texto+=notas[a]+".\n";
        }
        texto+="--------------------------------\nEstas son las practicas del taller.\n";
        for(int c=0;c<practica.length;c++){
            texto+=practica[c]+".\n";
        }
        texto+="--------------------------------\n";
        for(int d=0;d<practicaRealizada.length;d++){
            if(practicaRealizada[d])
            texto+="Realizada\n";
            else if(!practicaRealizada[d]){
                texto+="No Realizada";
                }
            }
        
        System.out.println(texto);
    }
    
           

}
