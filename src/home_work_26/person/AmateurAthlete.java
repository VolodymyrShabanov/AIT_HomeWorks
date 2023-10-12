package home_work_26.person;

public class AmateurAthlete extends Person{

    public AmateurAthlete(String name, int age) {
        super(name, age);
        setStatus("Amateur Athlete");
        setSpeed(15);
        setRest(10);
    }

    @Override
    public String run() {
        return super.run() + super.restTime();

    }

}
