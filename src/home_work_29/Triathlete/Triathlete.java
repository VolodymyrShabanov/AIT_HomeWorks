package home_work_29.Triathlete;

public class Triathlete implements Swimmer, Runner {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "is run.");
    }

    @Override
    public void swimmer() {
        System.out.println(name + "is swimmer");
    }
}
