package pl.hajduk.io.exceptions.v2;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        try {
            test1.run();
        }
        catch (IOException e)
        {
            System.out.println("metoda testowa run w catchu");
        }
    }
}
