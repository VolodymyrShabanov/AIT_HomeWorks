package home_work_46;

import java.util.*;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_HomeWorks
 */
public class AppSetTask1 {

    public static void main(String[] args) {

        String testString = "Тестовая; <..''\'\' строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));

    }

    public static List<String> getUniqueSortedWords(String string) {
        Set<String> result = new TreeSet<>((word1, word2) -> Integer.compare(word1.length(), word2.length()));
        int s = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isAlphabetic(string.charAt(i)) && s != i) {
                result.add(string.substring(s, i));
                s = i;
            }
            if (!Character.isAlphabetic(string.charAt(s))) {
                s++;
            }
        }
        return new ArrayList<>(result);
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set <String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set <String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set <String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }


    public static char getFirstUniqueChar(String string) {
        Set <Character> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.charAt(i));
        }
        // TODO - Написать метод, возвращающий первый неповторяющийся символ в строке
        return '?';
    }

}
