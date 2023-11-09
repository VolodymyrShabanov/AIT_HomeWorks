package home_work_45.my;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_HomeWorks
 */
public class AppTask1 {
    public static void main(String[] args) {

        List<Integer> first = new ArrayList<>(List.of(1, 3, 5, 6, 7, 9));
        List<Integer> second = new ArrayList<>(List.of(5, 9, 23, 12, 32, 1));

        InterfaceList<Integer> result = new InterfaceList<>();

        result.intersectLists(first, second);


    }


}
