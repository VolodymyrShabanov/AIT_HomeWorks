package home_work_25.bus_passenger_driver;

import java.util.Arrays;

public class MainBus {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("B. Smith");
//        System.out.println(passenger.toString());
//        System.out.println(passenger.getTicketNumber());
//

        BusDriver driver = new BusDriver("K. White" , "AB-4343432");
        System.out.println(driver.toString());

        Bus bus = new Bus("Neoplan", 44, driver);
        System.out.println(bus.toString());

        // Done - вывод массива пассажиров.
        // Done - вывод отсутствие драйвера.

        Bus bus1 = new Bus("Scaniz", 5);
        System.out.println(bus1.toString());

        Passenger passenger2 = new Passenger("N. Paul");
        Passenger passenger3 = new Passenger("J. Black");
        Passenger passenger4 = new Passenger("P. Dou");
        Passenger passenger5 = new Passenger("A. Jonet");



        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));

        bus1.takePassenger(passenger1);
        bus1.takePassenger(passenger3);
        bus1.takePassenger(passenger2);
        bus1.takePassenger(passenger5);
        System.out.println(bus1.getAmountPassenger());
        System.out.println("Step 1: " + Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());

        bus1.droopPassenger(passenger1);
        System.out.println(bus1.getAmountPassenger());
        System.out.println("Step 2: " + Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());


        bus1.takePassenger(passenger4);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println("Step 3: " + bus1.toString());


        bus1.droopPassenger(passenger1);
        bus1.droopPassenger(passenger2);
        bus1.takePassenger(passenger5);
        System.out.println(bus1.getAmountPassenger());
        System.out.println("Step 4: " + Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());

        bus1.droopPassenger(passenger4);
        bus1.droopPassenger(passenger5);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println("Step 5: " + bus1.toString());




    }
}


//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(124);
//        System.out.println(sb.toString());
//        sb.setLength(sb.length() - 3);
//        System.out.println(sb.toString());
