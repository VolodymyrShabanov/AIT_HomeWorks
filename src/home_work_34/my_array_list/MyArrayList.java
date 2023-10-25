package home_work_34.my_array_list;
/*
@date 18.10.2023 - (last version HW 30) - lesson 31 !!!
@author Sergey Bugaienko
*/

import home_work_30.teacher.MyList;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>, Iterable<T> {
    private T[] array;
    private int cursor;
    static final int MULTIPLIER = 2;


    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    public MyArrayList(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int count;

        @Override
        public boolean hasNext() {
            return count < cursor;
        }

        @Override
        public T next() {
            // option 1
            return array[count++];

            // option 2
//            T value = array[count];
//            count++;
//            return value;
        }
    }

    @Override
    public void add(T number) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor++] = number;
    }

    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0; //пере используем уже написанный код (метод)
    }

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        remove(index);
        return index >= 0;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > cursor - 1) return null;
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

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > cursor - 1) return null;
        return array[index];
    }

    @Override
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


    public int getCursor() {
        return cursor;
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

