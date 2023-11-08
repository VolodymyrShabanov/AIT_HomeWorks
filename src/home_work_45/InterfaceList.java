package home_work_45;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_HomeWorks
 */
public class InterfaceList<T> {

    public List<T> intersectLists(List<T> first, List<T> second) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                if (first.get(i).equals(second.get(j))) {
                    result.add(first.get(i));
                }
            }
        }
        System.out.println(result);
        return result;
    }


}
