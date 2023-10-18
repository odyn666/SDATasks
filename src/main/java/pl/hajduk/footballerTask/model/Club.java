package pl.hajduk.footballerTask.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.hajduk.footballerTask.enums.Country;

@Builder
@ToString
@Getter
public class Club {
    private Country country;
    private String clubName;
}
