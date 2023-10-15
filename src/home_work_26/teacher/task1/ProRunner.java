package home_work_26.teacher.task1;

public class ProRunner extends Human{


    public ProRunner() {
        setSpeed(25);
        setRestTime(5);
        typeRunner = "Pro runner";
    }

    public ProRunner(int speed, int restTime) {
        super(speed, restTime);
        typeRunner = "Pro runner";
    }
}
