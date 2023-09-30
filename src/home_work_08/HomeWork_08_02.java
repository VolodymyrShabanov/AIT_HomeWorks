package home_work_08;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_08_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 0 =======================");

        System.out.println("Введите число на выбор: 1, 2 или 3.");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Поздравляем!!! Вы ввели число: " + number);
                break;
            default:
                System.out.println("Введенное число: " + number + " не отвечает условию!");
                break;
        }

        System.out.println("\nTask 1 =======================");

        System.out.println("Введите число от 1 до 7.");
        int dayWeek = scanner.nextInt();

        String dayName;
        switch (dayWeek) {
            case 1:
                dayName = ("Понедельник");
                break;
            case 2:
                dayName = ("Вторник");
                break;
            case 3:
                dayName = ("Среда");
                break;
            case 4:
                dayName = ("Четверг");
                break;
            case 5:
                dayName = ("Пятница");
                break;
            case 6:
            case 7:
                dayName = ("Выходной");
                break;
            default:
                dayName = ("Введенное число " + dayWeek + " не отвечает условию!");
                break;
        }
        System.out.println(dayName);

        System.out.println("\nTask 2 =======================");
        Random random = new Random();

        int grade;
        int timeRemainder;
        int timeMax;
        int timeToday;


        grade = random.nextInt(13);
        System.out.println("Ребенок получил оценку: " + grade);

        timeRemainder = 45;
        timeMax = 60;

        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println("Мы очень рады!!!");
                timeToday = timeRemainder + 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Ты молодец.");
                timeToday = timeRemainder + 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Ну ок.");
                timeToday = timeRemainder + 15;
                break;
            case 3:
                System.out.println("Мы огорчены :(.");
                timeToday = timeRemainder - 30;
                break;
            default:
                System.out.println("Это трагедия, ты наказан.");
                timeToday = 0;
                break;

        }

        if (timeToday > timeMax) {
            timeToday = timeMax;
        } else if (timeToday < 0){ // Это в том случае если в изначальных условиях - оставшееся время (timeRemainder) задать меньше 30
                                  // и ребенок получит оценку 3, то время на сегодня (timeToday) примет отрицательное значение.
            timeToday = 0;
        }

        System.out.println("Ты можешь смотреть ТВ: " + timeToday + " мин.");
    }
}
