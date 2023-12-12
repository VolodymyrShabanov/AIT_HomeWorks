package home_work_63;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Volodymyr Sh on 12.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork63 {

    public static void main(String[] args) {
        /*  Task 1:
            Напишите регулярное выражение для поиска всех почтовых индексов, состоящих из пяти цифр.

            Пример строки: "Мой индекс 12345, а его индекс 67890. А число 456789 не подходит"
            Ожидаемый результат: "12345", "67890"
        */

        Matcher matcherT1 = Pattern.compile("\\b\\d{5}\\b")
                .matcher("Мой индекс 12345, а его индекс 67890. А число 456789 не подходит");
        printResultMatcher("Task 1", matcherT1);

        /*  Task 2:
            Найти все слова, начинающиеся с "re".

            Пример строки: "I need to rewrite and reread these reports."
            Ожидаемый результат: "rewrite", "reread", "reports"
        */

        Matcher matcherT2 = Pattern.compile("\\bre[a-zA-Z]+")
                .matcher("I need to rewrite and reread these reports.");
        printResultMatcher("Task 2", matcherT2);

        /*  Task 3:
            Найти все номера телефонов в формате "+XXX-XXX-XXXX".

            Пример строки: "Мои номера: +123-456-7890, +987-654-3210."
            Ожидаемый результат: "+123-456-7890", "+987-654-3210"
        */

        Matcher matcherT3 = Pattern.compile("\\+\\d{3}-\\d{3}-\\d{4}")
                .matcher("Мои номера: +123-456-7890, +987-654-3210.");
        printResultMatcher("Task 3", matcherT3);

        /*  Task 4:
            Опционально
            Найти все email-адреса.

            Пример строки: "Мои контакты: email@example.com, test.email@domain.ru."
            Ожидаемый результат: "email@example.com", "test.email@domain.ru"

            «username@hostname».
            1) Имя пользователя может в себе содержать:
                - латиницу
                - цифры
                - знаки! # $ % & ‘ * + — / =? ^ _ ` { | } ~
                - точку, за исключением первого и последнего знака, которая не может повторятся

            2) Имя хоста состоит из нескольких компонентов, разделённых точкой и не превышающих 63 символа,
            и суффиксов (домены первого уровня).
            Компоненты, в свою очередь, состоят из латинских букв, цифр и дефисов,
            причём дефисы не могут быть в начале или в конце компонента.
            Суффиксы это ограниченный список доменов первого уровня.

        */

        Matcher matcherT4 = Pattern.compile("\\b[^.][a-zA-Z0-9\\Q!#$%&‘*+-/=?^_`{|}~.\\E]+[^.]@[^.-][a-zA-Z0-9\\-.]+[^.-]\\b")
                .matcher("Мои контакты: ema..il@exam-ple.com, test.ema!#$%&‘*+-/=?^_`{|}~il@domain.ru");
        printResultMatcher("Task 4", matcherT4);

    }

    public static void printResultMatcher(String task, Matcher matcher){
        StringBuilder sb = new StringBuilder(task).append(": ");
        while (matcher.find()){
            sb.append(matcher.group()).append(", ");
        }
        System.out.println(sb);
    }
}
