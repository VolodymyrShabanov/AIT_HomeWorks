package home_work_33_practice.teacher;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Main {

    public static void main(String[] args) {
        Channel bbc = new Channel("BBC");
        Channel cnn = new Channel("CNN");

        Broadcast animals = new Broadcast("Animals");
        Broadcast religion = new Broadcast("religion");
        Broadcast worldNews = new Broadcast("worldNews");
        Broadcast nationalNews = new Broadcast( "nationalNews");
        Broadcast music = new Broadcast( "music");
        Broadcast sport = new Broadcast( "sport");

        bbc.addBroadcast(animals);
        bbc.addBroadcast(religion);
        bbc.addBroadcast(worldNews);

        cnn.addBroadcast(nationalNews);
        cnn.addBroadcast(music);
        cnn.addBroadcast(sport);

        TV tv = new TV();
        tv.addChannel(bbc);
        tv.addChannel(cnn);

        RemoteController remoteController = new RemoteController(tv);

        remoteController.on(0);
        remoteController.on(1);



    }
}
