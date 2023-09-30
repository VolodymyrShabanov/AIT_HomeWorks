package home_work_08;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_08 {
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
        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода

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
                dayName = ("Суббота");
                break;
            case 7:
                dayName = ("Воскресенье");
                break;
            default:
                dayName = ("Введенное число " + dayWeek + " не отвечает условию!");
                break;
        }
        System.out.println(dayName);

        System.out.println("\nTask 2 =======================");
        Random random = new Random();

        // Бесконечный цикл
        while (true) {
            int grade;
            int timeRemainder;
            int timeToday;
            int timeMax;

            // автоматический (рандомный) ввод данных

//            grade = random.nextInt(13);
//            System.out.println("Ребенок получил оценку: " + grade);
//            timeRemainder = random.nextInt(61);
//            System.out.println("Оставшееся время с вчера: " + timeRemainder + " мин.");


            // ручной ввод данных

            System.out.println("Введите оценку которую получил ребенок (от 0 до 12): ");
            grade = scanner.nextInt();

            System.out.println("Введите оставшееся время (в минутах): ");
            timeRemainder = scanner.nextInt();
            scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода


            switch (grade) {
                case 12:
                case 11:
                case 10:
                    System.out.println("Добавляем к оставшемуся времени 60 минут. \n(но общее время - не более 1-го часа!)");
                    timeToday = 60;
                    System.out.println("Мы очень рады!!! Сегодня можно посмотреть ТВ: " + timeToday + " мин.");
                    break;
                case 9:
                case 8:
                case 7:
                    System.out.println("Добавляем к оставшемуся времени 45 минут. \n(но общее время - не более 1-го часа!)");
                    timeMax = 15 / timeRemainder;
                    switch (timeMax) {
                        case 0:
                            timeToday = 60;
                            break;
                        default:
                            timeToday = timeRemainder + 45;
                            break;
                    }
                    System.out.println("Ты молодец. Можно смотреть ТВ: " + timeToday + " мин.");
                    break;
                case 6:
                case 5:
                case 4:
                    System.out.println("Добавляем к оставшемуся времени 15 минут. \n(но общее время - не более 1-го часа!)");
                    timeMax = 45 / timeRemainder;
                    switch (timeMax) {
                        case 0:
                            timeToday = 60;
                            break;
                        default:
                            timeToday = timeRemainder + 15;
                            break;
                    }
                    System.out.println("Ну ок. Можешь глянуть ТВ: " + timeToday + " мин.");
                    break;
                case 3:
                    System.out.println("Уменьшаем оставшееся время на 30 минут. \n(но общее время - не менее 0!)");
                    timeMax = 30 / (60 - timeRemainder);
                    switch (timeMax) {
                        case 0:
                            timeToday = 0;
                            break;
                        default:
                            timeToday = timeRemainder - 30;
                            break;
                    }
                    System.out.println("Мы огорчены :(. Поэтому смотреть ТВ можешь не более чем: " + timeToday + " мин.");
                    break;
                default:
                    System.out.println("Обнуляем оставшееся время!");
                    timeToday = 0;
                    System.out.println("Это трагедия. Ты наказан и смотреть ТВ не можешь, так как у тебя теперь: " + timeToday + " мин.");

            }

            System.out.println("\nХотите заверить тест с оценками - введите \"Y\". \nХотите продолжить - введите любой символ!");
            String antwort = scanner.nextLine();

            switch (antwort.charAt(0)) {
                case 89:
                    System.out.println("Тестирование завершено.");
                    System.exit(0);
                default:
            }

        }

    }
}


