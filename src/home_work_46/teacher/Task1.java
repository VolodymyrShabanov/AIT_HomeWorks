package home_work_46.teacher;

import java.util.*;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String testString) {
        // 1. Избавиться от всего лишнего
        // 2. Разбить на слова
        // 3. Поместить в коллекцию которая обеспечивает уникальность и сортировку
        // 4. Преобразовать в список и вернуть.

        String[] words = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");
        System.out.println(Arrays.toString(words));
        Set<String> uniqueWords = new TreeSet(Comparator.comparing(String:: length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));
        System.out.println("uniqueWords: " + uniqueWords);

        return new ArrayList<>(uniqueWords);
    }
}
