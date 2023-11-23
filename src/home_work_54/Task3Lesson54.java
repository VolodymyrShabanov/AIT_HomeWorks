package home_work_54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_HomeWorks
 */
public class Task3Lesson54 {


    public static void main(String[] args) {
        /*  Task1 from Lesson 52
        Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
        Используйте Stream API для фильтрации списка чисел,
        где числа должны быть:
        - четными;
        - больше 10;
        - меньше 100
        */

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i, random.nextInt(201));
        }
        System.out.println(integers);

        System.out.println(filterList(integers));

        /* Task2 from Lesson 52
        Создайте цепочку функций, которая:
        - сначала удаляет пробелы из строки;
        - затем преобразует её в верхний регистр;
        - и в конце считает количество символов в измененной строке
        */


        String stringStart = "Hello, wor ld!";
        Integer result = Stream.of(stringStart)
                .map(string -> string.replaceAll("[,\\s+]", ""))
                .map(String::toUpperCase)
                .mapToInt(String::length)
                .sum();
        System.out.println("Task2 result: " + result);

    }

    private static List<Integer> filterList(List<Integer> integers) {
        return integers.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer > 10)
                .filter(integer -> integer <100)
                .collect(Collectors.toList());
    }



}
