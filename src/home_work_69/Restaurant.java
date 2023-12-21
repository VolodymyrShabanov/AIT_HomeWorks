package home_work_69;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Volodymyr Sh on 21.12.2023
 * project name: AIT_HomeWorks
 */
public class Restaurant {
    private final static int TABLES = 5;
    private final static boolean[] LIST_TABLES = new boolean[TABLES];
    private final static Semaphore SEMAPHORE_TABLES = new Semaphore(TABLES, true);
    private final static int ORDERS = 3;
    private final static Semaphore SEMAPHORE_ORDERS = new Semaphore(ORDERS, true);
    private final static AtomicLong totalServiceTime = new AtomicLong();
    private final static int VISITORS_COUNT = 30;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            System.out.println("Общее время обслуживания: " + totalServiceTime.get());
            System.out.println("Среднее время обслуживания одного посетителя: " + (totalServiceTime.doubleValue()/VISITORS_COUNT));
        }));
    }
    public static void main(String[] args) {
        for (int i = 0; i < VISITORS_COUNT; i++) {
            new Thread(new Visitor(i)).start();

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Visitor implements Runnable {
        private final int visitorId;

        public Visitor(int visitorId) {
            this.visitorId = visitorId;
        }

        @Override
        public void run() {
            System.out.printf("Посетитель (%d) пришел в ресторан, ожидает в холе.\n", visitorId);

            try {
                SEMAPHORE_TABLES.acquire();
                long start = System.currentTimeMillis();
                int table = takeTable();
                System.out.printf("Посетитель (%d) проходит в зал и занимает столик: %d\n", visitorId, table);

                String numberOrder = makeOrder(table);
                System.out.printf("Посетитель (%d) сделал заказ.\n- Заказ номер: {%s} передается на кухню.\n", visitorId, numberOrder);

                preparingOrder(numberOrder);

                System.out.printf("Посетитель  (%d) ужинает.\n", visitorId);
                Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 4000));
                System.out.printf("Посетитель (%d) покушал и освобождает столик: %d\n", visitorId, table);
                leaveTable(table);

                long end = System.currentTimeMillis();

                totalServiceTime.addAndGet(end - start);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                SEMAPHORE_TABLES.release();
            }

        }

        private void preparingOrder(String numberOrder) {
            System.out.printf("- Заказ номер: {%s} поступил на кухню.\n", numberOrder);
            try {
                SEMAPHORE_ORDERS.acquire();
                System.out.printf("Готовим - заказ номер: {%s}\n", numberOrder);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
                System.out.printf("Заказ номер: {%s} ГОТОВ!! Отдаем посетителю.\n", numberOrder);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                SEMAPHORE_ORDERS.release();
            }
        }

        private void leaveTable(int table) {
            synchronized (LIST_TABLES) {
                LIST_TABLES[table] = false;

            }
        }

        private String makeOrder(int table) {
            Random random = new Random();
            String numberOrder = table + "/" + random.nextInt(20) + 1;
            return numberOrder;
        }

        private int takeTable() {
            synchronized (LIST_TABLES) {
                for (int i = 0; i < LIST_TABLES.length; i++) {
                    if (!LIST_TABLES[i]) {
                        LIST_TABLES[i] = true;
                        return i;
                    }
                }
            }
            return -1;
        }

    }
}
