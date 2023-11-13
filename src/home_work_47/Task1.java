package home_work_47;

import java.util.*;

/**
 * Created by Volodymyr Sh on 13.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    public static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        for (String uniqueWord : uniqueWords) {
            int count = 0;
            for (String word : words) {
                if (uniqueWord.equals(word)) {
                    count++;
                }
            }
            result.put(uniqueWord, count);
        }

        System.out.println(uniqueWords);
        return result;
    }

    public static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> result = new TreeMap<>();
        char[] charArray = text.toCharArray();

        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : charArray) {
            if (uniqueChars.add(ch)) {
            }
        }

        for (Character character : uniqueChars) {
            int count = 0;
            for (char ch : charArray) {
                if (character.equals(ch)) {
                    count++;
                }
            }
            result.put(character, count);
        }

        return result;
    }

}
