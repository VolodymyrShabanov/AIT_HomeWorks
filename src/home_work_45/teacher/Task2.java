package home_work_45.teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2 {

    private static final int CAPACITY = 10_000;
    public static void main(String[] args) {
        List<Integer>  arrayList = new ArrayList<>(CAPACITY);
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(1000);
            arrayList.add(value);
            linkedList.add(value);
        }

        long start = System.currentTimeMillis();
        System.out.println("get arrayList: " + getElements(arrayList));
        System.out.println("insert arrayList: "+ insertElements(arrayList));
        System.out.println("deleteByIndex arrayList: " + deleteElementsByIndex(arrayList));
        System.out.println("deleteByValue arrayList: "+ deleteElementsByValue(arrayList));
        long end = System.currentTimeMillis();

        System.out.println("Общее время для ArrayList: " + (end - start));


        System.out.println("\n===========================================");

        start = System.currentTimeMillis();
        System.out.println("get linkedList: " + getElements(linkedList));
        System.out.println("insert linkedList: "+ insertElements(linkedList));
        System.out.println("deleteByIndex linkedList: " + deleteElementsByIndex(linkedList));
        System.out.println("deleteByValue linkedList: "+ deleteElementsByValue(linkedList));
        end = System.currentTimeMillis();

        System.out.println("Общее время для LinkedList: " + (end - start));
        System.out.println("\n===========================================");



    }

    public static long getElements(List<Integer> integers){
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long insertElements(List<Integer> integers){
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(10000));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByIndex(List<Integer> integers){
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.remove(random.nextInt(integers.size()));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByValue(List<Integer> integers){
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.add(Integer.valueOf(random.nextInt(integers.size())));
        }

        long end = System.currentTimeMillis();
        return (end - start);
    }

}
