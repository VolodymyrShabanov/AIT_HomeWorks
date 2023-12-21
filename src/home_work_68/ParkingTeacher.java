package home_work_68;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Volodymyr Sh on 20.12.2023
 * project name: AIT_HomeWorks
 */
public class ParkingTeacher {
    /*  Task 1: Парковка
        Создать многопоточное приложение для симуляции работы парковки
        с учетом различного времени пребывания автомобилей и ведения статистики.

        - Создайте парковку на 5 мест.
        - Напишите код для 10 потоков, где каждый поток представляет собой автомобиль, который пытается припарковаться.
        - Организовать контроль доступа к парковочным местам. При отсутствии свободных мест автомобиль должен ожидать.
        - Каждый автомобиль должен проводить на парковке случайное количество времени от 3 до 10 секунд.
        - Программа должна учитывать общее время, проведенное всеми автомобилями на парковке.
        - По завершении работы всех потоков программа должна рассчитать
        и вывести среднее время пребывания одного автомобиля на парковке.
        - В консоль должны выводиться сообщения о:
            - приезде автомобиля;
            - его парковке;
            - времени пребывания на парковке;
            - и уезде;
    */
    private final static int PLACES = 5;
    private final static boolean[] PARKING_PLACES = new boolean[PLACES];
    private final static Semaphore SEMAPHORE = new Semaphore(PLACES, true);
    private final static AtomicInteger totalParkingTime = new AtomicInteger();
    private final static int CARS_COUNT = 10;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Total parking time of all cars: " + totalParkingTime.get());
            System.out.println("Average parking time per car: " + totalParkingTime.doubleValue() / CARS_COUNT);
        }));

    }

    public static void main(String[] args) {
        for (int i = 0; i < CARS_COUNT; i++) {
            new Thread(new Car(i)).start();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(300, 601));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    } // main


    public static class Car implements Runnable {
        private final int carId;

        public Car(int carId) {
            this.carId = carId;
        }

        @Override
        public void run() {
            System.out.printf("(d) Auto number: %d drove up to parking\n", carId);

            try {
                SEMAPHORE.acquire();
                System.out.printf("(p) Auto number: %d pulled into the parking\n", carId);
                int place = takePlace();
                int sleepTime = ThreadLocalRandom.current().nextInt(3_000, 10_000);

                System.out.printf("- Auto number: %d, parked in place: %d.\n- Current time: %d\n", carId, place, sleepTime);
                Thread.sleep(sleepTime);

                totalParkingTime.addAndGet(sleepTime);
                leavePlace(place);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                SEMAPHORE.release();
            }

        }

        private void leavePlace(int place) {
            synchronized (PARKING_PLACES) {
                PARKING_PLACES[place] = false;
                System.out.printf("(l) Auto number %d left place: %d\n", carId, place);

            }
        }

        private int takePlace() {
            synchronized (PARKING_PLACES) {
                for (int i = 0; i < PARKING_PLACES.length; i++) {
                    if (!PARKING_PLACES[i]) {
                        PARKING_PLACES[i] = true;
                        System.out.printf("(t) Auto number %d take place: %d\n", carId, i);
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}