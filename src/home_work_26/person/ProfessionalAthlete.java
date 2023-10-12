package home_work_26.person;

public class ProfessionalAthlete extends AmateurAthlete{

    public ProfessionalAthlete(String name, int age) {
        super(name, age);
        setStatus("Professional Athlete");
        setSpeed(25);
        setRest(5);
    }

}
