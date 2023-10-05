package home_work_21;

public class Doggy {

    static final boolean TRAININGABILITY = true;
    private static int counterJump;
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;
    private int increasePerOneTraining;


    public Doggy(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.increasePerOneTraining = 10;
        this.maxJumpHeight = jumpHeight * 2;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getIncreasePerOneTraining() {
        return increasePerOneTraining;
    }

    public void setIncreasePerOneTraining(int increasePerOneTraining) {
        this.increasePerOneTraining = increasePerOneTraining;
    }

    public String whoAmI() {
        return "I am doggy: " + name + ", I'am jumping to heights: " + jumpHeight + " (sm).";
    }

    public void jumping() {
        System.out.println("Собака " + name + " прыгнула!");
        counterJump++;
    }

    public static int getCounterJump() {
        return counterJump;
    }

    public void train() {

        if (jumpHeight < maxJumpHeight || TRAININGABILITY) {
            jumpHeight += increasePerOneTraining;
            System.out.println("Собака " + name + " потренировалась и теперь может прыгнуть на: " + jumpHeight + " (см).");
        }

        if (jumpHeight >= maxJumpHeight) {
            jumpHeight = maxJumpHeight;
            System.out.println("Это максимальная высота прыжка: " + maxJumpHeight + " (см).");
        }
    }

    public boolean takeTheBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            jumping();
            return true;
        }

        if (maxJumpHeight >= barrier) {
            System.out.println("Собака " + name + " сможет взять барьер высотой " + barrier + " (см) и идет тренироваться.");
            while (jumpHeight < barrier) {
                train();
            }
            jumping();
            System.out.printf("Собака %s перепрыгивает барьер: %d (см)\n", name, barrier);
            System.out.println("Текущий прыжок: " + jumpHeight);
            return true;

        } else {
            System.out.printf("Барьер высотой %d (см) собака %s взять не может!\n", barrier, name);
            System.out.println("Текущий прыжок: " + jumpHeight + " (см)");
            return false;
        }

    }

    // это для себя (перенес в метод) что бы проверить несколько собак (как проходят массив из барьеров)
        public void barrierCounterPassed(int[] barriers) {
            int countPassed = 0;
            for (int barrirer : barriers) {
                System.out.println("Новый барьер.\n--> Высота барьера:  " + barrirer + " (см)");
                boolean isTaken = takeTheBarrier(barrirer);
                if (isTaken) countPassed++;
                System.out.println("==========================\n");
            }
            System.out.println("Собака - " + name + " преодолела " + countPassed + " барьеров.\n");
        }




}

