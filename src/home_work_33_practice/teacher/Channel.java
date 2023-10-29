package home_work_33_practice.teacher;

import java.util.Random;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Channel {

    private static final int MAX_BROADCASTS_COUNT = 5;

    public String name;
    private Broadcast[] broadcasts;
    private int broadcastsCount;

    public Channel(String name) {
        this.name = name;
        this.broadcasts = new Broadcast[MAX_BROADCASTS_COUNT];
    }

    public void addBroadcast(Broadcast broadcast) {
        this.broadcasts[broadcastsCount] = broadcast;
        broadcastsCount++;
    }

    public void showProgram(){
        Random random = new Random();
        int randomBroadcastNumber = random.nextInt(broadcastsCount);

        System.out.println(name + " : " + broadcasts[randomBroadcastNumber].getTitle());
    }



}
