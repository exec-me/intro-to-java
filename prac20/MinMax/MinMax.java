package prac20.MinMax;

// Обобщённый класс MinMax, параметризованный типом T,
// который должен реализовывать интерфейс Comparable<T>
public class MinMax<T extends Comparable<T>> {
    private T[] array; // Массив элементов обобщённого типа

    // Конструктор, принимающий массив
    public MinMax(T[] array) {
        // Проверка на null и пустоту
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }
        this.array = array;
    }

    // Метод для поиска минимального элемента в массиве
    public T findMin() {
        T min = array[0]; // Предполагаем, что первый — минимальный
        for (T element : array) {
            // Если текущий элемент меньше текущего минимума — обновляем min
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min; // Возвращаем минимальный элемент
    }

    // Метод для поиска максимального элемента в массиве
    public T findMax() {
        T max = array[0]; // Предполагаем, что первый — максимальный
        for (T element : array) {
            // Если текущий элемент больше текущего максимума — обновляем max
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max; // Возвращаем максимальный элемент
    }
}

