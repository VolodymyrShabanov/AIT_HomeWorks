package home_work_46.teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_HomeWorks
 */
public class Task3 {
    public static void main(String[] args) {
        String string = "aaac bbcb cdefj  bb,cdf,";
        System.out.println("getFirstUniqueChar: " + getFirstUniqueChar(string));
        System.out.println("=====================================");
        System.out.println("getFirstUniqueChar2: " + getFirstUniqueChar2(string));
        System.out.println("=====================================");
        System.out.println("getFirstUniqueChar3: " + getFirstUniqueChar3(string));
        System.out.println("=====================================");
        System.out.println("getFirstUniqueChar4: " + getFirstUniqueChar4(string));
        System.out.println("=====================================");
    }

    private static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (char ch : string.toCharArray()) {

            if (repeatedChars.contains(ch)){
                continue;
            }

            if(uniqueChars.contains(ch)){
                uniqueChars.remove(ch);
                repeatedChars.add(ch);
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println(uniqueChars);
        System.out.println(repeatedChars);
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();
    }

    private static Character getFirstUniqueChar2(String string) {
        // с одним сетом работает не корректно
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : string.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                uniqueChars.remove(ch);
            }
        }
        System.out.println(uniqueChars);

        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

//        return new ArrayList<>(uniqueChars).get(0);
    }

    private static Character getFirstUniqueChar3(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> allChars = new HashSet<>();

        for (char ch : string.toCharArray()) {
            if (!uniqueChars.add(ch) || !allChars.add(ch)) {
                uniqueChars.remove(ch);
            }
        }

        System.out.println(uniqueChars);
        System.out.println(allChars);
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();
    }

    private static Character getFirstUniqueChar4(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : string.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                uniqueChars.remove(ch);
                uniqueChars.add(ch);
            }
        }

        System.out.println(uniqueChars);
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();
    }

}
