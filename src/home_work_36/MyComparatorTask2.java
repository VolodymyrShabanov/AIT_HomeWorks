package home_work_36;

import java.util.Comparator;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_HomeWorks
public class MyComparatorTask2 implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        int comparison = number1 % 2 - number2 % 2;
        if (comparison == 0)
            if (number1 % 2 == 0) {
                return number1 - number2;
            } else {
                return number2 - number1;
            }
        return comparison;
    }

}
