package home_work_13;


import java.util.Random;

public class HomeWork_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);

        System.out.println("\nTask 0.1 - массив в обратном порядке: =========================");
        printReversedArray(array);

        System.out.println("\nTask 0.2 -(method overloading) часть массива (начиная с индекса) в обратном порядке: =========================");
        int index = 5;
        System.out.println("index: " + index);
        printReversedArray(array, index);

        System.out.println("\nTask 0.3 - (method overloading) флаг == true -> массив в обратном порядке, флаг == false -> массив в прямом порядке: =========================");
        boolean isFlag = random.nextBoolean();
        System.out.println("isFlag: " + isFlag);
        printReversedArray(array, isFlag);

        System.out.println("\nTask 1 - 2 в степени n: =========================");
        int degree = 10;
        calculateDegree(degree);

        System.out.println("\nTask 2 - copyOfArray =========================");
        int lengthArrayCopy = 15;
        copyOfArray(array, lengthArrayCopy);

        System.out.println("\nTask 3 - searchElement =========================");
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892, 910, 931};
        int position = 7;
        searchElement(array1, array2, position);

    } // main end position

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }

    public static void printReversedArray(int[] array) {

        int lastIndexArray = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[lastIndexArray - i];
            array[lastIndexArray - i] = temp;
        }

        printArray(array);
    }

    public static void printReversedArray(int[] array, int index) {
        int lastIndexArray = array.length + index - 1;
        // TODO - Подумать, нужна ли здесь проверка на длину массива.
        //  По сути программа работает без проверки - просто не переворачивает если индекс за пределами массива.
        for (int i = index; i < (array.length + index) / 2; i++) {
            int temp = array[i];
            array[i] = array[lastIndexArray - i];
            array[lastIndexArray - i] = temp;
        }

        printArray(array);
    }

    public static void printReversedArray(int[] array, boolean isFlag) {
        // Тут я не знаю как правильно оформить.
        // или скопировать предыдущий метод или его вызвать
        if (isFlag) {
            printReversedArray(array);
        } else {
            printArray(array);
        }
    }

    public static void calculateDegree(int degree) {
        int basis = 2;
        for (int i = 1; i < degree; i++) {
            basis *= 2;
        }
        System.out.println("2 в степени " + degree + ": " + basis);
    }

    public static void copyOfArray(int[] array, int lengthArrayCopy) {
        int[] arrayCopy = new int[lengthArrayCopy];
        for (int i = 0; i < lengthArrayCopy && i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        printArray(arrayCopy);
    }
    public static void searchElement(int[] array2, int[] array1, int position) {

        int[] concatenatedArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < concatenatedArray.length; k++) {

//            Тут соединяю оба массива в один. Далее его можно отсортировать и взять нужный элемент.
//            if (i < array1.length) {
//                concatenatedArray[k] = array1[i];
//                i ++;
//            } else if (j < array2.length){
//                concatenatedArray[k] = array2[j];
//                j++;
//            }

//          Тут не могу додумать как закончить
//          т.е. итоговый массив строится пока цикл не дойдет до конца меньшего из составных массивов,
//          а дальше зацикливается потому счетчики останавливаются.

            if (array1[i] > array2[j]) { // i == 4; j == 6;
                concatenatedArray[k] = array2[j];
                if (j != array2.length - 1) j++;

            } else {
                concatenatedArray[k] = array1[i];
                if (i != array1.length - 1) i++;
            }
        }
        printArray(concatenatedArray);
        System.out.println("не 7-й позиции находится: " + concatenatedArray[position]);
    }

}


// applyBubbleSort(array);

//    private static void applyBubbleSort(int[] array) {
//        for (int j = 0; j < array.length - 1; j++) {
//            int indexMax = j;
//            for (int i = j; i < array.length; i++) {
//                if (array[i] > array[indexMax]) {
//                    indexMax = i;
//                }
//            }
//            int temp = array[j];
//            array[j] = array[indexMax];
//            array[indexMax] = temp;
//        }
//
//        System.out.println(Arrays.toString(array));
//
//
//    }
