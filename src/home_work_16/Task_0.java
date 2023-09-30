package home_work_16;

public class Task_0 {
    public static void main(String[] args) {

        System.out.println("Upper Case: " + toUpperCase("good day!"));
    }

    public static String toUpperCase(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }

        }
        return String.valueOf(chars);
    }
}