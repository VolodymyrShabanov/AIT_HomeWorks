package home_work_18;

import java.sql.SQLOutput;

public class Doggy {
    String name;
    int jump;
    int maxJump;

    public Doggy (String name, int jump){
        this.name = name;
        this.jump = jump;
        maxJump = jump * 2;
    }

    String whoAmI(){
        return "I am doggy: " + name + ", I'am jumping to heights: " + jump + " (sm)";
    }

    void jumping () {
        System.out.println("Я перепрыгиваю через барьер высотой: " + jump + " (см)");
    }

    void train() {
        jump += 10;
        if (jump >= maxJump) {
            jump = maxJump;
            System.out.println("Это максимальная высота прыжка: " + maxJump + " (см)");
        } else {
            System.out.println("Теперь я могу прыгнуть на: " + jump + " (см)");
        }
    }

    void takeTheBarrier (int barrier, int jump) {
        System.out.println("--> Высота барьера: " + barrier);
        if (jump >= barrier) {
            jumping();
        } else if (maxJump >= barrier) {
            System.out.println("Я могу перепрыгнуть барьер. Пойдем тренироваться.");
            train();
        } else{
            System.out.println("Я не могу прыгнуть так высоко, даже тренировки мне не помогут.");
        }


    }


}
