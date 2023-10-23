package home_work_32;

public class MyLinkedList<T> implements MyList<T>, Queue<T> {
    private int size;

    private Node<T> first;
    private Node<T> last;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // interface MyList =========================================
    @Override
    // метод добавляет элемент в конец списка
    public void add(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            first.next = last;
        } else {
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

    @Override
    // метод добавляет список элементов в конец списка
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    // метод выводит размер (количество элементов) коллекции
    public int size() {
        return size;
    }

    @Override
    // метод возвращает первое вхождение значения в коллекции
    public int indexOf(T value) {
//        Начало в методе lastIndexOf (↓)
//        ... тут проверки (size == 0) мы не делаем и в итоге
//        результат тот же как и в lastIndexOf -> return -1;

        int index = 0;
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index++;
            cursor = cursor.next;
        }
        return -1;
    }

    @Override
    // метод возвращает последнее вхождение значения в коллекции
    public int lastIndexOf(T value) {
//      Нужна ли проверка валидности в данном случае?
//      Если список пустой, то cursor == null
//      и мы перемещаемся в конец метода -> на return -1;

//        if (size == 0) {
//            return -1;
//        }

        int index = size - 1;
        Node<T> cursor = last;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index--;
            cursor = cursor.previous;
        }
        // обрабатывает если в массиве только 1 элемент
        if (size == 1) {
            if (first.value.equals(value)) {
                return 0;
            }
        }
        return -1;
    }

    // данный вариант не предпочтительный так как перебираем коллекцию до конца
    public int indexOfV2(T value) {
        int result = -1;
        int index = 0;
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                result = index;
            }
            index++;
            cursor = cursor.next;
        }
        return result;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    /*TODO - вопрос по приведению типов.
    В main при записи String [] strNew = str.toArray();
    возникает ошибка - ClassCastException.
     */
    @Override
    public T[] toArray() {

        T[] result = (T[]) new Object[size];
        Node<T> cursor = first;
        int index = 0;
        while (cursor != null) {
            result[index] = cursor.value;
            cursor = cursor.next;
            index++;
        }
        return result;
    }

    // todo - реализовать
    public boolean remove(T value) {
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }

        // возможно ли переопределять методы из разных interface?
        if (index == 0) {
            removeFirst();
        }

        if (index == size - 1) {
            removeLast();
        }

        Node<T> cursor = first;

        if (size >= 3) {
            while (index != 0) {
                index--;
                cursor = cursor.next;
            }
            cursor.previous.next = cursor.next;
            cursor.next.previous = cursor.previous;

//            Node<T> tempPrev = cursor.previous;
//            Node<T> tempNext = cursor.next;
//            tempPrev.next = cursor.next;
//            tempNext.previous = cursor.previous;

        }
        return cursor.value;
    }

    @Override
    //  Метод - отвечает на вопрос, является ли коллекция пустой.
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        Node<T> cursor = first;
        while (index != 0) {
            index--;
            cursor = cursor.next;
        }
        return cursor.value;
    }


    // ============================= interface Queue ===============================

    @Override
    public void addLast(T value) {
        addLast(value);
    }

    @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }

    @Override
    public T getFirst() {
        return (first == null ? null : first.value);
    }

    @Override
    public T getLast() {
        T value = null;
        if (last != null) {
            value = last.value;
        } else if (first != null) {
            value = first.value;
        }
        return value;
    }

    @Override
    // Удаляет первый элемент списка
    public T remove() {
        if (size == 0) return null;
        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    @Override
    public T removeFirst() {
        return remove();
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;
        T value;
        if (size == 1) {
            value = first.value;
            first = null;
        } else if (size == 2) {
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }
        size--;
        return value;
    }

    // класс создает "ячейки"
    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }


        public String toString() {
            return "Node{" +
                    "previous = " + (previous != null ? previous.value : "null") +
                    ", value = " + (value != null ? value : "null") +
                    ", next = " + (next != null ? next.value : "null") +
                    '}';
        }
    }
}
