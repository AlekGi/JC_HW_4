package org.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.homework.Congratulations.congratulationPersons;

@Data
@AllArgsConstructor
public class Main {
    public static void main(String[] args) {

        Employer employer1 = new Employer("Дмитрий", "Донской",
                LocalDate.of(1990,6, 30), Gender.MALE, "Продавец", 35000 );
        Employer employer2 = new Employer("Иван", "Крякин",
                LocalDate.of(1980,5, 25), Gender.MALE, "Директор", 120000 );
        Employer employer3 = new Employer("Дарья", "Иванина",
                LocalDate.of(1994,3, 8), Gender.FEMALE, "Продавец", 35000 );
        Employer employer4 = new Employer("Инна", "Сорокина",
                LocalDate.of(1991,11, 4), Gender.FEMALE, "Бухгалтер", 40000 );
        Customer customer1 = new Customer("Илья", "Васин",
                LocalDate.of(2005,5, 6), Gender.MALE, "79511231212");
        Customer customer2 = new Customer("Максим", "Дудя",
                LocalDate.of(2004,10, 17), Gender.MALE, "79511321212");
        Customer customer3 = new Customer("Светлана", "Ляхина",
                LocalDate.of(2001,12, 12), Gender.FEMALE, "79517771212");
        Customer customer4 = new Customer("Ирина", "Ерошина",
                LocalDate.of(2002,1, 1), Gender.FEMALE, "79577771212");

        List<Person> personList = new ArrayList<>();
        personList.add(employer1);
        personList.add(employer2);
        personList.add(employer3);
        personList.add(employer4);
        personList.add(customer1);
        personList.add(customer2);
        personList.add(customer3);
        personList.add(customer4);

        // В классе Congratulations присутствует тестовая дата, реальная закомментирована,
        // для тестирования правильности вывода поздравления с праздниками
        congratulationPersons(personList);
    }
}