package home_work_33_practice;

import java.util.Arrays;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_HomeWorks
public class Channels {

    private final String nameChannel;
    private String[] listPrograms;
    private int count;

    public Channels(String nameChannel, int listQuantity) {
        this.nameChannel = nameChannel;
        this.listPrograms = new String[listQuantity];
    }



    public void addProgram(String titleProgram) {
        if (this.count < listPrograms.length) {
            listPrograms[count++] = titleProgram;
        } else {
            System.out.println("Список передач канала: " + nameChannel + " - полон.");
            System.out.println(this);
        }
    }

    public void deleteProgram(int index) {
        for (int i = index; i < listPrograms.length - 1; i++) {
            listPrograms[i] = listPrograms[i + 1];
        }
        listPrograms[listPrograms.length - 1] = null;
        count--;
        System.out.println(this);
    }

    public void deleteProgram(String nameProgram) {
        for (int i = 0; i < listPrograms.length; i++) {
            if (listPrograms[i] == null) return;
            if (listPrograms[i].equalsIgnoreCase(nameProgram)) {
                deleteProgram(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Channels{" +
                "nameChannel='" + nameChannel + '\'' +
                ", programs=" + Arrays.toString(listPrograms) +
                '}';
    }

    public String getNameChannel() {
        return nameChannel;
    }

    public String getProgram(int index) {
        return listPrograms[index];
    }
    public String[] getListPrograms() {
        return listPrograms;
    }
}
