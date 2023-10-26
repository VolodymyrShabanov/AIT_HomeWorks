package home_work_36.test;

import home_work_36.MyComparatorTask1;
import home_work_36.MyComparatorTask2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyComparatorTask2Test {

    Integer[] startIntegers;
    MyComparatorTask2 myComparatorTask2 = new MyComparatorTask2();

    @BeforeEach
    void setUp() {
        startIntegers = new Integer[]{2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
    }

    // не получается передать несколько массивов для тестирования
    @Test
    void testComparatorTask2() {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, myComparatorTask2);
        assertArrayEquals(startIntegers, integers);
    }
}