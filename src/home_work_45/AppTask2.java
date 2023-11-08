package home_work_45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_HomeWorks
 */
public class AppTask2 {
    static Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkenList = new LinkedList<>();


        int count = 1000;

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            arrayList.add(random.nextInt(10_001));
        }

        gettingAllValuesOfList(arrayList);
        insertNewValuesByIndex(arrayList);
        removeValuesByIndex(arrayList);

        long end = System.currentTimeMillis();
        System.out.println("arrayList: " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkenList.add(random.nextInt(10_001));
        }

        gettingAllValuesOfList(linkenList);
        insertNewValuesByIndex(linkenList);
        removeValuesByIndex(linkenList);

        end = System.currentTimeMillis();
        System.out.println("linkedList: " + (end - start));

    }


    public static void gettingAllValuesOfList(List<Integer> lists) {
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i);
            //System.out.println(lists.get(i));
        }
    }

    public static void insertNewValuesByIndex(List<Integer> lists) {
        for (int i = 0; i < lists.size(); i++) {
            int indexRandom = random.nextInt(lists.size());
            lists.set(indexRandom, random.nextInt(10_001));
        }
    }

    public static void removeValuesByIndex(List<Integer> lists) {
        for (int i = 0; i < lists.size(); i++) {
            int indexRandom = random.nextInt(lists.size());
            lists.remove(indexRandom);
        }
    }


}
