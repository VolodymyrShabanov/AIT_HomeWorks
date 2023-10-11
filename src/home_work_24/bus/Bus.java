package home_work_24.bus;

public class Bus extends Vehicle {

    int capacity;
    int countPassengers;
    private int kilometer;

    public Bus(String model, int yearOfMan, int capacity) {
        super(model, yearOfMan);
        //System.out.println("Конструктор Bus");
        this.capacity = capacity;
    }

    public Bus() {
        this.setModel("Bus-01");
        //super();
    }

    public void takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус! " + this.getModel());
        } else {
            System.out.println("Автобус полный");
        }
    }

    public void dropOfPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса.");
        } else {
            System.out.println("В автобусе больше нет пассажиров.");
        }

    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCapacity() {
        return capacity;
    }

    // setKilometer - думаю что не нужен, так как мы создаем новый автобус, а пробег уникальный для каждого автобуса.

    public int getKilometer () {
        return kilometer;
    }

    public void startBus() {
        super.start();
        this.kilometer++;
    }

    public void stopBus() {
        super.stop();
        System.out.println("Bus: " + getModel() + " общий пробег составляет: " + kilometer + " km");
    }


}

