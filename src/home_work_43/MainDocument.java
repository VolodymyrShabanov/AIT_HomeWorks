package home_work_43;

/**
 * Created by Volodymyr Sh on 14.11.2023
 * project name: AIT_HomeWorks
 */
public class MainDocument {
    public static void main(String[] args) {
        Document document = new Document();
        System.out.println("Name: " + document.getName() + "; Status: " + document.getState() + ";");

        document.publish();
        document.correct();

        document.deleted();
        document.deleted();
        document.publish();
        document.correct();



    }
}
