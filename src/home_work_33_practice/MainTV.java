package home_work_33_practice;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_HomeWorks
public class MainTV {
    public static void main(String[] args) {
        TV sony = new TV("Sony");
        Controller controller1 = new Controller(sony);
        System.out.println(sony);
        System.out.println(controller1);

        controller1.turnOn();
        controller1.setChanel(3);
        System.out.println(sony);

        controller1.turnOff();
        controller1.setChanel(3);
        System.out.println(sony);

        System.out.println("getLastChannel(): " + sony.getLastChannel());
        controller1.turnOn();
        System.out.println(sony);
        System.out.println("================");

        Channels channel = new Channels("1+1", 3);
        channel.addProgram("Start");
        channel.addProgram("Privet");
        channel.addProgram("Finish");
        System.out.println(channel);

        Channels channel1 = new Channels("2+2", 3);
        channel1.addProgram("last");
        channel1.addProgram("ups!");
        channel1.addProgram("new");
        System.out.println(channel1);

        sony.addChannel(channel);
        sony.addChannel(channel1);
        controller1.setChanel(0);
        controller1.setChanel(1);
    }
}
