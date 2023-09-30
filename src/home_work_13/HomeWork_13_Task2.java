package home_work_13;

public class HomeWork_13_Task2 {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        copyOfArray(array, 10);
    }
    public static void copyOfArray(int[] ints, int newLength) {
        int[] result = new int [newLength];

        //int shotestLength = (newLength < ints.length) ? newLength : ints.length;

        for (int i = 0; i <ints.length && i < newLength ; i++) {
            result[i] = ints[i];
        }

        printArray(result);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1)? ", " : "]\n"));

        }
    }
}
