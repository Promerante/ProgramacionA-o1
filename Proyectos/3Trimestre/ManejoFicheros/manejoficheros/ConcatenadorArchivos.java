package manejoficheros;

import java.io.*;

public class ConcatenadorArchivos {
    public static void main(String[] args) {
        String[] fileNames = {"archivo1.txt", "archivo2.txt", "archivo3.txt"};
        String outputFileName = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String fileName : fileNames) {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
