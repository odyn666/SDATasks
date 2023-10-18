package pl.hajduk.MovieTask2;



import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        MovieRepo movieRepo=new MovieLogic();

        movieRepo.findByLength(20).ifPresent(System.out::println);
        System.out.println("************************");
        movieRepo.findByType("horror").ifPresent(System.out::println);
        System.out.println("************************");
        movieRepo.findByReleaseDate(LocalDate.of(2018, Month.AUGUST,1)).ifPresent(System.out::println);
        System.out.println("************************");
        movieRepo.findWithAllRequirements().ifPresent(System.out::println);

    }


}
