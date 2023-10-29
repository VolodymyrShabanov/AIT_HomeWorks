package home_work_33_practice.my;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_HomeWorks
public class Controller {
    private final TV tv;
    public Controller(TV tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "tv=" + tv.getManufacturer() + '}';
    }

    public void turnOn() {
        tv.setPower(true);
    }

    public void turnOff() {
        tv.setPower(false);
    }

    public void setChanel(int chanel) {
        tv.setChannel(chanel);
    }
}

