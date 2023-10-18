package home_work_30;

import java.util.Arrays;
import java.util.Random;

public class RubberArrayGenerics<T> {
    private T[] array;
    private int cursor;
    static final int MULTIPLIER = 2;

    Random random = new Random();

    public RubberArrayGenerics() {
        array = (T[]) new Object[10];
    }

    public RubberArrayGenerics(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    public void add(T value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor++] = value;
    }

    public void add(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    private void expandArray() {
//        int[] newArray = Arrays.copyOf(array, array.length * 2);
        T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        if (cursor == 0) return "[]";  // правка - вывод когда длина массива равна нулю
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    public int length() {
        return cursor;
    }

    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void trim() {
        array = toArray();
    }

    public T removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) {  //return Integer.MIN_VALUE;
            // тут не знаю что можно придумать поэ тому использую throw
            throw new IllegalArgumentException("Некорректный индекс");
        }
        T value = array[index];

        T[] result = (T[]) new Object[array.length - 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else { // i >= index
                result[i] = array[i + 1];
            }
        }

        cursor--;
        array = result;
        return value;
    }

}



/*
-+ 1. Динамическое изменение размера массива
-- 2. Добавление элемента (значения) в массив
-- 9. Добавлять в массив сразу несколько элементов
-- 3. Поиск значений в массиве
-- 3.1. Поиск последнего вхождения элемента
-- 4. Удаление элемента по значению из массива
-- 5. Удаление элемента по индексу из массива
6. Найти мин, макс, среднее, сумму элементов
-- 7. Количество элементов в массиве
-- 8. Строковое представление массива (для вывода в консоль, например)
-- 10. Добавить в массив Х случайных значений
-- 11. Добавить в массив Х случайных значений в диапазоне от 0 до У;
-- 12. Вернуть наш резиновый массив в виде обычного массива
*/



