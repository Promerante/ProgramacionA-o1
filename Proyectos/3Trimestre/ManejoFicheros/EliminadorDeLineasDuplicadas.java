package manejoficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminadorDeLineasDuplicadas {

    public static void main(String[] args) {
        // Rutas de los archivos de entrada y salida
        String archivoEntrada = "archivo_entrada.txt";
        String archivoSalida = "archivo_salida.txt";

        // Llamar al método para eliminar líneas duplicadas
        eliminarLineasDuplicadas(archivoEntrada, archivoSalida);

        System.out.println("Líneas duplicadas eliminadas con éxito.");
    }

    // Método para eliminar líneas duplicadas de un archivo
    private static void eliminarLineasDuplicadas(String archivoEntrada, String archivoSalida) {
        try {
            // Crear objetos para leer y escribir archivos
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));

            // Leer la primera línea del archivo
            String lineaActual = lector.readLine();

            // Recorrer el archivo y eliminar líneas duplicadas
            while (lineaActual != null) {
                // Verificar si la línea actual no está presente en el archivo de salida
                if (!existeLinea(archivoSalida, lineaActual)) {
                    // Escribir la línea en el archivo de salida
                    escritor.write(lineaActual);
                    escritor.newLine();
                }
                // Leer la próxima línea del archivo de entrada
                lineaActual = lector.readLine();
            }

            // Cerrar los recursos
            lector.close();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para verificar si una línea está presente en un archivo
    private static boolean existeLinea(String archivo, String linea) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String lineaActual = lector.readLine();
        while (lineaActual != null) {
            if (linea.equals(lineaActual)) {
                lector.close();
                return true;
            }
            lineaActual = lector.readLine();
        }
        lector.close();
        return false;
    }
}
