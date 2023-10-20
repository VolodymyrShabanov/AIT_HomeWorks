package home_work_28;

import java.util.Arrays;

public class MainDictionatry {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.put("Hello", "Привет");
        dictionary.put("Bye", "Пока");
        System.out.println(dictionary.getCounter());
        //System.out.println(dictionary.get("Hello"));

        String[] words = {"Hello", "Bye", "Java"};

        Dictionary.Translator translator = dictionary.new Translator();

        System.out.println(Arrays.toString(translator.translate(words)));

    }
}
