package home_work_28_practice;

public class MainDictionatry {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println(dictionary);
        dictionary.put("Hello", "Привет");
        dictionary.put("Bye", "Пока");
        dictionary.put("Java", "Java");
        System.out.println("Печатаем словарь: " + dictionary);
        System.out.println("Количество строек: " + dictionary.getCounter());
        System.out.println("Перевод слова: " + dictionary.get("Hello"));
        String[] words = {"Hello", "Bye", "Java"};

        Dictionary.Translator translator = dictionary.new Translator();

        translator.translate(words);
        System.out.println(translator);


    }
}
