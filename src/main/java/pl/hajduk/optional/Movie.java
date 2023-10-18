package pl.hajduk.optional;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Movie {

    String title;
    String type;
    List<String> actors;
}
