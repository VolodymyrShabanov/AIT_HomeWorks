package home_work_26.teacher.task1;

public class Amateur extends Human{

    public Amateur() {
        setSpeed(15);
        setRestTime(10);
        super.typeRunner = "Amateur";
    }

    public Amateur(int speed, int restTime) {
        super(speed, restTime);
        super.typeRunner = "Amateur";
    }
}
