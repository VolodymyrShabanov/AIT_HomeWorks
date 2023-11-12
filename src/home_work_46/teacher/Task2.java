package home_work_46.teacher;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
            Set<T> result = new HashSet<>(set1);
            result.addAll(set2);
        return result;
    }
    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

}
