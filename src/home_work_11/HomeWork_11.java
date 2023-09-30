package home_work_11;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_11 {
    public static void main(String[] args) {

        System.out.println("Task 0 ============================");

        Random random = new Random();

        //int lengthArray = random.nextInt(21);
        int[] array1 = new int[random.nextInt(21)]; // задаем длину массива
        int bound = 100;
        int i = 0;


        // наполняем случайными значениями массив (и печатаем для наглядности)
        System.out.print("[");
        while (i < array1.length) {
            array1[i] = random.nextInt(bound * 2 +1) - bound; //   Запись в скобках: (0 ... 200) - 100 -> (-100 ... 100)
            System.out.print(array1[i] + ((i < array1.length - 1) ? ", " : "]"));
            i++;
        }

        System.out.println();

        // анализируем значения массива
        int j = 0;
        int min = array1[0];
        int max = array1[0];
        double sum = 0;

        while (j < array1.length) {
            if (min > array1[j]) {
                min = array1[j];    // минимальное
            } else if (max < array1[j]) {
                max = array1[j];    // максимальное
            }
            sum += array1[j];       // сумма всех значений
            j++;
        }

        System.out.println("Минимальное значение, хранящееся в массиве: " + min);
        System.out.println("Максимальное значение, хранящееся в массиве: " + max);
        System.out.printf("Среднее арифметическое всех значений, хранящихся в массиве: %.2f", (sum / array1.length));
        System.out.println();

        System.out.println("\nTask 1 ============================");

        int[] array2 = {5, 6, -25, 0, 31, -15};
        System.out.println("Первоначальный массив: " + Arrays.toString(array2));

        int l = 0;
        int mini = array2[0];
        int miniIndex = 0;
        int maxi = array2[0];
        int maxiIndex = 0;

        // анализируем значения массива
        while (l < array2.length) {
            if (mini > array2[l]) {
                mini = array2[l];   // минимальное
                miniIndex = l;      // индекс минимального значения
            } else if (maxi < array2[l]) {
                maxi = array2[l];   // максимальное
                maxiIndex = l;      // индекс максимального значения
            }
            l++;
        }
//        // присваиваем новые значения элементам массива
//        array2[miniIndex] = maxi;
//        array2[maxiIndex] = mini;
//

        // лучше делать так - поменять местами элементы имея на руках ТОЛЬКО индексы.
        int temp = array2[miniIndex];
                   array2[miniIndex] = array2[maxiIndex];
                                       array2[maxiIndex] = temp;


        System.out.println("Массив после изменений: " + Arrays.toString(array2));

        System.out.println("\nTask 2 ============================");
        String[] array3 = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int a = 0;
        String maxis = array3[0];

        while (a < array3.length) {
            if (maxis.length() < array3[a].length()) {
                maxis = array3[a];
            }
            a++;
        }

        System.out.println("Самая длинная строка массива: " + maxis);

        int b = 0;
        System.out.print("[");
        while (b < maxis.length()) {
            System.out.print(maxis.charAt(b) + ((b < maxis.length() - 1) ? ", " : "]"));
            b++;
        }
    }
}
