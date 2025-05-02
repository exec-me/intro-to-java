// Объявление пакета (можно опустить, если не используешь пакеты явно)
package prac21.GenericArray;

// Обобщённый класс для хранения массива элементов произвольного типа T
public class GenericArrayHolder<T> {
    private T[] array; // Приватный массив элементов типа T

    // Конструктор класса, создающий массив указанного размера
    @SuppressWarnings("unchecked") // Подавляем предупреждение компилятора о небезопасном приведении типов
    public GenericArrayHolder(int size) {
        // Нельзя создать массив обобщённого типа напрямую, поэтому используем Object[] и приводим к (T[])
        this.array = (T[]) new Object[size];
    }

    // Метод для установки значения по индексу
    public void set(int index, T value) {
        // Проверка выхода за границы массива
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        array[index] = value; // Присваиваем значение элементу массива
    }

    // Метод для получения значения по индексу
    public T get(int index) {
        // Проверка выхода за границы массива
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        return array[index]; // Возвращаем значение элемента массива
    }

    // Метод для получения размера массива
    public int size() {
        return array.length;
    }
}

