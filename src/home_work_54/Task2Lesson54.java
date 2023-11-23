package home_work_54;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2Lesson54 {
    /*  Разбейте строку на слова, используя в качестве разделителя пробел.
        Используя функцию reduce верните суммарное количество букв в словах,
        которые длиннее 4 символов.
    * */

    public static void main(String[] args) {

        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);

        System.out.println("countLetters: " + countLetters);
    }

    private static int countLetters(String text) {
//        List<String> words = List.of(text.split("[,\\s]+"));
//        System.out.println(words);
//
//        String result = words.stream()
//                .filter(string -> string.length() > 4)
//                .reduce("", ((string, string2) -> string + string2));
//
//        System.out.println(result);

        int count = Stream.of(text.split("[,\\s]+"))
                .filter(string -> string.length() > 4)
                .map(String::length)
                .reduce(0, (str1, str2) -> str1 + str2);

        return count;
    }
}
