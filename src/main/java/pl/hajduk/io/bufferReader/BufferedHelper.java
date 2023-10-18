package pl.hajduk.io.bufferReader;

import java.io.*;

public class BufferedHelper {

    public void runTask() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        bufferedWriter.write("zapis do pliku\n");
        bufferedWriter.write("zapis\n");
        bufferedWriter.write("do\n");
        bufferedWriter.write("pliku\n");

        bufferedWriter.close();


    }

    public void changeLine(String lineToChange, String newLine) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("outputAfterChange.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            if (lineToChange.equals(line)) {
                out.write(newLine);
            } else {
                out.write(line);
            }
                out.write("\n");
        }

        in.close();
        out.close();
    }
}
