package home_work_23_practice;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Volodymyr Sh on 17.12.2023
 * project name: AIT_HomeWorks
 */
public class SortArrays {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(sortArray(array)));

    }

    public static int[] sortArray(int[] array) {
        if (array == null) {return null;}

        if (array.length == 1) {return array;}

        if (array.length == 2) {return mergeArray(new int[]{array[0]}, new int[]{array[1]});}

        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, arrayLeft.length);

        int[] arrayRight = new int[array.length - array.length / 2];
        System.arraycopy(array, arrayLeft.length, arrayRight, 0, arrayRight.length);

        arrayLeft = sortArray(arrayLeft);
        arrayRight = sortArray(arrayRight);

        return mergeArray(arrayLeft, arrayRight);

    }

    private static int[] mergeArray(int[] arrayLeft, int[] arrayRight) {
        int[] result = new int[arrayLeft.length + arrayRight.length];
        int count = 0, indexLeft = 0, indexRight = 0;

        while (indexLeft < arrayLeft.length && indexRight < arrayRight.length) {
            result[count++] = (arrayLeft[indexLeft] > arrayRight[indexRight]) ? arrayRight[indexRight++]: arrayLeft[indexLeft++];
        }

        while (indexLeft < arrayLeft.length) {
            result[count++] = arrayLeft[indexLeft++];
        }

        while (indexRight < arrayRight.length) {
            result[count++] = arrayRight[indexRight++];
        }

        return result;
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }



}
