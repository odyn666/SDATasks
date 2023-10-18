package pl.hajduk.optional;

import java.util.Optional;

public class FlatMapExample {
    public static void main(String[] args) {
        Optional<String> helloWorldContainer = Optional.of("hello world");
//        Optional<Integer> optionalInteger = helloWorldContainer.flatMap(txt -> Optional.of(txt.length()));
        Optional<Integer> optionalInteger = helloWorldContainer.flatMap(txt -> Optional.empty());
        optionalInteger.ifPresent(x -> System.out.println("długość tekstu"+x));
    }
}
