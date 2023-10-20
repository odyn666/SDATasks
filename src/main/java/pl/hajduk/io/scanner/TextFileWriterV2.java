package pl.hajduk.io.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriterV2 {
    public static void main(String[] args) throws IOException {
        String input;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("wpisz nazwę pliku: ");
            input = sc.nextLine();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(input))) {
                System.out.println("wpisz  tekst do zapisania do pliku");
                input = sc.nextLine();

                bw.write(input);
                bw.append(input);
            }
//        System.out.println("tekst został zapisany do pliku "+input);
        }
    }
}
