package home_work_10;

import java.util.Scanner;

public class HomeWork_10 {
    public static void main(String[] args) {
        System.out.println("Task 0=======================");
        int str = 1;

        while (str <= 10) {
            System.out.println("Task" + str + "; ");
            str++;
        }

        System.out.println("\nTask 1=======================");
        int number = 1;
        // оптимизировали цыкл а именно в условии If добавили шаг + 5,
        // т.е. цикл перебирает меньше значение и работает быстре.

        do {
            if (number % 5 == 0) {
                System.out.print(number + "; ");
                number += 5;    // если нам известен шаг и мы определили первое число
                                // то иммет смысл к переменной добавить шаг что бы перебирать меньше значений
            } else {
                number++;   // что бы не получилось 5+5+1=11 т.е. пропуск числа 10 - мы выносим шаг в условие else
                            // т.е. счетчик number++; отработает до значения 5, а далее будем считать с шагом 5, number+=5;
            }
        } while (number <= 100);


        System.out.println("\n\nTask 2=======================");
        int number1 = 1;
        int count = 0;

        while (number1 <= 100 && count < 7) { // true && true
            if (number1 % 5 == 0) {
                System.out.print(number1 + "; ");
                count++;
            }
            number1++;
        }
        // Этот вывод для наглядности, при каких значениях переменных цикл while прекращает работу
        System.out.println("\nПосле цикла: number1 = " + number1 + "; count = " + count);

        System.out.println("\nTask 3=======================");
        Scanner scanner = new Scanner (System.in);
        String string;
        int count1 = 0;
        do {
            count1 ++;
            System.out.println("Введите слово: \"hello\"");
            string = scanner.nextLine().trim();
            // trim() - убирает пробелы спереди и сзади.
            // toLowerCase() - приводит весь текст к нижнему регистру.
        } while (!string.equalsIgnoreCase("hello"));
            // equalsIgnoreCase() - Сравнивает данную строку с другой строкой, игнорируя регистр.
        System.out.println("Спасибо! Вы ввели слово \"hello\"\nВам понадобилось: " + count1 + " попыток!");

        System.out.println("\nTask 4======================= Работаем со строкой это если входит не только числа а и символы");
        System.out.println("Введите произвольное число:");
        String stringNum = scanner.nextLine();
        int i = 0;
        int summ = 0;

        while (i < stringNum.length()) {
            int number2 = stringNum.charAt(i) - 48;
                if(number2 >= 0 && number2 <= 9) {
                    summ += number2;
                }
            i++;
        }

        System.out.println("Сумма цифр введенного числа: " + stringNum + " равна: " + summ);

        System.out.println("\nTask 4_2======================= Работаем с числом");
        System.out.println("Введите произвольное число.");
        int stringNum2 = scanner.nextInt();
        int summ2 = 0;

        while (stringNum2 > 0) {
            summ2 += stringNum2 % 10;
            stringNum2 /= 10;
        }

        System.out.println("Сумма цифр введенного числа равна: " + summ2);


        System.out.println("\nTask 4_3======================= Работаем с числом и учитываем что число может быть отрицательное");
        System.out.println("Введите произвольное число:");
        int stringNum3 = scanner.nextInt();
        int summ3 = 0;

        if (stringNum3 < 0)  stringNum3 *= -1;

        while (stringNum3 > 0) {
            int digit = stringNum3 % 10;
            System.out.print(digit + ((stringNum3 > 10) ? " + " : " = "));  // используем тернарный оператор который
                                                                            // говорит что если stringNum3 > 10 то ставь + иначе ставь =
            summ3 += stringNum3 % 10;
            stringNum3 /= 10;
        }
        System.out.println(summ3);

        System.out.println("Сумма цифр введенного числа равна: " + summ3);
    }
}
