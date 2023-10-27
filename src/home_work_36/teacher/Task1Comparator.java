package home_work_36.teacher;

import java.util.Comparator;

// Created by Volodymyr Sh on 26.10.2023
// project name: AIT_HomeWorks
public class Task1Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = (int1 % 2) == 0;
        boolean isSecondEven = (int2 % 2) == 0;

        if (isFirstEven && !isSecondEven) {
            return -1;
        } else if (!isFirstEven && isSecondEven) {
            return 1;
        } else {
            return Integer.compare(int1, int2);
        }
    }
}
