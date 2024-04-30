package manejoficheros;

import java.io.File;
import java.util.Scanner;

public class RenombradorDeArchivosPorExtension {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la extensión original y la nueva extensión
        System.out.print("Ingrese la extensión original (sin el punto): ");
        String extensionOriginal = scanner.nextLine();
        System.out.print("Ingrese la nueva extensión (sin el punto): ");
        String nuevaExtension = scanner.nextLine();

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

        // Renombrar los archivos con la extensión especificada
        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i].isFile() && archivos[i].getName().endsWith("." + extensionOriginal)) {
                String nombreArchivo = archivos[i].getName();
                String nuevoNombre = nombreArchivo.substring(0, nombreArchivo.lastIndexOf('.')) + "." + nuevaExtension;
                File nuevoArchivo = new File(carpeta.getPath() + File.separator + nuevoNombre);
                if (archivos[i].renameTo(nuevoArchivo)) {
                    System.out.println("El archivo " + nombreArchivo + " ha sido renombrado a " + nuevoNombre);
                } else {
                    System.out.println("No se pudo renombrar el archivo " + nombreArchivo);
                }
            }
        }
    }
}
