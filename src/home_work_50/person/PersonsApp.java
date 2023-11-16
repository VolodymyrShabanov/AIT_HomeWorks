package home_work_50.person;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class PersonsApp {
    public static void main(String[] args) {
        Person person1 = new Person("john@email.com", "Qwerty!1");
        System.out.println("person1 password:" + person1.getPassword());

        Person person2 = new Person("john@email.com", "Qwerty!1");
        System.out.println("person2 password:" + person2.getPassword());

        Person person3  = new Person("john@email.com", "Qwer!1");
        System.out.println("person3 password:" + person3 .getPassword());

        Person person4 = new Person("john@email.com", "qwerty!1");
        System.out.println("person4password:" + person4.getPassword());

    }
}
