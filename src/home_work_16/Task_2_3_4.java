package home_work_16;

public class Task_2_3_4 {
    public static void main(String[] args) {

        String str = "0123456789";
        System.out.println(subsString(str, 3, 10));
        System.out.println(subsString(str, 3));


        String[] testStrings = {"String", null, "hello", "Java", "JavaScript"};
        String findMe = "Java";
        System.out.println(searchStringInArray(testStrings, findMe));

        System.out.println(getTwoSymbolsString(findMe));

    } // main end

    public static String subsString(String string, int idx1, int idx2) {

        String result = "";
        if (string == null || idx1 < 0 || idx1 > string.length() || idx2 < 0 || idx2 > string.length()) return result;

        // option1
        if (idx1 > idx2) return result;
        char[] chars = new char[idx2 - idx1];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i + idx1);
        }

        // option2
        for (int j = idx1; j < idx2; j++) {
            result += String.valueOf(string.charAt(j));
        }

        //return String.valueOf(chars); // option1
        return result; // option2
    }

    public static String subsString(String string, int idx1)  {
        return  subsString(string, idx1, string.length());
    }

    public static int searchStringInArray(String[] strings, String fingMe) {
        if (strings == null || fingMe == null) return -1;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].equalsIgnoreCase(fingMe)) return i;

        }
        return -1;
    }

    public static String getTwoSymbolsString(String str) {
        String result = "";
        if (str.length()>1) {
            result += str.charAt(1);
        }
        if (str.length()>2) {
            result += str.charAt(2);
        }
        return result.toUpperCase();
    }
}
