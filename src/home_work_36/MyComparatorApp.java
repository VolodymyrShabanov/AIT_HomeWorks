package home_work_36;

import java.util.Arrays;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_HomeWorks
public class MyComparatorApp {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        MyComparatorTask1 myComparatorTask1 = new MyComparatorTask1();
        Arrays.sort(integers, myComparatorTask1);
        System.out.println("myComparatorTask1: " + Arrays.toString(integers));

        MyComparatorTask2 myComparatorTask2 = new MyComparatorTask2();
        Arrays.sort(integers, myComparatorTask2);
        System.out.println("myComparatorTask1: " + Arrays.toString(integers));

    }
}
