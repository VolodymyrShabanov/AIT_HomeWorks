package home_work_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Volodymyr Sh on 07.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork62 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();


        /*
        Task 1: Поиск Отдельных Цифр.
        Напишите регулярное выражение, которое находит все отдельные цифры меньше 7 в строке.

        Пример строки: "Моя дата рождения 2.6.1990"
        Ожидаемый результат: "2", "6", "1", "0"
       */

        Pattern pattern = Pattern.compile("[0-6]");
        String task1 = "Моя дата рождения 2.6.1990";
        Matcher matcherT1 = pattern.matcher(task1);


        sb.append("result Task1: ");
        while(matcherT1.find()){
            sb.append(matcherT1.group()).append(", ");
        }

        System.out.println(sb);
        sb.setLength(0);

        /*
        Task 2: Поиск Специальных Символов.
        Напишите регулярное выражение, чтобы найти все вхождения символов @ '&', '!' в строке.

        Пример строки: "myemail@example.co!m another&email@example.com"
        Ожидаемый результат: "@", "!", "&", "@"
        */

        Matcher matcherT2 = Pattern.compile("[@&!]").matcher("myemail@example.co!m another&email@example.com");
        sb.append("result Task2: ");
        while (matcherT2.find()){
            sb.append(matcherT2.group()).append(", ");
        }

        System.out.println(sb);
        sb.setLength(0);

        /*
        Task 3: Поиск Больших Букв.
        Напишите регулярное выражение, чтобы найти все заглавные буквы в строке.

        Пример строки: "London is the capital of Great Britain."
        Ожидаемый результат: "L", "G", "B"
        */

        Matcher matcherT3 = Pattern.compile("[A-Z]").matcher("London is the capital of Great Britain.");
        sb.append("result Task3: ");
        while(matcherT3.find()){
            sb.append(matcherT3.group()).append(", ");
        }

        System.out.println(sb);
        sb.setLength(0);

        /*
        Task 4: Поиск Букв 'b' и 'B'.
        Создайте регулярное выражение для поиска всех вхождений букв 'b' и 'B' в строке.

        Пример строки: "Bears, Bees, and Bunnies are beautiful."
        Ожидаемый результат: "B", "B", "B", "b"
        */

        Matcher matcherT4 = Pattern.compile("[Bb]").matcher("Bears, Bees, and Bunnies are beautiful");
        sb.append("result Task4: ");
        while(matcherT4.find()){
            sb.append(matcherT4.group()).append(", ");
        }

        System.out.println(sb);
        sb.setLength(0);
    }
}
