package prac22.Ex1;

public class Stack<T> {
    private Object[] arr;    // Массив для хранения элементов стека
    private int top;         // Индекс вершины стека
    private int capacity;    // Максимальная вместимость стека

    /**
     * Конструктор: инициализация стека заданного размера
     *
     * @param size размер стека
     */
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        arr = new Object[size]; // Дженериковые массивы напрямую нельзя создавать
        capacity = size;
        top = -1; // Стек изначально пуст
    }

    /**
     * Добавляет элемент на вершину стека
     *
     * @param x элемент для добавления
     */
    public void push(T x) {
        if (isFull()) {
            throw new IllegalStateException("Stack Overflow"); // Проверка на переполнение
        }
        arr[++top] = x; // Увеличиваем индекс вершины и вставляем элемент
    }

    /**
     * Удаляет и возвращает верхний элемент стека
     *
     * @return элемент с вершины
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Проверка на пустоту
        }
        T value = (T) arr[top];  // Приведение типа
        arr[top--] = null;       // Удаляем элемент и уменьшаем вершину
        return value;
    }

    /**
     * Проверка, пуст ли стек
     *
     * @return true, если пустой, иначе false
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Проверка, полон ли стек
     *
     * @return true, если заполнен, иначе false
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Возвращает текущее количество элементов в стеке
     *
     * @return размер стека
     */
    public int size() {
        return top + 1;
    }
}

