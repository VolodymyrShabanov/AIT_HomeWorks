package home_work_26.teacher.task2;

import java.lang.invoke.VarHandle;

public class Bicycle extends Vehicle {
    public Bicycle() {
        setEngine(null);

    }

    @Override
    void startEngine() {
        System.out.println("Двигатель отсутствует.");
    }

    @Override
    public String toString() {
        return "Bicycle {" + getId() + "; двигателя нет}";
    }
}
