package home_work_17;

public class Car<patrol> {
    String make;
    String model;
    String bodyType;
    String color;
    int passengers;
    int year;
    int mileage;
    int petrol;
    boolean isMoving;

    public Car(String make,
               String model,
               String bodyType,
               String color,
               int passengers,
               int year,
               int mileage) {

        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.passengers = passengers;
        this.year = year;
        this.mileage = mileage;

    }

    void start() {
        if (petrol != 0) {
            isMoving = true;
            System.out.println("Машина завелась!");
            System.out.println("Уровень топлива: " + petrol + "!. Можем ехать!");
        } else {
            isMoving = false;
            System.out.println("Машина не заводится.");
            System.out.println("Уровень топлива: " + petrol + ". Нужно заправить!");
        }

    }

    void drive() {
        petrol--;
        if (petrol <= 0) {
            isMoving = false;
            System.out.println("Машина остановилась.");
            System.out.println("Уровень топлива: " + petrol + ". Нужно заправить!");
        } else {
            System.out.println("Мы едем, едем, едем!");
            System.out.println("Осталось топлива: " + petrol + ".");
        }
    }

    void stop() {
        isMoving = false;
        System.out.println("Мы приехали в пункт назначения!");
    }

    void fuelling(int liter) {
        System.out.println("Машина заправлена");
        System.out.println("Уровень топлива: " + (petrol = liter) + ".");
    }

}
