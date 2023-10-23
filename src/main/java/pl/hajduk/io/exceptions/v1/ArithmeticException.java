package pl.hajduk.io.exceptions.v1;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int result=10/0;
        }catch (java.lang.ArithmeticException e)
        {
            System.out.println("wyjątek");
        }finally {
            System.out.println("blok finally wykona się zawsze");
        }

        System.out.println("dalsza część");
    }
}
