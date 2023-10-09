package home_work_22;

import java.util.Random;

public class ArraysUtil {
    public static int linerSearch(int[] array, int value) { // поиск (по значению) перебором всего массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searchValue) { // бинарный поиск
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                return middleIndex;
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }


    public static void sortArray(int[] array) { // сортировка выбором ч.1 из 2-х
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = minIndexSearch(array, i);
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    private static int minIndexSearch(int[] array, int startIndex) { // сортировка выбором ч.2 из 2-х
        int min = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int [] array){ // сортировка выбором (полный метод)

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1 ; j < array.length; j++) {
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

    public static int[] initTestArray(int size) { // инициализация массива рандомными значениями (от - 1000 до 1000)
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(2001) - 1000;
        }
        return result;
    }



    public static String printArray(int[] array) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append((i < array.length - 1) ? ", " : "]");
        }
        return sb.toString();
    }
}
