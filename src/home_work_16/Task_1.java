package home_work_16;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        swap(numbers, 1, 5);

    }

    public static void swap(int[] ints, int idx1, int idx2) {
        if (idx1< 0 || idx2< 0|| idx1>= ints.length || idx2 >= ints.length) return;
        int temp = ints[idx1];
        ints[idx1] = ints[idx2];
        ints[idx2] = temp;

        System.out.println(Arrays.toString(ints));
    }
}
