package pl.hajduk.MovieTask2;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

import java.time.LocalDate;

@Builder
@Getter
@ToString
public class Movie {

    String title;
    String type;
    long duration;//min
    LocalDate releaseDate;
}
