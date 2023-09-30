package home_work_05;

public class HomeWork_05 {
    public static void main(String[] args) {
        System.out.println("Task 01");
        String myName = "Vladymyr";

        // Используя scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите Ваше имя:");
//        myName = scanner.nextLine();


        System.out.println("В моем имени " + myName.length() + " букв.");
        char letterFirst = myName.charAt(0);
        char letterLasst = myName.charAt(myName.length() - 1);

        int letterFirstAsii = letterFirst;
        int letterLasstAsii = letterLasst;

        System.out.println("1-й вариант) Десятичный код: \n - первого символа моего имени: "
                            + letterFirstAsii + "\n - последнего символа моего имени: " + letterLasstAsii);

        // 2-й способ преобразовать char в число - преобразование типа в int на прямую
        System.out.println("2-й вариант) Десятичный код: \n - первого символа моего имени: "
                + (int) letterFirst + "\n - последнего символа моего имени: " + (int) letterLasst);

        System.out.println("\nTask 02");

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String concatStr1 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println("Результат конкатенации методом join: " + concatStr1);
        System.out.println("Длина строки concatStr1: " + concatStr1.length());

        String concatStr2 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Результат конкатенации с использованием знака '+': " + concatStr2);
        System.out.println("Длина строки concatStr2: " + concatStr2.length());

        System.out.println("\nTask 02.2");

        String concatStr3 = concatStr1.replace("powerful", "super");
        System.out.println("Замена в строке слова 'powerful' на 'super'. Новая строка: " + concatStr3);
        boolean strContains =  concatStr1.contains("age");
        System.out.println("Содержит ли строка подстроку 'age'?: " + strContains);

        System.out.println("\nTask 03");

        String [] words = {"string", "code", "Practice"};

        for (int i = 0; i < words.length; i++) {
            int lenMiddle = words[i].length() / 2;
            String letters = words[i].substring(lenMiddle - 1, lenMiddle + 1);
            System.out.println("Срока '" + words[i] + "' содержит два средних символа: " + letters);
        }

    }
}


