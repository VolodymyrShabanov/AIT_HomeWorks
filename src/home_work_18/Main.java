package home_work_18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        RubberArray_my rubArr = new RubberArray_my();
//        rubArr.add(1);
//        rubArr.add(2);
//        rubArr.add(3);
//        rubArr.add(4);
//        rubArr.add(5);
//        rubArr.add(6);
//        rubArr.add(7);
//        System.out.println("rubArr.toString(): " + rubArr.toString());

//        rubArr.add(1, 2, 3, 4, 5);
//        System.out.println("rubArr.toString(): " + rubArr.toString());
//
//        System.out.println("rubArr.numberOf: " + rubArr.numberOf(3));
//
//
        int[] array = {1, 1, 1, 1};
        RubberArray_my rubArr1 = new RubberArray_my(array);
//        System.out.println(("длина массива rubArr1: " + rubArr1.length()));
//        System.out.println("rubAr1.toString(): " + rubArr1.toString());
//
////        rubArr1.add(100);
//        //rubArr1 = new RubberArray_my(array);
//        rubArr1.add(100, 101, 102);
//        System.out.println(".add(): " + rubArr1.toString());
//
//        System.out.println(("длина массива rubArr1: " + rubArr1.length()));
//        System.out.println(".numberOf(): " + rubArr1.numberOf(5));
//
//        rubArr1.changeValueByIndex(1, 29);
//        System.out.println(".changeValueByIndex(): " + rubArr1.toString());
//
//        rubArr1.changeValueByValue(29, 300);
//        System.out.println(".changeValueByValue(): " + rubArr1.toString());

        rubArr1 = new RubberArray_my(array);
        System.out.println(".minValue: " + rubArr1.minValue());
        System.out.println(".maxValue: " + rubArr1.maxValue());
        System.out.println(".summValue: " + rubArr1.summValue());
        System.out.println(".averageValue: " + rubArr1.averageValue());
        System.out.println(".remove: " + rubArr1.remove(1));
        System.out.println(".toString: " + rubArr1.toString());

        System.out.println(Arrays.toString(rubArr1.toArray()));
        int [] mewRA = rubArr1.toArray();
        RubberArray_my test = new RubberArray_my();
        System.out.println(Arrays.toString(mewRA));








//        System.out.println("Arrays.toString(array): " + Arrays.toString(array) + array.length);
    }
}
