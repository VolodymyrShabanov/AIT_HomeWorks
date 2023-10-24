package home_work_33.person;

// Created by Volodymyr Sh on 23.10.2023
// project name: AIT_Lessons
public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);

        String test = "0123@567/.89";
        System.out.println(test.indexOf('@'));
        System.out.println(test.lastIndexOf('@'));
        System.out.println(test.indexOf('1'));
        System.out.println(test.indexOf('1', 4));

        System.out.println(person);
        person.setEmail("as_d@fff.ff");
        System.out.println(person);

    }
}
