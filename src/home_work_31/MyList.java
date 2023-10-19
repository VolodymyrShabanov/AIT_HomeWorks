package home_work_31;
/*
@date 18.10.2023
@author Sergey Bugaienko
*/

public interface MyList<T> {
    void add(T value);          // Done

    void addAll(T... values);   // Done

    int size();                 // Done

    int indexOf(T value);       // Done

    int lastIndexOf(T value);   // Done

    boolean contains(T value);  // Done

    T[] toArray();              // Done

    boolean remove(T value);

    T remove(int index);

    // Отвечает на вопрос, является ли коллекция пустой.
    boolean isEmpty();              // Done

    T get(int index);               // Done


}