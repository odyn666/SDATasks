package pl.hajduk.io.fileInputReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Util {
    public void runTask() throws IOException {
        FileInputStream in=new FileInputStream("pies.png");
        FileOutputStream out=new FileOutputStream("pies2.png");
        int c;
        while ((c=in.read())!=-1)
        {
            out.write(c);
        }
        in.close();
        out.close();
    }
}
