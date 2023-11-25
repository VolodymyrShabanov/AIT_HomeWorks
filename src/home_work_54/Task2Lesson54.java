package home_work_54;

import java.util.Arrays;
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
        int countLetters = countLettersTeacher1(text);
        System.out.println("countLettersTeacher: " + countLetters);

        countLetters = countLettersMy(text);
        System.out.println("countLettersMy: " + countLetters);
    }

    private static int countLettersMy(String text) {
        // my realisation
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

    private static int countLettersTeacher1(String text) {
        // teacher = Option 1
        String[] words = text.split("\\s+");

        long count = Arrays.stream(words)
                .filter(word -> word.length() > 4)
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i)
                .filter(Character::isAlphabetic)
                .count();


        return (int) count;
    }

    private static int countLettersTeacher2(String text) {
        // teacher = Option 2
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        int count = Arrays.stream(words)
                .map(String::length)
                .filter(i -> i > 4)
                //.reduce(0, (i1, i2) -> i1 + i2)
                .reduce(0, Integer::sum);


        return count;
    }
}
