package home_work_26.person;

public class Person {

    private String name;
    private int age;
    private String status;
    private int speed;
    private int rest;

    public Person(String name, int age) {
        this.name = name ;
        this.age = age;
        this.status = "Person";
        this.speed = 10;
        this.rest = 15;

    }

    @Override
    public String toString() {
        return "{Name: " + name + "; age: " + age + "; status: " + status + "}";
    }

    public String run() {
        return "{" + status + ": " + name + " run, speed: " + speed + " km/h}";
    }

    public String restTime() {
        return "{name: " + name + " needs rest: " + rest + " min}";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
