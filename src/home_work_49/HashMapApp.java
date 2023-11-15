package home_work_49;

/**
 * Created by Volodymyr Sh on 14.11.2023
 * project name: AIT_Lessons
 */
public class HashMapApp {
    public static void main(String[] args) {
        MyHashMap <Integer, String> map = new MyHashMap<>();

//        System.out.println("value: " + map.put(5, "Str 5"));
//        System.out.println("=====================================");
//        System.out.println("value: " + map.put(11, "Str 11"));
//        System.out.println("value: " + map.put(21, "Python"));
//        System.out.println(map + " size: " + map.size());
//
//        System.out.println("value: " + map.put(21, "Java"));
//        System.out.println(map + " size: " + map.size());
//
//        System.out.println(map.put(null, "test"));
//        System.out.println(map + " size: " + map.size());
//
//        System.out.println(map.put(null, "orange"));
//        map.put(0, "zero");
//        map.put(16, "apple");
//        System.out.println(map + " size: " + map.size());
//
//        System.out.println("key 0: " + map.get(0));
//        System.out.println("key null: " + map.get(null));
//        System.out.println("key 16: " + map.get(16));
//
//        map.put(37, "Banana");
//        map.put(9, "Cat");
//        map.put(11, "Robot");
//        map.put(43, "Map");
//        map.put(25, "Tree");
//        map.put(8, "Red");
//
//        System.out.println(map + " size: " + map.size());
//
//        //map.put(3, "one");
//
//        map.put(69, "six + 9");
//        System.out.println(map + " size: " + map.size());
//        map.put(-15, "minus");
//        map.put(-1, "minus");
//        System.out.println(map + " size: " + map.size());
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.getOrDefault(3, "Default"));
//        System.out.println(map.getOrDefault(300, "Default"));
//
//        System.out.println("============ map.containsKey ============");
//        System.out.println(map.containsKey(-1));
//        System.out.println(map.containsKey(0));
//        System.out.println(map.containsKey(null));
//        System.out.println(map.containsKey(69));
//
//
//        System.out.println("============ map.clear ============");
////        map.clear();
////        map.put(3, "one");
////        System.out.println(map + " size: " + map.size());
////        System.out.println(map.keySet());
////        System.out.println(map.values());
////        System.out.println(map.getOrDefault(null, "Default"));
//
//        System.out.println(map + " size: " + map.size());
//        System.out.println(map + " remove: " + map.remove(null));
//        System.out.println(map + " remove: " + map.remove(null));

        map.put(null, "NULL");
        map.put(0, "zero");
        map.put(5, "five");
        map.put(21, "twenty one");
        map.put(37, "thirty seven");
        map.put(53, "fifty three");
        System.out.println(map + " size: " + map.size());

        System.out.println(map + " remove: " + map.remove(null));
        System.out.println(map + " remove: " + map.remove(53));
        System.out.println(map + " remove: " + map.remove(null));
//        System.out.println(map + " remove: " + map.remove(21));


    }
}
