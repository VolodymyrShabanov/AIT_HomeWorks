package home_work_26.teacher.task2;

abstract class VehicleWithEngine extends Vehicle {
//    private Engine engine;


    public VehicleWithEngine(Engine engine) {
        super.setEngine(engine);
    }

    public VehicleWithEngine() {
    }

    @Override
    void startEngine(){
        if (getEngine() !=null) {
            getEngine().start();
        }else {
            System.out.println("Двигателя нет");
        }
    }

    @Override
   abstract public String toString();

}
