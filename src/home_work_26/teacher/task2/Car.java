package home_work_26.teacher.task2;

public class Car extends VehicleWithEngine {
    public Car(Engine engine) {
        super(engine);
    }

    public Car() {
        super(new Engine(100, "Diesel"));
    }

    @Override
    public String toString() {
        return "Car {id: " + getId() + "; " + getEngine() + "}";
    }
}
