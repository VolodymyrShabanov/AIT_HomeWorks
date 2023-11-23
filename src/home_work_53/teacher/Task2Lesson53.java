package home_work_53.teacher;

import home_work_53.my.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2Lesson53 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Person1", 21, "Berlin"),
                new Person("Person2", 19, "Paris"),
                new Person("Person3", 25, "London"),
                new Person("Person4", 32, "Berlin")
        ));

        List<Person> personList = people.stream()
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println(personList);

    }
}
