package prac20.Ex13;

import java.io.Serializable;

// Обобщённый класс, принимающий три типа:
// T — должен быть Comparable с самим собой;
// V — должен быть подклассом Animal и реализовывать Serializable;
// K — без ограничений.
public class TripleGeneric<T extends Comparable<T>, V extends Animal & Serializable, K> {
    // Приватные поля для хранения объектов трёх типов
    private T t;
    private V v;
    private K k;

    // Конструктор: инициализирует все три поля
    public TripleGeneric(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    // Геттер для поля t (типа T)
    public T getT() {
        return t;
    }

    // Геттер для поля v (типа V)
    public V getV() {
        return v;
    }

    // Геттер для поля k (типа K)
    public K getK() {
        return k;
    }

    // Метод, который выводит имена классов, хранящихся в полях
    public void printClassNames() {
        System.out.println("Тип T: " + t.getClass().getName());
        System.out.println("Тип V: " + v.getClass().getName());
        System.out.println("Тип K: " + k.getClass().getName());
    }
}

