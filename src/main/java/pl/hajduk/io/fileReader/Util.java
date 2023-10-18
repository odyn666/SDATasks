package pl.hajduk.io.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

    public  void run() throws IOException {
        FileReader fileReader=new FileReader("test.txt");
        FileWriter fileWriter=new FileWriter("test_kopia.txt");

        int nextChar;
        while ((nextChar=fileReader.read())!=-1)
        {
            fileWriter.append((char)nextChar);
        }
        fileReader.close();
        fileWriter.close();

    }



}
