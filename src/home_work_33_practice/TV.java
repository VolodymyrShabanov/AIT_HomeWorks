package home_work_33_practice;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_HomeWorks
public class TV {
    private final String manufacturer;
    private int channel;
    private int lastChannel;
    private boolean power;
    private Channels[] channels;
    private int count;

    public TV(String manufacturer) {
        this.manufacturer = manufacturer;
        this.channels = new Channels[5];
    }
    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", channel=" + channel +
                ", power=" + power +
                '}';
    }


    public void addChannel(Channels channel) {
        if (this.count < channels.length) {
            System.out.println(channel);
            channels[count++] = channel;
        } else {
            System.out.println("Список каналов: полон.");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (!power){
            setPower(false);
            return;
        }
        if (channel > channels.length) {
            System.out.println("Выбранный канал: " + channel + " превышает список из: " + channels.length + " каналов");
            return;
        }
        if (channels[channel] == null) return;
        System.out.println("Выбран канал: " + channels[channel].getNameChannel());
        System.out.println("Предыдущая передача: " + channels[channel].getProgram(0));
        System.out.println("Текущая передача: " + channels[channel].getProgram(1));
        System.out.println("Следующая передача: " + channels[channel].getProgram(2));
        lastChannel = channel;

    }

    public int getLastChannel() {
        return lastChannel;
    }

    public void setLastChannel(int lastChannel) {
        this.lastChannel = lastChannel;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        if (power) {
            channel = lastChannel;
            System.out.println("Телевизор включен.");
            this.power = true;
            return;
        }
        channel = 0;
        System.out.println("Телевизор выключен.");
        this.power = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
