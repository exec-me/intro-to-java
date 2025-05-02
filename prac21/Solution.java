package prac21; ///Реализуйте вспомогательные методы в классе prac21.Solution,
/// которые должны создавать соответствующую коллекцию и помещать туда
/// переданные объекты. Методы newArrayList, newHashSet параметризируйте
/// общим типом T. Метод newHashMap параметризируйте парой <K, V>, то
/// есть типами К- ключ и V-значение. Аргументы метода newHashMap
/// должны принимать. Класс содержит три переменные типа (T, V, K),
/// конструктор, принимающий на вход
import java.util.*;

public class Solution {

    /**
     * Метод создаёт новый ArrayList из произвольного количества переданных элементов.
     *
     * @param elements элементы, которые будут добавлены в список
     * @param <T> тип элементов
     * @return ArrayList, содержащий переданные элементы
     */
    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        // Добавляем все элементы в список
        Collections.addAll(list, elements);
        return list;
    }

    /**
     * Метод создаёт новый HashSet из произвольного количества переданных элементов.
     *
     * @param elements элементы, которые будут добавлены во множество
     * @param <T> тип элементов
     * @return HashSet, содержащий переданные элементы (без повторов)
     */
    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        // Добавляем все элементы во множество (автоматически убираются повторы)
        Collections.addAll(set, elements);
        return set;
    }

    /**
     * Метод создаёт HashMap из двух списков: ключей и значений.
     *
     * @param keys список ключей
     * @param values список значений
     * @param <K> тип ключей
     * @param <V> тип значений
     * @return HashMap, сопоставляющий ключи и значения
     * @throws IllegalArgumentException если размеры списков не совпадают
     */
    public static <K, V> HashMap<K, V> newHashMap(List<K> keys, List<V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Количество ключей и значений должно совпадать");
        }
        HashMap<K, V> map = new HashMap<>();
        // Заполняем мапу по парам ключ-значение
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    // Точка входа — демонстрация работы всех трёх методов
    public static void main(String[] args) {
        // Тест метода newArrayList
        ArrayList<String> list = newArrayList("A", "B", "C");
        System.out.println("ArrayList: " + list); // Ожидается: [A, B, C]

        // Тест метода newHashSet
        HashSet<Integer> set = newHashSet(1, 2, 2, 3);
        System.out.println("HashSet: " + set); // Ожидается: [1, 2, 3] (порядок может отличаться)

        // Тест метода newHashMap
        List<String> keys = Arrays.asList("key1", "key2", "key3");
        List<Integer> values = Arrays.asList(10, 20, 30);
        HashMap<String, Integer> map = newHashMap(keys, values);
        System.out.println("HashMap: " + map); // Ожидается: {key1=10, key2=20, key3=30}
    }
}

