package home_work_26.vehicle;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Renault", 2020);
        System.out.println(car1.getModel());
        car1.startEngine();

        Motorcycle motor1 = new Motorcycle("SUZUKI", 2012);
        System.out.println(motor1.getModel());
        motor1.startEngine();

        Bicycle bicycle1 = new Bicycle("Ghost", 2022);
        System.out.println(bicycle1.getModel());
        bicycle1.startEngine();

        Vehicle [] vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = motor1;
        vehicles[2] = bicycle1;

        System.out.println("====================================");

        for (Vehicle currentVehicle : vehicles) {
            currentVehicle.startEngine();
        }

        System.out.println("====================================");
        for (Vehicle currentVehicle : vehicles) {
            if (!(currentVehicle instanceof Bicycle)) currentVehicle.startEngine();
        }


    }
}
