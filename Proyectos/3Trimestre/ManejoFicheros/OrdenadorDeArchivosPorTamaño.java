package manejoficheros;
import java.io.File;

import java.io.File;

public class OrdenadorDeArchivosPorTamaño {

    public static void main(String[] args) {
        // Ruta del directorio a analizar
        String directorio = "ruta/a/tu/directorio";
        
        // Crear un objeto File para representar el directorio
        File carpeta = new File(directorio);
        
        // Verificar si la ruta es un directorio válido
        if (!carpeta.isDirectory()) {
            System.out.println("La ruta especificada no es un directorio válido.");
            return;
        }
        
        // Obtener la lista de archivos del directorio
        File[] archivos = carpeta.listFiles();
        
        // Ordenar la lista de archivos por tamaño usando bubble sort
        bubbleSort(archivos);
        
        // Mostrar los archivos ordenados por tamaño
        for (int i = 0; i < archivos.length; i++) {
            long tamanoEnBytes = archivos[i].length();
            String nombreArchivo = archivos[i].getName();
            System.out.println("Nombre: " + nombreArchivo + ", Tamaño: " + tamanoEnBytes + " bytes (" +
                    convertirTamaño(tamanoEnBytes) + ")");
        }
    }
    
    // Método para ordenar los archivos por tamaño usando bubble sort
    private static void bubbleSort(File[] archivos) {
        int n = archivos.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                if (archivos[i].length() > archivos[i + 1].length()) {
                    File temp = archivos[i];
                    archivos[i] = archivos[i + 1];
                    archivos[i + 1] = temp;
                    intercambiado = true;
                }
            }
            n--;
        } while (intercambiado);
    }
    
    // Método para convertir el tamaño de bytes a KB o MB
    private static String convertirTamaño(long bytes) {
        final long KILOBYTE = 1024;
        final long MEGABYTE = KILOBYTE * 1024;
        
        if (bytes < KILOBYTE) {
            return bytes + " bytes";
        } else if (bytes < MEGABYTE) {
            return String.format("%.2f", bytes / (double)KILOBYTE) + " KB";
        } else {
            return String.format("%.2f", bytes / (double)MEGABYTE) + " MB";
        }
    }
}
