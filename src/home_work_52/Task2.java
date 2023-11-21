package home_work_52;

import java.util.function.Function;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2 {
    /*  Создайте цепочку функций, которая:
        - сначала удаляет пробелы из строки;
        - затем преобразует её в верхний регистр;
        - и в конце считает количество символов в измененной строке
     */

    public static void main(String[] args) {
        String stringStart = "Создайте цепочку функций, которая: ";

        Function<String, String> deleteSpaces = string -> string.replaceAll("\\s+", "");
        //System.out.println(deleteSpaces.apply(stringStart));

        Function<String, String> getToUpperCase = String::toUpperCase;
        //System.out.println(getToUpperCase.apply(stringStart));

        Function<String, Integer> numberCharacters = string -> string.length();
        //System.out.println(numberCharacters.apply(stringStart));

        Function<String, Integer> combinedFunction = deleteSpaces.andThen(getToUpperCase).andThen(numberCharacters);
        System.out.println(combinedFunction.apply(stringStart));

    }

}
