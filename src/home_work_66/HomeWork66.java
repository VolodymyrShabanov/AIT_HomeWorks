package home_work_66;

/**
 * Created by Volodymyr Sh on 17.12.2023
 * project name: AIT_HomeWorks
 */
public class HomeWork66 {
    /*  Task 1:
        Напишите программу, в которой запускается одновременно два потока.
        Один поток 1000 раз увеличивает переменную counter на 1,
        а второй поток 1000 раз уменьшает туже переменную на 1.
        По завершении работы обоих потоков выведите в консоль значение переменной counter.
        Убедитесь, что оно равно 0.
    */

    public static void main(String[] args) {
        Count count = new Count();
        count.changeCounter();

        System.out.println("Main End");
    }
}

class Count {
    private int counter;


    public synchronized void changeCounter(int count) {
        counter += count;
    }

    public void changeCounter() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    changeCounter(1);
                    //counter++;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                changeCounter(-1);
                //counter--;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("counter: " + counter);
    }
}

