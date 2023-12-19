package home_work_67;

/**
 * Created by Volodymyr Sh on 19.12.2023
 * project name: AIT_HomeWorks
 */
public class PrinterABC_V1 {
    /*  Task 1:
        Разработать многопоточное приложение, где три различных потока печатают три разные буквы
        (например, 'A', 'B', 'C') в строгом порядке ABC по 20 раз.
        Создайте три потока - Каждый поток отвечает за печать определенной буквы
        ('A', 'B' или 'C'). - Все три потока запускаются одновременно.

        Синхронизация печати: - Необходимо синхронизировать потоки таким образом,
        чтобы они печатали свои буквы в последовательности ABC.
        То есть, сначала печатается 'A', затем 'B', затем 'C', и цикл повторяется.
        - Последовательность ABC должна повториться 20 раз.
    */

    private final static int LETTERS_COUNT = 20;
    private volatile int status = 0;
    private final Object lock = new Object();


    public static void main(String[] args) {
        PrinterABC_V1 flow = new PrinterABC_V1();

        Thread thread1 = new Thread(flow::printA);

        Thread thread2 = new Thread(flow::printB);

        Thread thread3 = new Thread(flow::printC);

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public void printA() {
        for (int i = 0; i < LETTERS_COUNT; i++) {
            synchronized (lock) {
                while (status != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    System.out.print("A");
                    status = 1;
                }finally {
                    lock.notifyAll();
                }

            }
        }
    }

    private void printB() {
        for (int i = 0; i < LETTERS_COUNT; i++) {
            synchronized (lock) {
                while (status != 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    System.out.print("B");
                    status = 2;
                }finally {
                    lock.notifyAll();
                }

            }
        }
    }

    private void printC() {
        for (int i = 0; i < LETTERS_COUNT; i++) {
            synchronized (lock) {
                while (status != 2) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    System.out.print("C\n");
                    status = 0;
                }finally {
                    lock.notifyAll();
                }

            }
        }
    }
}
