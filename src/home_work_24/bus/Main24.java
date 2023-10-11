package home_work_24.bus;

public class Main24 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("Vehicle1", 2023);
//        Vehicle vehicle1 = new Vehicle();
//        System.out.println("Model: " + vehicle1.getModel());
//
//        System.out.println(vehicle.toString());
//        vehicle.start();
//        vehicle.stop();
//
//        System.out.println("Bus bus ========================================");
//
//        Bus bus = new Bus("Bus-xModel", 200, 3);
//        System.out.println(bus.toString());
//        bus.start();
//        bus.stop();
//        bus.dropOfPassenger();
//        bus.takePassenger();
//        bus.takePassenger();
//        System.out.println("Пассажиров в автобусе: " + bus.getCountPassengers());
//        bus.takePassenger();
//        bus.dropOfPassenger();
//
//        bus.takePassenger();
//        bus.takePassenger();
//        System.out.println("Пассажиров в автобусе: " + bus.getCountPassengers());
//
//
//        System.out.println("Bus bus1 ========================================");
//        Bus bus1 = new Bus();
//        //System.out.println(bus1.toString());
//        bus1.start();
//        bus1.stop();


        System.out.println("InternationalBus ========================================");
        InternationalBus iBus =
                new InternationalBus("Ikarus", 1999, 32, new String[]
                        {"Spain", "Italy", "Germany"});

        System.out.println(iBus.toString());

        iBus.startBus();
        iBus.stopBus();

        iBus.takePassenger();
        iBus.takePassenger();
        System.out.println("Пассажиров в автобусе: " + iBus.getCountPassengers());

        iBus.startBus();
        iBus.stopBus();

        iBus.dropOfPassenger();
        System.out.println("Пассажиров в автобусе: " + iBus.getCountPassengers());

        iBus.goToRoute(1000);









    }
}
