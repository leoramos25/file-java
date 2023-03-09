package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATH = "/home/leonardords/temp/out.txt";
        String[] lines = new String[]{"Leonardo", "Joelma", "Matheus", "Geraldo", "Eduarda", "Juliana", "Thalita"};

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
