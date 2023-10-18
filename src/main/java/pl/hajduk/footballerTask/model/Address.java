package pl.hajduk.footballerTask.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.hajduk.footballerTask.enums.Country;

@Builder
@ToString
public class Address {
    private String street;
    @Getter
    private String city;
    private String zipCode;
    private Country country;

}
