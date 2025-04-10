package org.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;
}
