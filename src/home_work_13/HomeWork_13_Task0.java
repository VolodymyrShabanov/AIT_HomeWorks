package home_work_13;

public class HomeWork_13_Task0 {
    public static void main(String[] args) {
        int[] tesArray = new int[]{1, 4, 3, 5, 6, 7};

        printReverseArray(tesArray);
        printReverseArray(tesArray, 3);
        printReverseArray(tesArray, false);

    } // Methods area

    public static void printReverseArray(int[] tesArray, boolean flag) {
        if (flag){
            // reverse
            printReverseArray(tesArray);
        }else {
            // direct
            printReverseArray(tesArray, tesArray.length);
        }
    }

    public static void printReverseArray(int[] tesArray, int idx) {

        for (int i = 0; i < idx; i++) {
            System.out.print(tesArray[i] + ", ");
        }

        for (int i = tesArray.length - 1; i >= idx; i--) {
            System.out.print(tesArray[i] + ", ");
        }




        System.out.println();
    }

    public static void printReverseArray(int[] tesArray) {
        for (int i = tesArray.length - 1; i >= 0; i--) {
            System.out.print(tesArray[i] + ", ");
        }
        System.out.println();
    }
}
