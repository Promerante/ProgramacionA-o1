package benitez_noguera_facundo_daniel.Ejercicio1;

public class TestMedac {
    public static void main(String[] args) {
        String[] asignaturas={"comercio mundial","publicidad nacional","historia del marketinng"};
        double[] notas={1.1,9.5,5,8,1};
        Marketing Facu=new Marketing(123, asignaturas, notas);
        Facu.asignarCalificacion(3);//Probamos alguno a un 3 
        Facu.presentarInformacion();
        //Ahora probemos taller
        String[] Practicas={"Practicas 1","Practicas 2"};
        boolean[] pracRealizadas={true,false};
        Taller Fran=new Taller(Practicas,pracRealizadas , 44, asignaturas, notas);
        Fran.realizarPractica();
        Fran.mostrarinfo();
        /*Es algo simple y se supone en la buena cooperacion del autor,le invito a probar las distintas funcionalidades pero este
        ejemplo funciona como minimo
        */
                

    }

}
