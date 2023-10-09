package home_work_21;

public class MainDog {
    public static void main(String[] args) {
        Doggy dog = new Doggy("Max", 54);
        Doggy dog1 = new Doggy("Bobbik", 65);

        int[] barriers = {50, 150, 85, 120, 107, 112};

        System.out.println(dog.whoAmI());
        dog.barrierCounterPassed(barriers);

        System.out.println(dog1.whoAmI());
        dog1.barrierCounterPassed(barriers);


        System.out.println("\nВсе собаки прыгнули: " + Doggy.totalJumpCounter() + " раз!");


    }

}
