package org.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Congratulations {
//    private static final LocalDate testdate = LocalDate.now();
    private static final LocalDate testdate = LocalDate.of(2025,3,8);

    public static String congratulationPersons(List <Person> persons) {
        List<Person> congratBirthDates = new ArrayList<>();
        List<Person> congratNewYear = new ArrayList<>();
        List<Person> congrat23Feb = new ArrayList<>();
        List<Person> congrat8Mar = new ArrayList<>();
        for (Person person : persons) {
            if (person.getBirthday().getMonthValue() == testdate.getMonthValue()
                    && person.getBirthday().getDayOfMonth() == testdate.getDayOfMonth()){
                congratBirthDates.add(person);
            }if (testdate.getMonthValue() == Holidays.NEW_YEAR.getMonth()
                    && testdate.getDayOfMonth() == Holidays.NEW_YEAR.getDay()){
                congratNewYear.add(person);
            }if (testdate.getMonthValue() == Holidays.TWENTY_THREE_FEBRUARY.getMonth()
                    && testdate.getDayOfMonth() == Holidays.TWENTY_THREE_FEBRUARY.getDay()
                    && person.getGender() == Gender.MALE){
                congrat23Feb.add(person);
            }if (testdate.getMonthValue() == Holidays.EIGHT_MARCH.getMonth()
                    && testdate.getDayOfMonth() == Holidays.EIGHT_MARCH.getDay()
                    && person.getGender() == Gender.FEMALE){
                congrat8Mar.add(person);
            }
        }
        if (!congratBirthDates.isEmpty()){
            congratulate(congratBirthDates, " С Днем рождения!");
        }if (!congratNewYear.isEmpty()){
            congratulate(congratNewYear, " С Новым Годом!");
        }if (!congrat23Feb.isEmpty()){
            congratulate(congrat23Feb, " С Днем Защитника Отечества!");
        }if (!congrat8Mar.isEmpty()){
            congratulate(congrat8Mar, " С 8 Марта!");
        }else{
            System.out.println("Сегодня не праздничный день");
        }
        return "";
    }

    public static void congratulate(List<Person> persons, String message) {
        for (Person person : persons) {
            System.out.println(String.format("Поздравляем " + person.getName() + " " + person.getSurname() + message));
        }
    }
}
