package home_work_26.teacher.task1;

public class Human extends Runner {
    private int speed;
    private int restTime;
    protected String typeRunner;

    public Human() {
        this.speed = 10;
        this.restTime = 15;
        typeRunner = "Usual people";
    }

    public Human(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
        typeRunner = "Usual people";

    }

    @Override
    public void run() {
        System.out.println(typeRunner + " бежит со скоростью: " + speed);
        rest(restTime);
    }

    @Override
    public void rest(int time) {
        System.out.println("Мне нужен отдых: " + time);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }
}
