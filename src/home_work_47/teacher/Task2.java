package home_work_47.teacher;

import java.util.*;

/**
 * Created by Volodymyr Sh on 13.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);
        map1.put("test", 40);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

//        Map<String, Integer> intersectionMap = intersection(map1, map2);
//        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("map1: " + map1);
        Set<String> keySet1 = map1.keySet();


        keySet1.remove("test");
        System.out.println("map1 (2): " + map1);

//
//        Map<String, Integer>  intersectionMap = intersection2(map1, map2);
//        intersectionMap.forEach((key, value) -> System.out.println(key + ": 2 " + value));

        System.out.println("map1 (3): " + map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()){
            if (entry.getValue() < 35){
                entry.setValue(100);
            }
        }

        System.out.println("map2 : " + map2);

    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        Set<String> keySetMap1 = map1.keySet();
        keySetMap1.retainAll(map2.keySet());

        for (String key: keySetMap1){
            result.put(key, map1.get(key));
        }
        return result;
    }

    private static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        Set<String> keySet1 = result.keySet();
        keySet1.retainAll(map2.keySet());

        return result;
    }


}
