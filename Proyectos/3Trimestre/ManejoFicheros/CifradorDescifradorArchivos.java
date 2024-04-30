package manejoficheros;
import java.io.*;
// Cifrado César, el desplazamiento es un parámetro que se elige arbitrariamente y determina cuántas posiciones 
// se desplazarán las letras en el alfabeto. Este valor puede ser cualquier número entero, positivo o negativo, 
// y es elegido por quien cifra el texto.
public class CifradorDescifradorArchivos {

    // Método para cifrar un texto usando el cifrado César
    private static String cifrarCesar(String texto, int desplazamiento) {
        char[] textoCifrado = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                textoCifrado[i] = (char) (((caracter - base + desplazamiento) % 26) + base);
            } else {
                textoCifrado[i] = caracter;
            }
        }
        return new String(textoCifrado);
    }

    // Método para descifrar un texto cifrado usando el cifrado César
    private static String descifrarCesar(String textoCifrado, int desplazamiento) {
        return cifrarCesar(textoCifrado, 26 - desplazamiento); // Invertir el desplazamiento para descifrar
    }

    // Método para leer el contenido de un archivo de texto
    private static String leerArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }

    // Método para escribir el contenido cifrado en un archivo de texto
    private static void escribirArchivo(String nombreArchivo, String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escritor.write(contenido);
            System.out.println("Archivo creado con éxito: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Archivo de entrada y salida
        String archivoEntrada = "entrada.txt";
        String archivoCifrado = "cifrado.txt";
        String archivoDescifrado = "descifrado.txt";

        // Texto a cifrar y clave de cifrado
        int desplazamiento = 3; // Desplazamiento para el cifrado César

        // Leer el contenido del archivo de entrada
        String textoOriginal = leerArchivo(archivoEntrada);

        // Cifrar el texto
        String textoCifrado = cifrarCesar(textoOriginal, desplazamiento);
        escribirArchivo(archivoCifrado, textoCifrado);

        // Descifrar el texto cifrado
        String textoDescifrado = descifrarCesar(textoCifrado, desplazamiento);
        escribirArchivo(archivoDescifrado, textoDescifrado);
    }
}
