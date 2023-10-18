package pl.hajduk.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class optionalExample {
    public static void main(String[] args) {
        Movie movie=null;
        Movie movie2=new Movie("shawshang redepmtion","dramat",Arrays.asList("ten co ucieka","i ten drugi"));


        printMovieDetails(movie);
    }

    private static void printMovieDetails(Movie movie)
    {
        Optional<Movie>movieOptional=Optional.ofNullable(movie);
        movieOptional.ifPresent(value -> System.out.println(value.getTitle()));

        List<String> actors = movieOptional.map(m -> m.getActors()).orElse(Collections.singletonList("fake actor"));
        System.out.println(actors);

        List<String> actorsGet = movieOptional.map(m -> m.getActors()).orElseGet(()->Collections.singletonList("fake actor"));
        System.out.println(actorsGet);

        List<String> actorsThrow = movieOptional.map(m -> m.getActors()).orElseThrow(()->new RuntimeException("fake film"));
        System.out.println(actorsThrow);

    }
}
