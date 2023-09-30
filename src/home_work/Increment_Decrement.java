package home_work;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x = 3;
        // Increment

        //x++; - post Increment
        // ++x; - pre Increment
        System.out.println("Строка 10: " + x++ + x++);

        // Decrement

        // x--; - post Decrement;
        // --x; - pre Decrement;
        x--;
        System.out.println("Строка 17: " + x);

        // Сокращенные формы записи

        int y = 10;

        y +=5; // y = y + 5;
        System.out.println(y);

        y -= 8; // y = y - 8;
        System.out.println(y);

        y *=2; // y = y * 2;
        System.out.println(y);

        y /=3; // y = y / 3;
        System.out.println(y);

        y %=5; // y = y % 5;
        System.out.println(y);



    }
}
