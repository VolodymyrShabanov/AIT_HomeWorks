package home_work_26.teacher.task2;

public class Engine {
    private int id;
    private int power;
    private boolean isActive;
    private String typeFuel;
    private static int counterId;

    public Engine(int power, String typeFuel) {
        this.power = power;
        this.typeFuel = typeFuel;
        this.id = counterId++;
    }

    public void start(){
        if (!isActive) {
            isActive = true;
            System.out.println("Двигатель " + id + " запущен");
        } else {
            System.out.println("Двигатель уже работает");
        }
    }

    public void stop() {
        isActive = false;
        System.out.println("Двигатель остановлен! (id: " + id + ")");
    }



    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", power=" + power +
                ", isActive=" + isActive +
                ", typeFuel='" + typeFuel + '\'' +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
