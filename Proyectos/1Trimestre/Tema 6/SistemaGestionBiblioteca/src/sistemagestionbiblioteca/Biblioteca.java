package sistemagestionbiblioteca;


public class Biblioteca {
    
    private int indice=0;
    private Libro[] libros;
    public Biblioteca(){
        libros=new Libro[10];
    }
    public void agregarLibro(Libro libronuevo){
        libros[indice]=libronuevo;
        indice++;    
    }
    public void mostrarLibros(){
        for(int a=0;a<indice;a++){
            System.out.println(libros[a]);
        }     
    }
    
    


    

}
