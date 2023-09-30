package home_work_13;

public class HomeWork_13_Task1 {
    public static void main(String[] args) {
        powTwo(-2);
    }

    public static void powTwo(int x) {

        boolean isPositive = x >= 0;
        if (x < 0) {
            x *= -1;
        }

        int result = 1;
        for (int i = 0; i < x; i++) {
            result *= 2;
        }
        if (isPositive) {
            System.out.println(result);
        } else {
            System.out.printf("%.2f", (double) 1 / result);
        }
    }
}
