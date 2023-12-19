package home_work_66;

/**
 * Created by Volodymyr Sh on 18.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork66Teacher {
    private static int counter;

    private static synchronized  void increment(){
        counter++;
    }

    private synchronized static void decrement(){
        counter--;
    }

    public static void main(String[] args) {
        Thread increment = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();
                }
            }
        });

        Thread decrement = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                decrement();
            }
        });

        increment.start();
        decrement.start();

        try {
            increment.join();
            decrement.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("counter: " + counter);
    }
}
