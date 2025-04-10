package org.homework;


import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Customer extends Person {
    private String phoneNumber;


    public Customer(String name, String surname, LocalDate birthday, Gender gender, String phoneNumber) {
        super(name, surname, birthday, gender);
        this.phoneNumber = phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

}
