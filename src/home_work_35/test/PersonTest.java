package home_work_35.test;

import home_work_35.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q!";


    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testSetValidEmail() {
        String validEmail = "valid@test.de";
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    @Test
    void testInvalidEmail() {
        String incorrectEmail = "invalid.test.de";
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @Test
    void testInvalidEmailTwoAtSet() {
        String incorrectEmail = "inva@lid@test.de";
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid@testd.e", "invalid@testde.", "invalid@testde"})
    void testIncorrectEmailSetParam(String incorrectEmail) {
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("generateDataForEmailTest")
    void testIncorrectEmailSetParamMethodSource(String incorrectEmail) {
        person.setEmail(incorrectEmail);
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> generateDataForEmailTest() {
        return Stream.of("inva!lid@test.de", "invalid@te*st.de",
                "inva lid@test.de", "invalid@test.d#e", "invalid@te$st.de");
        // TODO насколько корректно использование не английского алфавита?
        // "invaДid@test.de", "inva게id@test.de"
    }

    @Test
    void testIncorrectPasswordLengthLessEight() {
        String incorrectPassword = "erty1Q!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    @Test
    void testIncorrectPasswordNotDigit(){
        String incorrectPassword = "qwertyQ!";
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = {"QWERTY1Q!", "1234567!Q", "1234567!%"})
    void testIncorrectPasswordNotLowerCase(String incorrectPassword){
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = {"qwerty1q!", "1234567!q", "1234567!%"})
    void testIncorrectPasswordNotUpperCase(String incorrectPassword){
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }


    @ParameterizedTest
    @ValueSource(strings = {"qwerty1Q", "qwerty1Q<", "*qwerty1Q", "qwe rty1Q", "qwerty1Q!"})
    void testIncorrectPasswordNotContainSpecialSymbol(String incorrectPassword){
        person.setPassword(incorrectPassword);
        Assertions.assertEquals(startPassword, person.getPassword());
    }

}