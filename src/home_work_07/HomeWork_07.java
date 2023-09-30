package home_work_07;

import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {
        System.out.println("Task 0 =======================");
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число на выбор: 1, 2 или 3.");
        number = scanner.nextInt();
        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода

        if (number == 1 | number == 2 | number == 3) {
            System.out.println("Поздравляем!!! Вы ввели число: " + number);
        } else {
            System.out.println("Введенное число: " + number + " не отвечает условию!");
        }

        System.out.println("\nTask 1 =======================");
        int var1 = 43;
        int var2 = 56;
        int var3 = 56;
        int var4 = 20;
        // Равные числа - программа определят как найбольшее, но возвращает второе по списку
        // Можно использовать >=.
        System.out.println("Эти 4 переменные содержат случайные числа от 0 до 100:\n" +
                "var1 = " + var1 + ";\nvar2 = " + var2 + ";\nvar3 = " + var3 + ";\nvar4 = " + var4 + ";");

        if (var1 > var2 && var1 > var3 && var1 > var4) {
            System.out.println("Максимальное число: var1 = " + var1 + ";");
        } else if (var2 > var3 && var2 > var4) {
            System.out.println("Максимальное число: var2 = " + var2 + ";");
        } else if (var3 > var4) {
            System.out.println("Максимальное число: var3 = " + var3 + ";");
        } else {
            System.out.println("Максимальное число: var4 = " + var4 + ";");
        }

        System.out.println("\nTask 2 =======================");
        String string2;
        System.out.println("Введите четырехзначное число:");

        string2 = scanner.nextLine();

        // думаю нужно использовать метод parseInt() из класса Integer:
        int num = Integer.parseInt(string2);
        int num1 = num / 1000;
        int num2 = num / 100 % 10;
        int num3 = num / 10 % 10;
        int num4 = num % 10;

        if (string2.length() != 4) {
            System.out.println("Вы ввели некорректные число.");
        } else if ((num1 + num2) == (num3 + num4)) {
            System.out.println(" - число " + num + " -> (" + num1 + " + " + num2 + ") = " + (num1 + num2) + "; " +
                                                       "(" + num3 + " + " + num4 + ") = " + (num3 + num4) + "; " +
                                                        (num1 + num2) + " равно " + (num3 + num4) + " - число счастливое!");
        } else {
            System.out.println(" - число " + num + " -> (" + num1 + " + " + num2 + ") = " + (num1 + num2) + "; " +
                    "(" + num3 + " + " + num4 + ") = " + (num3 + num4) + "; " +
                    (num1 + num2) + " не равно " + (num3 + num4) + " - число НЕ является счастливым!");
        }

    }
}
