package home_work_53;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1 {
    /*  Дан список строк. Используя Stream API,
        отфильтруйте строки, которые начинаются на определенную букву (например, "A"),
        удалите дубликаты и
        отсортируйте их в алфавитном порядке.
    */
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Ant", "Adventure", "Arrow", "Awesome",
                "Banana", "Book", "Candle", "Awesome", "Cat", "Elephant", "Frog", "Guitar",
                "Adventure", "Happy", "Ice Cream", "Journey");

        Stream<String> result = strings.stream()
                .filter(string -> string.toLowerCase().charAt(0) == 'a')
                .distinct()
//                .sorted(Comparator.reverseOrder())
                .sorted(String::compareTo);

        System.out.println(result.collect(Collectors.toList()));


    }
}
