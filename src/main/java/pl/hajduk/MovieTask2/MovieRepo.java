package pl.hajduk.MovieTask2;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MovieRepo {

    Optional<List<Movie>> findByLength(int length);
    Optional<List<Movie>> findByReleaseDate(LocalDate localDate);
    Optional<List<Movie>> findByType(String type);

    Optional<List<Movie>> findWithAllRequirements();

}
