package home_work_26.teacher.task2;

public class Motorcycle extends VehicleWithEngine {
    public Motorcycle(Engine engine) {
        super(engine);
    }

    public Motorcycle() {
        super(new Engine(50, "Petrol"));
    }

    @Override
    public String toString() {
        return "Motorcycle {id: " + getId() + "; " + getEngine() + "}";
    }
}
