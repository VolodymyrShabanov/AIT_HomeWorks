package home_work_07;

import java.util.Scanner;

public class HomeWork_07_2 {
    public static void main(String[] args) {
        System.out.println("Tak 00");

        Scanner scanner= new Scanner(System.in);
//        System.out.println("Введите число 1 до 3:");
//        int input = scanner.nextInt();
//        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода
//
//        if (input == 1) {
//            System.out.println("Вы ввели число 1");
//        } else if (input == 2) {
//            System.out.println("Вы ввели число 2");
//        } else if (input == 3) {
//            System.out.println("Вы ввели число 3");
//        } else {
//            System.out.println("Вы ввели не корректное число");
//        }
//
//        System.out.println("Tak 01");
//        Random random = new Random();
//
//        int var1 = random.nextInt(101);
//        int var2 = random.nextInt(101);
//        int var3 = random.nextInt(101);
//        int var4 = random.nextInt(101);
//
//        int max = var1;
//         if (var2 > max) {
//             max = var2;
//         }
//         if (var3 > max) {
//             max = var3;
//         }
//         if (var4 > max) {
//             max = var4;
//         }
//
//        System.out.println("Max: " + max);

        System.out.println("Tak 02");
        System.out.println("Введите четырехзначное число");
        String inputStr = scanner.next();

        if (inputStr.length() != 4) {
            System.out.println("1-й вариант) Ошибка! Число не 4-х значное");
        } else {
            // код символа числа в десятичной системе
            System.out.println("Это код первой цифры числа в десятичной системе: " + (int) inputStr.charAt(0));
            // из кода символа десятичной системы получаем число,
            // а именно: 1 = 49 - 48,
            // где 49 - это код единицы в десятичной системе
            int char1 = (int) inputStr.charAt(0) - 48;
            System.out.println("Это первая цифра числа: " + char1);

            if (inputStr.charAt(0) + inputStr.charAt(1) == inputStr.charAt(2) + inputStr.charAt(3)) {
                System.out.println("1-й вариант) Число счастливое!!");
            } else {
                System.out.println("1-й вариант) Число НЕ является \"счастливым\"");
            }
        }

        if (inputStr.length() != 4) {
            System.out.println("2-й вариант) Ошибка! Число не 4-х значное");
        } else {
            int inputInt = Integer.parseInt(inputStr);
            System.out.println(inputInt);

            // получение цифр числа с права на лево (зеркально)
            // 1234
            int digit0 = inputInt % 10;
            inputInt = inputInt / 10;

            // 123
            int digit1 = inputInt % 10;
            inputInt /= 10;

            // 12
            int digit2 = inputInt % 10;
            //1
            int digit3 = inputInt / 10;

            System.out.println("Числа (зеркально): " + digit0 + " : " + digit1 + " : " + digit2 + " : " + digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("2-й вариант) Число счастливое!!");
            } else {
                System.out.println("2-й вариант) Число НЕ является \"счастливым\"");
           }

        }

        int inputInt = Integer.parseInt(inputStr);
        System.out.println(inputInt);
        // получение цифр числа с лева на право

        // 1234
        int digit0 = inputInt / 1000;
        inputInt %=  1000;

        // 234
        int digit1 = inputInt / 100;
        inputInt %= 100;

        // 34
        int digit2 = inputInt / 10;
        //4
        int digit3 = inputInt % 10;

        System.out.println("Числа: " + digit0 + " : " + digit1 + " : " + digit2 + " : " + digit3);


    }
}





