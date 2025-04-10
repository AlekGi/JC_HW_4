package org.homework;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

public class Employer extends Person {
    private String position;
    private double salary;


    public Employer(String name, String surname, LocalDate birthday, Gender gender, String position, double salary) {
        super(name, surname, birthday, gender);
        this.position = position;
        this.salary = salary;
    }
}
