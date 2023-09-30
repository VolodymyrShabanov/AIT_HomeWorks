package home_work_12;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_12 {
    public static void main(String[] args) {
        System.out.println("Task0 ====================================");
        Random random = new Random();
//        int[] array1 = new int[20];
//
//        int count = 0;
//        int summ = 0;
//
//        System.out.print("[");
//        for (int i = 0; i < array1.length; i++) {
//            // array1[i] = random.nextInt(); // - очень большие числа (результат не очень читабельный)
//            array1[i] = random.nextInt(201) - 100;
//            System.out.print(array1[i] + ((i < array1.length - 1) ? ", " : "]\n"));
//            if (array1[i] % 2 == 0) {
//                count++;
//                summ += array1[i];
//            }
//        }
//
//        System.out.println("Количество четных чисел в массиве: " + count);
//        System.out.println("Сумма четных чисел массива: " + summ);
//
//        System.out.println("\nTask1 ====================================");
//
//        Scanner scanner = new Scanner(System.in);
//
//        float percents = 7.0f;
//        System.out.println("За каждый месяц банк начисляет к сумме вклада: " + percents + "% (сложный процент) от суммы.");
//
//        System.out.println("Введите сумму вклада:");
//        float deposit = scanner.nextFloat();
//
//        System.out.println("Введите срок вклада в месяцах:");
//        int months = scanner.nextInt();
//
//        for (int i = 1; i <= months; i++) {
//            deposit += deposit * percents / 100;
//            System.out.printf("После %d месяца сума вклада составит: %.2f\n", i, deposit);
//        }

        System.out.println("\nTask2 ====================================");

        int[] array2 = new int[50];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(array2));

        int counterSimple = 0;

        for (int i = 0; i < array2.length; i++) {
            // 13 -> 1, 13 -> простое число;

            boolean isSimple = true;

            if (array2[i] == 1) {
                isSimple = false;
            }

            for (int j = 2; j < array2[i]; j++) { // 2 ... n-1

                if (array2[i] % j == 0) {
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

//        System.out.println("\nTask3 ====================================");
//        int caunt = 6;
//        for (int l = 1; l <= caunt; l++) {
//            for (int j = 1; j <= l; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

// Решето Эратосфена - алгоритм, предложенный древнегреческим математиком Эратосфеном.
    }
}
