package home_work_26.person;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Colya", 34);

        System.out.println(person.toString());
        System.out.println(person.run());

        AmateurAthlete amateur = new AmateurAthlete("Jone", 25);
        System.out.println(amateur.toString());
        System.out.println(amateur.run());

        ProfessionalAthlete professional = new ProfessionalAthlete("Stas", 33);
        System.out.println(professional.toString());
        System.out.println(professional.run());


    }
}
