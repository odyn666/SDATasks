package pl.hajduk.footballerTask.model;

import lombok.Builder;
import lombok.Value;
import pl.hajduk.footballerTask.enums.Country;
import pl.hajduk.footballerTask.enums.MarketStatus;

import java.util.List;

@Value
@Builder
public class Footballer {
    private String firstName;
    private String lastName;
    private Integer birthYear;
    private Country nationality;
    private MarketStatus marketStatus;
    private Address address;
    private List<Club> previousClubs;
}
