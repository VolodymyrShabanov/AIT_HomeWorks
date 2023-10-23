package home_work_31;

import java.util.Arrays;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

//        System.out.println(strings.size());

        MyLinkedList<String> str = new MyLinkedList<>();
        System.out.println(str.getSize());
        System.out.println(str.getFirst());
        System.out.println(str.getLast());
        System.out.println(str.toString());
        System.out.println("lastIndexOf: " + str.lastIndexOf(new String("H")));
        System.out.println(str.indexOf(new String("!")));

        str.addAll("H");
        str.addAll("e");
        str.addAll("!");
        str.addAll("l");
        str.addAll("o");
        str.addAll("!");
//        System.out.println(str.size());
//        str.toString();
        System.out.println(str.indexOf(new String("!")));
        System.out.println("lastIndexOf: " + str.lastIndexOf(new String("H")));
//        System.out.println(str.contains("H"));
//        System.out.println(str.get(0));
//        System.out.println(Arrays.toString(str.toArray()));

    }
}
