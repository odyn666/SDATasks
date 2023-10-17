package pl.hajduk.lambdaCalculator;

public class Main {
    public static void main(String[] args) {
        Service<Integer> service = new Service<>();

        service.process(3, 6, (x, y) -> (x * y));
        service.process(3, 6, (x, y) -> (x / y));
        service.process(3, 6, (x, y) -> (x - y));
        service.process(3, 6, (x, y) -> (x + y));
    }
}
