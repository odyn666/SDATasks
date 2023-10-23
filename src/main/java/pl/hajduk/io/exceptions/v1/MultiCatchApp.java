package pl.hajduk.io.exceptions.v1;

public class MultiCatchApp {
    public static void main(String[] args) {
        try {

            int[] numbers = new int[4];
            int result = 10 / 0;
            numbers[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wyjątek ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (java.lang.ArithmeticException ex) {
            System.out.println("wyjątek ArithmeticException: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("nieznany wyjątek");
        }
    }
}
