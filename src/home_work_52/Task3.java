package home_work_52;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.function.BiConsumer;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_HomeWorks
 */
public class Task3 {
    /*  Напишите BiConsumer, который принимает ключ и значение,
        а затем печатает их в формате "ключ=значение
    */

    public static void main(String[] args) {

        BiConsumer<Integer, String> biConsumer = ((key, value) -> System.out.println(key + "=" + value));
        biConsumer.accept(23, "twenty three");

    }
}
