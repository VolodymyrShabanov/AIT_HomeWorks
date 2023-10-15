package home_work_26.teacher.task2;

public class MainTransport {
    public static void main(String[] args) {
        Car car1 = new Car();
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();
        EBicycle eBicycle = new EBicycle();

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = car1;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;
        vehicles[3] = eBicycle;


        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
            vehicle.startEngine();
            System.out.println(vehicle);
            System.out.println("==================\n");
        }


        System.out.println(car1.toString());


    }
}
