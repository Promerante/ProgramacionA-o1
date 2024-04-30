package manejoficheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscadorPalabras {
    public static void main(String[] args) {
        String fileName = "archivo.txt";
        String wordToFind = "buscar";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(wordToFind)) {
                    int index = line.indexOf(wordToFind);
                    System.out.println("Palabra encontrada en la línea " + lineNumber + ", posición " + index);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
