package home_work_06;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;

        System.out.println("Task 00");

        System.out.println("Введите целое число:");
        var = scanner.nextInt();

        boolean even = (var != 0) & (var % 2 == 0) ;
        boolean multiple = (var != 0) & (var % 3 == 0);
        boolean evenAndMultiple = even & multiple;
        System.out.println( "Число: " + var +
                            " четное: " + even +
                            "; кратно 3: " + multiple +
                            "; четное и кратное 3: " + evenAndMultiple + ";");

        System.out.println("\nTask 01");
        // Построчно сократить логическое выражения (соблюдая приоритетность операций)

        /* Приоритет логических операций.
                1. !
                2. &
                3. ^
                4. |
                5. &&
                6. ||
        */

        System.out.println( "(true | false) | (45 < 70) & !(true) ^ (6 == 5) -> " +
                            ((true | false) | (45 < 70) & !(true) ^ (6 == 5)));
        System.out.println("1) выполняем то что в скобках: -> " +
                            ((true)         | (true)    & !(true) ^ (false)));
        System.out.println("2) выполняем !: -> " +
                            ((true)         | (true)    &  false  ^ (false)));
        System.out.println("3) выполняем &: -> " +
                            ((true)         | (       false     ) ^ (false)));
        System.out.println("4) выполняем ^: -> " +
                            ((true)         | (                  false    )));
        System.out.println("4) выполняем |: -> " +
                            ((true)));

    }
}
