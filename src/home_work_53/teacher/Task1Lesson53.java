package home_work_53.teacher;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1Lesson53 {
    public static void main(String[] args) {
        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "A");

        List<String> filterString = strings.stream()
                .filter(str -> str.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filterString);



    }
}
