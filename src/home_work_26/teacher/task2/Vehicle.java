package home_work_26.teacher.task2;

abstract class Vehicle {

    private final int id;

    private static int counter;

    private Engine engine;

    abstract void startEngine();

    abstract public String toString();


    public Vehicle() {
        this.id = counter++;
    }


    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getId() {
        return id;
    }
}
