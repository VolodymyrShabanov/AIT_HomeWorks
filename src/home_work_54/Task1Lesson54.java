package home_work_54;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1Lesson54 {
    /*  Из списка целых чисел выделите те значения, которые больше 10;
        отсортируйте эти значения по значению последней цифры в числе
        и выведите результат на экране
    * */

    public static void main(String[] args) {
        List<Integer> integers = List.of(123, 44, 2, 6, 32, 48, 77, 151, 9, 11, 0, 89);

        List<Integer> result = integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparingInt(i -> i % 10))
//                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
//                .sorted((i1, i2) -> i1 % 10 - i2 % 10)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
