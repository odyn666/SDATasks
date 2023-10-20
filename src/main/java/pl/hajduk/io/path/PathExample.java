package pl.hajduk.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("StarWars.txt");
        Files.createFile(path);
        Files.write(path,"A long time ago in galaxy far, far away..........\n".getBytes(),
                StandardOpenOption.WRITE);
        Files.write(path,"In galaxy far\n".getBytes(),StandardOpenOption.APPEND);
        Files.write(path,"far away\n".getBytes(),StandardOpenOption.APPEND);

        Files.readAllLines(path).forEach(System.out::println);
        Files.deleteIfExists(path);
    }
}
