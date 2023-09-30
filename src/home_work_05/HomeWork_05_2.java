package home_work_05;

public class HomeWork_05_2 {
    public static void main(String[] args) {
        System.out.println("\nTask 03 ");
        /*
        Необходимо распечатать два средних символа строки.
        Например, если дана строка
        "string" - результат будет "ri",
        для строки "code" результат "od",
        для "Practice" результат "ct".
         */

        String str = "string";
        String str1 = "code";
        String str2 = "Practice";

        int middleIndex = str.length() / 2;

        String subStr = str.substring(middleIndex - 1, middleIndex + 1);
        System.out.println(subStr);

    }
}
