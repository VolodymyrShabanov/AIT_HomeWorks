package home_work;

public class Tests {
    public static void main(String[] args) {
        int x = 20;

        int time = 45;

        int y = x / (60 - time);
        switch (y) {
            case 0:
                time = time + x;
                break;
            default:
                time = 60;
        }

        String bukva = "Y";

        System.out.println(time);
        System.out.println((int) bukva.charAt(0));

        //
//        double result = 45 + time / x;
//
//
//        System.out.println(result);

    }
}
