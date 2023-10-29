package home_work_33_practice.teacher;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class TV {

    public static final int MAX_CHANNELS_COUNT = 5;
    private Channel[] channels;

    private int channelsCount;


    public TV() {
        this.channels = new Channel[MAX_CHANNELS_COUNT];
    }

    public void addChannel(Channel channel){
        this.channels[channelsCount] = channel;
        channelsCount++;
    }

    public void onChannel(int channelNumber){
        channels[channelNumber].showProgram();
    }
}
