package home_work_49;

import org.junit.platform.engine.support.hierarchical.Node;

import java.util.*;

/**
 * Created by Volodymyr Sh on 14.11.2023
 * project name: AIT_Lessons
 */
public class MyHashMap<K, V> implements InterfaceHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
//            if (current.key == null && key == null) {
//                current.value = value;
//                return value;
//            }
//
//            if (current.key != null && current.key.equals(key)) {
//                current.value = value;
//                return value;
//            }
            if (Objects.equals(current.key, key)) {
                return value;
            }
            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        //System.out.println("Current after while: " + current);
        Node<K, V> newNode = new Node<>(key, value);

        if (current == null) {
            buckets[index] = newNode;
        } else {
            current.next = newNode;
        }

        size++;

        if (1.0 * size / capacity >= loadFactor) {
            resize();
        }
        return value;
    }

    public int getIndex(K key) {
        return key != null ? key.hashCode() & (capacity - 1) : 0;
    }

    public int getIndexObject(Object key) {
        return key != null ? key.hashCode() & (capacity - 1) : 0;
    }

    private void resize() {
        System.out.println("Пересчет карты (расширение)");

        capacity = capacity * 2;
        Node<K, V>[] newBuckets = (Node<K, V>[]) new Node[capacity];

        for (Node<K, V> node : buckets) {
            Node<K, V> current = node;

            while (current != null) {
                Node<K, V> next = current.next;
                int newIndex = getIndex(current.key);
                current.next = newBuckets[newIndex];
                newBuckets[newIndex] = current;

                current = next;
            }
        }

        buckets = newBuckets;
        System.out.println("Пересчет завершен");

    }

    @Override
    public V get(Object key) {
        int index = getIndexObject(key);

        Node<K, V> current = buckets[index];

        while (current != null) {

//            if (current.key == null && key == null) {
//                return current.value;
//            }
//
//            if (current.key != null && current.key.equals(key)) {
//                return current.value;
//            }

            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }


    @Override
    public V remove(Object key) {
        int index = getIndexObject(key);
        Node<K, V> previous = null;
        Node<K, V> current = buckets[index];

        while (current != null) {
//            if (current.key == null && key == null) {
//                if (previous == null) {
//                    buckets[index] = current.next;
//                } else {
//                    previous.next = current.next;
//                }
//                size--;
//                return current.value;
//            }
//
//            if (current.key != null && current.key.equals(key)) {
//                if (previous == null) {
//                    buckets[index] = current.next;
//                } else {
//                    previous.next = current.next;
//                }
//                size--;
//                return current.value;
//            }

            if (Objects.equals(current.key, key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }

            previous = current;
            current = current.next;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
//            if (current.key == null && key == null) {
//                return true;
//            }
//            if (current.key != null && current.key.equals(key)) {
//                return true;
//            }

            if (Objects.equals(current.key, key)) {
                return true;
            }
            current = current.next;

        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> result = new HashSet<>();

        for (Node<K, V> node : buckets) {
            while (node != null) {
                result.add(node.key);
                node = node.next;
            }
        }
        return result;
    }

    @Override
    public Collection<V> values() {
        Collection<V> result = new ArrayList<>();

        for (Node<K, V> node : buckets) {
            while (node != null) {
                result.add(node.value);
                node = node.next;
            }
        }
        return result;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        V result = get(key);
        return result != null ? result : defaultValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Node<K, V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }

        return sb.append("]").toString();
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " : " + value + "}";
        }

        public String getList() {
            Node<K, V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }
            sb.setLength(sb.length() - 2);
            return sb.append("]").toString();
        }
    }
}
