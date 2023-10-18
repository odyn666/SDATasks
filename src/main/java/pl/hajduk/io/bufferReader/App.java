package pl.hajduk.io.bufferReader;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedHelper bufferedHelper=new BufferedHelper();
        bufferedHelper.runTask();
        bufferedHelper.changeLine("do","za");
    }
}
