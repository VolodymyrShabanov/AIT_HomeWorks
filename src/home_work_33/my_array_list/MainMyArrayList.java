package home_work_33.my_array_list;

// Created by Volodymyr Sh on 24.10.2023
// project name: AIT_HomeWorks
public class MainMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();


        myArrayList.addAll(1, 2, 3, 4, 5, 6);


        for (Integer val : myArrayList) {
            System.out.println(val);
        }


    }
}
