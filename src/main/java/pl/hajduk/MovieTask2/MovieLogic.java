package pl.hajduk.MovieTask2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieLogic implements MovieRepo {
    private static List<Movie> movies;

    static {
        movies = getMovies();
    }

    private static List<Movie> getMovies() {
        return Arrays.asList(
                Movie.builder()
                        .duration(60)
                        .releaseDate(LocalDate.of(2010, 1, 22))
                        .type("horror")
                        .title("10 min film")
                        .build(),
                Movie.builder()
                        .duration(120)
                        .releaseDate(LocalDate.of(1990, 12, 31))
                        .title("example film")
                        .build(),
                Movie.builder()
                        .duration(60)
                        .releaseDate(LocalDate.of(2012, 2, 3))
                        .title("example film 2012")
                        .type("action")
                        .build(),
                Movie.builder()
                        .duration(20)
                        .releaseDate(LocalDate.of(1990, 8, 15))
                        .title("20 min film")
                        .type("comedy")
                        .build()
        );
    }

    @Override
    public Optional<List<Movie>> findByLength(int length) {

        return Optional.of(movies.stream().filter(movie -> movie.getDuration() > length).collect(Collectors.toList()));
    }

    @Override
    public Optional<List<Movie>> findByReleaseDate(LocalDate localDate) {


        return Optional.of(movies.stream()
                .filter(movie -> movie.getReleaseDate().isBefore(localDate)).collect(Collectors.toList())
        );
    }

    @Override
    public Optional<List<Movie>> findByType(String type) {


        return Optional.of(movies.stream().filter(movie -> type.equalsIgnoreCase(movie.getType())).toList());

    }

    @Override
    public Optional<List<Movie>> findWithAllRequirements() {


        return Optional.of(movies.stream()
                .filter(movie -> movie.getDuration() > 20)
                .filter(movie -> movie.getReleaseDate().getYear() <= 2018)
                .filter(movie -> "Horror".equalsIgnoreCase(movie.getType()))
                .collect(Collectors.toList()));
    }


}
