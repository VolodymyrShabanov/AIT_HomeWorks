package home_work_12;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_12_2 {
    public static void main(String[] args) {
        System.out.println("\nTask2 ====================================");

        Random random = new Random();
        int[] array2 = new int[50];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(array2));

//        // это мои мысли!!!
//        array2 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        boolean number = false;
//
//        for (int n : array2) {
////
////        1. Берем число n из массива
////        2. вычисляем квадратный корень числа n.
//            int sqrt = (int) Math.sqrt(n);
////        3. Проверяем делится ли число нацело в интервале от 2 до корень из n
//            for (int i = 2; i <= sqrt; i++) {
//                if (n % i == 0) {
////        если да то возвращаем true
//                    number = true;
//                    break;
//                }
//
//            }
//            if (number != true) {
//                System.out.println(n);
//            }
//        }


        int counterSimple = 0;

        for (int i = 0; i < array2.length; i++) {
            // 13 -> 1, 13 -> простое число;

            boolean isSimple = true;

            if (array2[i] == 1) {
                isSimple = false;
                continue;
            }

            if (array2[i] % 2 == 0 && array2[i] != 2 || array2[i] % 3 == 0 && array2[i] != 3) {
                isSimple = false;
                continue;
            }


            for (int j = 5; j <= Math.sqrt(array2[i]); j += 6) { // 2 ... n-1

                if (array2[i] % j == 0 || array2[i] % (j + 2) == 0) {
                    isSimple = false;
                    break;
                }

            }

            if (isSimple) {
                System.out.print(array2[i] + ", ");
                counterSimple++;
            }
        }

        System.out.println("Простых чисел в массиве: " + counterSimple);


    } // main

}

