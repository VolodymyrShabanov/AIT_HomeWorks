package home_work_04_practice;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork_04_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите ваше имя:");
        String myName = scanner.nextLine();

        System.out.println("Введите вашу фамилию:");
        String mySurname = scanner.nextLine();

        System.out.println("Введите ваш город:");
        String myCity = scanner.nextLine();

        System.out.println("Введите ваш возраст:");
        int myAge = scanner.nextInt();

        System.out.println("Введите ваш рост (в метрах):");
        double myHeight = scanner.nextDouble();

        String message = "Меня зовут " + myName + mySurname +
                         ", мне " + myAge + " год, я из " +
                         myCity + ", мой рост - " + myHeight;

        System.out.println(message);

        // Vladymyr
        // Shabanov
        // Heilbronn
        // 41
        // 1.72
    }
}
