package com.mycompany.facundobenitezt3p1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
      

public class Ejercicio4 {
    public static void main(String[] args) {
        String fileName = "archivo.txt";
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Número total de palabras: " + wordCount);
    }
}
  
    


