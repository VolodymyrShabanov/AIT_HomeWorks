package home_work_47.teacher;

import java.util.HashMap;
import java.util.Map;

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


//        System.out.println("option2: " + frequencyDictionary2(text));
//        System.out.println("option3: " + frequencyDictionary3(text));
//        System.out.println("option4: " + frequencyDictionary4(text));
//        System.out.println("option5: " + frequencyDictionary5(text));


        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
        System.out.println(frequencyCharsMap);
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : chars) {
            result.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            Integer amount = result.get(word);

            if (amount == null) {
                amount = 0;
            }

            amount = amount + 1;
            result.put(word, amount);
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary2(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            Integer amount = result.getOrDefault(word, 0);
            result.put(word, ++amount);
        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary3(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);

        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary4(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            result.computeIfPresent(word, (k, v) -> v + 1);
            result.computeIfAbsent(word, k -> 1);

        }
        return result;
    }

    private static Map<String, Integer> frequencyDictionary5(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            result.merge(word, 1, (oldValue, value) -> oldValue + value);
        }
        return result;
    }


}
