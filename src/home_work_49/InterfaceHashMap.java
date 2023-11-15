package home_work_49;

import java.util.Collection;
import java.util.Set;

public interface InterfaceHashMap<K, V> {
    // Положить в карту пару ключ-значение. Если ключ уже существует - обновить значение;
    V put(K key, V value);

    // Взять из карты значение, соответствующее ключу. Если ключ отсутствует - возвращает null;
    V get(Object key);

    V remove(Object key);

    int size();

    boolean isEmpty();
    boolean containsKey(K key);
    void clear();
    Set<K> keySet();
    Collection<V> values();
    V getOrDefault(Object key, V defaultValue);
}