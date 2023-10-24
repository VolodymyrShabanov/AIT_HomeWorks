package home_work_32.teacher;
/*
@date 23.10.2023
@author Sergey Bugaienko
*/

public class LinkedList33Main {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();
//        list.addAll("Java");
//        list.addAll("String", "Hello", "Java", "Three");
//        System.out.println(list);
//        System.out.println("get: " + list.get(0));
//        System.out.println("contains: " + list.contains("Java"));
//        System.out.println("remove: " + list.remove("Java"));
//        System.out.println(list);
//        list.add("Python");
//        System.out.println(list);
//        System.out.println("remove: " + list.remove(2));
//        System.out.println(list);
//        System.out.println(list.size());
//
//        String[] strings = list.toArray();
//        System.out.println(Arrays.toString(strings));
//
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
////        }
//
//        for (String val : list) {
//            System.out.print(val + "; ");
//        }
//        System.out.println();
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String val = iterator.next();
//        }

        list.addAll("h");

        System.out.println(list.toString());
        System.out.println(list.remove("h"));
        System.out.println(list.toString());


    }
}
