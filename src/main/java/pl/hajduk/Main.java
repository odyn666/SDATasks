package pl.hajduk;

import pl.hajduk.circle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        double area = circle.calculateArea();
        double obw = circle.calculateCircumference();

        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Pole koła: " + area);
        System.out.println("Obwód okręgu: " + obw);
    }
}