
package home_work_18;

import java.util.Random;

public class RubberArray_my {
    int[] array;
    int cursor;

    Random random = new Random();

    public RubberArray_my() { // конструктор - создает массив на 4 элемента
        array = new int[4];
    }

    public RubberArray_my(int sizeDefault) { // перегрузка конструктор - создает массив n кол-во элементов.
        array = new int[sizeDefault];
    }

    void add(int number) { // метод - добавление элемента в конец массива
        if (cursor >= array.length * 0.9) { // правка - добавил "=" для проверки условия когда длина массива равна нулю
            expandArray();
        }
        array[cursor++] = number;
    }

    void add(int... ints) { // перегрузка метода - добавление n элементов - "..." -> Java varargs (variable arguments)
        /* можем обращаться ка с массивом
        for (int i = 0; i < ints.length; i++) {
            ints[i];
        }
         */
        for (int value : ints) {
            add(value);
        }
    }

    void expandArray() { // метод - расширение массива
//        встроенный функционал создает новы массив и копирует в него данные предыдущего
//        int[] newArray = Arrays.copyOf(array, array.length * 2);
        int[] newArray = new int[array.length * 2 + 1]; // правка - добавил "+1" для условия когда длина массива равна нулю
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    void addRandomValues(int count, int bound) { // метод - добавления Х случайных значений bound (диапазон) = от 0 до У;
        for (int i = 0; i < count; i++) {
            add(random.nextInt(bound));

        }
    }

    void addRandomValues(int count) { // перегрузка метода - добавления Х случайных значений (bound = от 0 до 100);
        addRandomValues(count, 100);
    }


    public String toString() { // метод - строковое представление массива (вывод в консоль)
        if (cursor == 0) return "[]";  // правка - вывод когда длина массива равна нулю
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    int length() { // метод - кол-во элементов в массиве
        return cursor;
    }

    int indexOf(int number) { // метод - возвращение индекса первого вхождения элемента по значению
        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    int lastIndexOf(int number) { // метод - возвращение индекса последнего вхождения элемента по значению
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    boolean contains(int value) { // метод - наличие элемента в массиве по значению
        return indexOf(value) >= 0;

    }

    int removeByIndex(int index) { // метод - удаление элемента по индексу
        if (index < 0 || index > cursor - 1) return Integer.MIN_VALUE; // ??? - почему возвращаем это, а не что то ....
        int value = array[index];

        int[] result = new int[array.length - 1];

//        for (int i = 0; i < index; i++) {
//            result[i] = array[i];
//        }
//        for (int i = index+1; i < cursor; i++) {
//            result[i-1] = array[i];
//        }

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else {
                result[i] = array[i + 1];
            }
        }

        cursor--;
        array = result;
        return value;
    }


    boolean remove(int value) { // метод - удаление элемента по значению
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    int[] toArray() { // метод - возвращает RubberArray в виде обычного массива
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];

        }
        return result;
    }

    void trim() { // метод - обрезает RubberArray до длины - cursor - обычного массива
        array = toArray();
    }

//    int lengthOllElements() { // метод - полная длина RubberArray включая 0-е элементы
//        return array.length;
//    }


    // ========================= Home Work ====================================

    /*
1 - Возвращение значения по индексу;
2 - Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями;
3 - Замена значения по индексу (есть индекс и новое значение);
4 - Замена значения по значению (есть старое и новое значение);
5 - Найти мин, макс, среднее, сумму элементов;
 */


    int numberOf(int index) { // возвращение значения по индексу
        if (index < 0 || index > cursor - 1) return Integer.MIN_VALUE; // ??? - почему возвращаем это, а не что то ....
        return array[index];
    }

    // перегрузка Конструктор, принимающий в себя обычный массив
    // и создающий RubberArray с такими же значениями;
    public RubberArray_my(int[] ints) {
        array = new int[ints.length];
        for (int number : ints) {
            array[cursor++] = number;
        }
    }

    void changeValueByIndex(int index, int valueNew) {
        if (index < 0 || index > cursor - 1) return; // ?????
        array[index] = valueNew;
    }

    void changeValueByValue(int valueOld, int valueNew) {
        changeValueByIndex(indexOf(valueOld), valueNew);
    }

    int minValue() {
        if (cursor == 0) return 0;
        int min = array[0];
        for (int i = 0; i < cursor; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    int maxValue() {
        if (cursor == 0) return 0;
        int max = array[0];
        for (int i = 0; i < cursor; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    int summValue() {
        int summ = 0;
        for (int i = 0; i < cursor ; i++) {
            summ += array[i];
        }
        return summ;
    }

    int averageValue() {
        if (cursor == 0) return 0;
        return summValue() / cursor;
    }

}




