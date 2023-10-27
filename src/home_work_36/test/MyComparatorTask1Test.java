package home_work_36.test;

import home_work_36.MyComparatorTask1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyComparatorTask1Test {
    Integer[] startIntegers;
    MyComparatorTask1 myComparatorTask1 = new MyComparatorTask1();

    @BeforeEach
    void setUp() {
        startIntegers = new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
    }

    // не получается передать несколько массивов для тестирования
    @Test
    void testComparatorTask1() {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, myComparatorTask1);
        assertArrayEquals(startIntegers, integers);
    }

//    // Реализация при помощи GitHub
//    @ParameterizedTest
//    @MethodSource("arraysProvider")
//    void testComparatorTask1(Integer[] integers) {
//        Arrays.sort(integers, myComparatorTask1);
//        assertArrayEquals(startIntegers, integers);
//    }
//    static Stream<Object[]> arraysProvider() {
//        return Stream.of(
//                new Object[]{new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3}},
//                new Object[]{new Integer[]{1, 5, 6, 7, 4, 9, 8, 7, 2, 3}}
//
//        );
//    }

}