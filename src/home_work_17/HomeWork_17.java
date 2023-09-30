package home_work_17;

public class HomeWork_17 {
    public static void main(String[] args) {
        Car car = new Car("Range Rover", "Evoque", "hatchback", "white", 5, 2023, 10);

        car.start();
        car.fuelling(20);
        //car.start();

        int distance = 20;
        while(distance > 0 && car.isMoving) {
            System.out.println("--> Осталось проехать: " + (distance--));
            car.drive();
        }

        if (distance == 0) car.stop();

    }
}
