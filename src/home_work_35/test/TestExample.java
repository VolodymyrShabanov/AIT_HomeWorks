package home_work_35.test;

import com.sun.jdi.connect.Connector;

import home_work_35.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_HomeWorks
public class TestExample {
    @ParameterizedTest
    @MethodSource("home_work_35.test.TestDataProvider#dataForTestStreamsFromClass")
    void exampleGetValuesByStream(int[] ints, String str, boolean isActive, Person person) {
        System.out.println(Arrays.toString(ints));
        System.out.println(str + ": " + isActive);
        System.out.println(person);
    }

    static Stream<Arguments> dataForTestStreams() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, "Hello", true, new Person("trr", "Qwerty!1")),
                Arguments.of(new int[]{0, 2, 4, 6}, "Java", false, null),
                Arguments.of(new int[]{0, 66, 7, 13, 2}, "Test data", true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForArraysEquals")
    void exampleArrayEquals(int[] arr1, int[] arr2) {
        assertArrayEquals(arr1, arr2);
        assertEquals(arr1[0], arr2[0]);
    }

    static Stream<Arguments> dataForArraysEquals() {
        return Stream.of(
                Arguments.of(new int[]{5, 3, 9, 0}, new int[]{5, 3, 9, 0}),
                Arguments.of(new int[]{5, 3, 9, 1}, new int[]{5, 3, 9, 0})
        );
    }
}
