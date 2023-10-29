package home_work_33_practice.teacher;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void on(int channelNumber) {
        tv.onChannel(channelNumber);
    }
}
