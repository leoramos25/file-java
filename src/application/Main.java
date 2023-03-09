package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATH = "/home/leonardords/temp/in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
