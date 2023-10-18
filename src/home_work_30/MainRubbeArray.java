package home_work_30;

public class MainRubbeArray {

    public static void main(String[] args) {
        RubberArrayGenerics<String> strRA = new RubberArrayGenerics<>();
        strRA.add("as", "my", "dog", "cat");
        strRA.add("my");
        strRA.add("fly");
        System.out.println(strRA.toString());
        System.out.println(strRA.length());
        System.out.println(strRA.indexOf("my"));
        System.out.println(strRA.lastIndexOf("my"));

        strRA.removeByIndex(5);
        System.out.println(strRA.toString());

    }
}

