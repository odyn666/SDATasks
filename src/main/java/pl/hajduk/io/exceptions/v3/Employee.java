package pl.hajduk.io.exceptions.v3;

import lombok.*;

@Getter
@Setter
@ToString
public class Employee {
    private String firstName;

    private String lastName;
    private int age;
    private String sex;
}
