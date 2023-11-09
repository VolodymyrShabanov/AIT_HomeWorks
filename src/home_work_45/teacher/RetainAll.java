package home_work_45.teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_HomeWorks
 */
public class RetainAll {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banane", "Lemon");// создание immutable коллекции
        System.out.println(strings);
        String str1 = strings.get(0);
        System.out.println(str1);
        // strings.add("Orange");

        List<Integer> integers1 = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5));// создание изменяемой коллекции
        List<Integer> integers2 = new LinkedList<>(List.of(3, 4, 5, 5, 5, 6, 7, 8));

        System.out.println("integers1 -> integers2: " + intersection(integers1, integers2));
        System.out.println("integers2 -> integers1: " + intersection(integers2, integers1));

        List<String> strings1 = new ArrayList<>(List.of("H", "e", "l", "l", "o", "u", "j", "a", "v", "a"));
        List<String> strings2 = new LinkedList<>(List.of("L", "o", "n", "g", "e", "d", "a", "y"));

        System.out.println(intersection(strings1, strings2));
        System.out.println(intersection(strings2, strings1));

    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }

}
