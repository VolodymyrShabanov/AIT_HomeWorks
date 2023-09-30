package home_work_15;

import java.util.Arrays;

public class HomeWork_15 {
    public static void main(String[] args) {
        System.out.println("Task 0=========================");

        int number = 7;
        System.out.println(checkIsNumberPrime(number));

        System.out.println("\nTask 1=========================");
        int[] arrayNumbers = {1, 45, 3, 13, 76, 54, 90, 435, 0, 45};
        System.out.println(countNumbersPrime(arrayNumbers));

        System.out.println("\nTask 3=========================");
        String[] strings;
        strings = new String[]{"monday", "two", "three", "four", "friday"};
        printArray(getArrayShortestAndLongestStrings(strings));

        System.out.println("\nTask 4=========================");
        int[] arrayNumbers2 = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5};
        printArray(getArrayNumbersPrime(arrayNumbers2));

        System.out.println("\nОпционально - перебрать массив и \"обрезать\" лишнее");
        printArray(getArrayNumbersPrimeOptinal(arrayNumbers2));


    } //main end

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }

    public static boolean checkIsNumberPrime(int number) {
//        boolean isNumber = true;
//        if (number <= 0 || number == 1) {
//            isNumber = false;
//        } else if (number % 2 == 0 && number != 2 || number % 3 == 0 && number != 3) {
//            isNumber = false;
//        } else {
//            for (int i = 5; i <= Math.sqrt(number); i += 6) {
//                if (number % i == 0 || number % (i + 2) == 0) {
//                    isNumber = false;
//                    break;
//                }
//            }
//        }

//         решение Teacher - оптимизированный код
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countNumbersPrime(int[] arrayNumbers) {
        int counter = 0;

        for (int number : arrayNumbers) {
            if (checkIsNumberPrime(number))
                counter++;
        }

        return counter;
    }

    public static String[] getArrayShortestAndLongestStrings(String[] arrayStrings) {
        //

        String[] strShortestAndLongest = new String[2];
        String min = arrayStrings[0];
        String max = arrayStrings[0];

        for (int i = 0; i < arrayStrings.length; i++) {
            if (min.length() > arrayStrings[i].length()) {
                min = arrayStrings[i];
            }
            // в данном случа if нужно разделять на два отдельных
            // так как входящий массив может быть из одного элемента
            // и тогда программа запишет результат в обе ячейки
            // используя else if - мы получим только значение первой ячейки - во второй будет "null"
            if (max.length() < arrayStrings[i].length()) {
                max = arrayStrings[i];
            }
        }

        strShortestAndLongest[0] = min;
        strShortestAndLongest[1] = max;

        return strShortestAndLongest;

    }

    public static int[] getArrayNumbersPrime(int[] arrayNumbers) {
        int[] arrayNumbersPrime = new int[countNumbersPrime(arrayNumbers)];
        int i = 0;

        for (int number : arrayNumbers) {
            if (checkIsNumberPrime(number)) {
                arrayNumbersPrime[i] = number;
                i++;
            }
        }
        return arrayNumbersPrime;
    }

    public static int[] getArrayNumbersPrimeOptinal(int[] arrayNumbers) {
        int [] result = new int [arrayNumbers.length];
        int counter = 0;

        for (int value : arrayNumbers) {
            if (checkIsNumberPrime(value)) {
                result[counter] = value;
                counter++;
            }
        }

        result = Arrays.copyOf(result, counter);

        return result;
    }


}
