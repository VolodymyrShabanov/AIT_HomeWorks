package home_work_53.my;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2 {
    /*  Дан список Person с полями name, age, city.
        Используйте Stream API для фильтрации людей,
        которые старше определенного возраста
        и проживают в определенном городе,
        а затем соберите их в список.
     */

    public static void main(String[] args) {
        List<Person> persons = List.of(
        new Person("Alice", 25, "New York"),
        new Person("Bob", 30, "London"),
        new Person("Charlie", 22, "Paris"),
        new Person("David", 28, "Tokyo"),
        new Person("Emily", 35, "New York"),
        new Person("Frank", 27, "London"),
        new Person("Grace", 32, "Paris"),
        new Person("Henry", 24, "Tokyo"),
        new Person("Ivy", 29, "New York"),
        new Person("Jack", 26, "London"),
        new Person("Kelly", 33, "Paris"),
        new Person("Liam", 23, "Tokyo"),
        new Person("Mia", 31, "New York"),
        new Person("Noah", 28, "London"),
        new Person("Olivia", 34, "Paris"),
        new Person("Owen", 25, "Tokyo"),
        new Person("Piper", 30, "New York"),
        new Person("Quinn", 29, "London"),
        new Person("Ryan", 31, "Paris"),
        new Person("Sophie", 27, "Tokyo")
        );

        Stream<Person> result = persons.stream()
                .filter(person -> person.getAge() > 32)
                .filter(person -> person.getCity().equals("Paris"));


        System.out.println(result.collect(Collectors.toList()));

    }
}
