package manejoficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorCSV {
    public static void main(String[] args) {
        String fileName = "archivo.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                // Si no es el último valor, imprimir un tabulador
                if (i < values.length - 1) {
                    System.out.print("\t");
                }
    }
            System.out.println(); // Salto de línea al final de cada línea del archivo
}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
