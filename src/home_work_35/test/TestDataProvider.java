package home_work_35.test;

import home_work_26.person.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_HomeWorks
public class TestDataProvider {

    static Stream<Arguments> dataForTestStreamsFromClass() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, "Hello", true, new Person("trr", 34)),
                Arguments.of(new int[]{0, 2, 4, 6}, "Java", false, null),
                Arguments.of(new int[]{0, 66, 7, 13, 2}, "Test data", true, null)
        );
    }
}
