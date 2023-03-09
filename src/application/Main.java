package application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a fila path: ");
        String filePath = scanner.nextLine();

        File path = new File(filePath);

        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());
        System.out.println("getName: " + path.getPath());

        scanner.close();
    }
}
