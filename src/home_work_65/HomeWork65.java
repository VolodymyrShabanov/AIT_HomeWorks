package home_work_65;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Volodymyr Sh on 14.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork65 {
    public static void main(String[] args) {
        /*  Task 1: Найти все вхождения слова "apple", не следующего за словом "green".

            Пример строки: "red apple, green apple, just an apple"
            Ожидаемый результат: "apple", "apple"
        */

        Matcher matcherT1 = Pattern.compile("(?<!green )apple")
                .matcher("red apple, green apple, just an apple");
        printResultMatcher("Task1", matcherT1);

        /*  Task 2: Найти слова, которые начинаются непосредственно после цифры.

            Пример строки: "3a, 4b, 5cat, d6, e7, f8"
            Ожидаемый результат: "a", "b", "cat"
        */

        Matcher matcherT2 = Pattern.compile("(?<=\\d)\\p{LC}+")
                .matcher("3a, 4b, 5cat, d6, e7, f8, 12робот");
        printResultMatcher("Task2", matcherT2);

        /*  Task 3: Найти все имена пользователей, у которых домен в email-адресе "@example.com".

            Пример строки: "contact@example.com, user@test.com, admin@example.com"
            Ожидаемый результат: "contact", "admin"
        */

        Matcher matcherT3 = Pattern.compile("\\b.[^ ]*(?=@example.com)")
                .matcher("contact@example.com, user@test.com, admin@example.com");
        printResultMatcher("Task3", matcherT3);


        /*  Task 4: Найти все слова, заключённого между двумя словами 'start' и 'end'.

            Пример строки: "start middle end, beginning center finish"
            Ожидаемый результат: "middle"
        */

        Matcher matcherT4 = Pattern.compile("(?<=start )\\w+(?= end)", Pattern.CASE_INSENSITIVE)
                .matcher("start middle end, beginning center finish. Start race End.");
        printResultMatcher("Task4", matcherT4);

    }

    public static void printResultMatcher(String string, Matcher matcher) {

        StringBuilder sb = new StringBuilder("===========").append(string).append("==========\n");
        while (matcher.find()) {
            sb.append("start index: ").append(matcher.start()).append(" -> ").append(matcher.group()).append(";\n");
        }
        System.out.println(sb);
    }
}
