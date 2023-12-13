package home_work_64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Volodymyr Sh on 13.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork64 {
    public static void main(String[] args) {
        /*  Task 1:
            Напишите регулярное выражение для извлечения имени пользователя и домена из email-адресов.
            Пример строки: "Контакт: email@example.com"
            Ожидаемый результат: "Имя пользователя: email, Домен: example.com"
        */

        Matcher matcher = Pattern.compile("(\\w.*)@(.*)\\W")
                .matcher("Контакт: email@example.com sdf");
        while (matcher.find()) {
            System.out.printf("Имя пользователя: %s, Домен: %s\n", matcher.group(1), matcher.group(2));
        }



        /*  Task 2:
            Найти первое слово в кавычках в строке.
            Пример строки: "Она сказала: 'быстро', а потом добавила: 'осторожно'."
            Ожидаемый результат: "быстро"
        */

        System.out.println("\n=================================");

        Matcher matcher1 = Pattern.compile("'.*?'")
                .matcher("Она сказала: 'быстро', а потом добавила: 'осторожно'.");
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }


        /*  Task 3:
            Написать регулярное выражение для извлечения текста из определенного HTML-тега (например, <p>).
            Пример строки:
            "<p>Это пример текста.</p> <p>Это другой текст.</p>"
            Ожидаемый результат: "Это пример текста.", "Это другой текст."
        */

        System.out.println("\n=================================");

        Matcher matcher2 = Pattern.compile("<([a-z][a-z0-9]*)>([^<]*)(</\\1>)")
                .matcher("<p>Это пример текста.</p> <p>Это другой текст.</p>");
        while(matcher2.find()){
            System.out.println(matcher2.group(2));
        }


        /*  Task 4:
            Написать регулярное выражение для замены формата даты с "ДД-ММ-ГГГГ" на "ММ/ДД/ГГГГ".
            Пример строки: "Дата: 15-03-2023"
            Ожидаемый результат: "Дата: 03/15/2023"
        */

        System.out.println("\n=================================");

        Matcher matcher3 = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})")
                .matcher("Дата: 15-03-2023");

        System.out.println(matcher3.replaceAll("$2/$1/$3"));

    }

}
