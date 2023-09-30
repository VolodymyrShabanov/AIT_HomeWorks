package home_work_16;


import java.util.Arrays;

public class HomeWork_16 {
    public static void main(String[] args) {

//        System.out.println("Task 0=========================");
//        String string = "My name is Java!";
//        System.out.println("New string: " + toUpperCase(string));
//
//        System.out.println("\nTask 1_1=========================");
//        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
//        int index1 = 8;
//        int index2 = 6;
//        System.out.println(Arrays.toString(swap(numbers, index1, index2)));
//
//        System.out.println("\nTask 1_2=========================");
//        String[] strings = {"start", null, "string", "sonny", "the end"};
//        int index3 = 1;
//        int index4 = 5;
//        System.out.println(Arrays.toString(swap(strings, index3, index4)));

        System.out.println("\nTask 2=========================");
        String string1 = "0123456789";
        System.out.println("New string: " + subString(string1, 9, 10));


    } // main

    public static String toUpperCase(String string) {

        if (string == null) return string;

        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 32);
            }
        }

        return new String(charArray);
    }

    public static void swap(int[] array, int index1, int index2) {

        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) return; //  array;

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        //return array;

    }

    public static void swap(String[] array, int index1, int index2) {

        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) return; //array;

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        //return array;

    }


    public static String subString(String string, int begin, int end) {
        if (string == null) return "";

        if (begin < 0 || end < 0 || begin > string.length() || end > string.length()) return "";

//        if (end > string.length()) end = string.length();

        char[] charArray = string.toCharArray();
        char[] stringNew = new char[end - begin];
        int counter = 0;

        for (int i = begin; i < end; i++) {
            stringNew[counter++] = charArray[i];
        }
        return new String(stringNew);

    }

}
