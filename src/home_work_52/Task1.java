package home_work_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1 {
     /* Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
        Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть:
        - четными;
        - больше 10;
        - меньше 100
     */

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(500) - 250);
        }

        System.out.println(integers);

        Predicate<Integer> numberEven = integer -> integer % 2 == 0;
        Predicate<Integer> numberGreaterTen = integer -> integer > 10;
        Predicate<Integer> numberLessHundred = integer -> integer < 100;
        Predicate<Integer> combinedPredicate;

//        combinedPredicate = numberEven.and(numberGreaterTen).and(numberLessHundred);


//      Реализацию (ниже) подсмотрел, но не могу понять комментарии.

/*      Мы явно указываем тип Predicate<Integer> для первого предиката,
        чтобы избежать создания дополнительных объектов Predicate.
        При такой переписке кода, мы уменьшаем количество создаваемых объектов
        и избегаем излишних проверок, что может улучшить производительность.*/

//        combinedPredicate = ((Predicate<Integer>) integer -> integer % 2 == 0)
//                .and(integer -> integer > 10)
//                .and(integer -> integer < 100);

        combinedPredicate = (integer -> (integer % 2 == 0) && (integer > 10) && (integer < 100));

        System.out.println(filterList(integers, combinedPredicate));

    }

    private static List<Integer> filterList(List<Integer> integers, Predicate<Integer> combiPredicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (combiPredicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }


}
