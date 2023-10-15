package home_work_26.teacher.task1;

public class MainRunners {
    public static void main(String[] args) {

        Human human = new Human();
        Amateur amateur = new Amateur();
        ProRunner proRunner = new ProRunner();

        System.out.println("=======================");
        human.run();
        System.out.println("=======================");
        amateur.run();
        System.out.println("=======================");
        proRunner.run();



    }

}
