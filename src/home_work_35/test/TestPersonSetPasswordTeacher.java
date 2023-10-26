package home_work_35.test;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_HomeWorks


import home_work_35.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestPersonSetPasswordTeacher {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q!";


    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @ParameterizedTest
    @MethodSource("getIncorrectPasswords")
    void testSetIncorrectPassword(String incorrectPass) {

        boolean isPassApply = person.setPassword(incorrectPass);
        assertEquals(startPassword, person.getPassword());
        assertFalse(isPassApply);
    }

    static Stream<String> getIncorrectPasswords() {
        return Stream.of(
                "qwerty1@", "wertY1@", "qe#ry3@", "qwerty1Q!"
        );
    }

    //"qwer tY3@", "\"qwertY3@"

    @ParameterizedTest
    @ValueSource(strings = {"qwerty2Q!", "qwerty1Q%"} )
    void testSetValidPassword(String validPass) {
        boolean isPassApply = person.setPassword(validPass);
        assertTrue(isPassApply);
        assertEquals(validPass, person.getPassword());
    }
}
