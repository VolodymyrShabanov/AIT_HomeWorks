package home_work_15;

import java.util.Arrays;

public class HomeWork_15_2 {
    public static void main(String[] args) {
        String [] strings = {"start", null, "string", "sonny", "the end"};
        String[] twoString = createArrayWithSmallestAndLongestStringOfArray(strings);

        System.out.println(Arrays.toString(twoString));
    }

    public static String[] createArrayWithSmallestAndLongestStringOfArray(String[] strings) {
        String[] result = new String [2];

        if (strings == null || strings.length == 0) {
            return result;
        }

        String minLenStr = strings[0];
        String maxLenStr = strings[0];

        // в данном случа if нужно разделять на два отдельных так как входящий массив может быть из одного элемента
        for (String str : strings) {
            // str -> null (str != null) -> (null != null) -> false
            if (str != null && str.length() < minLenStr.length()) {
                minLenStr = str;
            }
            if (str != null && str.length() > maxLenStr.length()) {
                maxLenStr = str;
            }

        }

        result[0] = minLenStr;
        result[1] = maxLenStr;


        return result;



    }
}
