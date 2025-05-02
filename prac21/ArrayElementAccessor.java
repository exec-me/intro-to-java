package prac21;

///Реализовать метод, который возвращает любой элемент
/// массива по индексу
// Класс для доступа к элементам массива с использованием дженериков
public class ArrayElementAccessor {

    /**
     * Универсальный метод для получения элемента массива по индексу.
     *
     * @param array массив произвольного типа T
     * @param index индекс элемента, который нужно получить
     * @param <T> тип элементов массива
     * @return элемент массива по заданному индексу
     * @throws IndexOutOfBoundsException если индекс выходит за пределы массива
     */
    public static <T> T getElement(T[] array, int index) {
        // Проверка границ индекса
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        // Возвращаем элемент по индексу
        return array[index];
    }

    // Точка входа в программу — демонстрация работы метода
    public static void main(String[] args) {
        // Тест для массива строк
        String[] strings = {"alpha", "beta", "gamma"};
        System.out.println("Элемент с индексом 1: " + getElement(strings, 1)); // Ожидается: beta

        // Тест для массива чисел с плавающей точкой
        Double[] numbers = {1.1, 2.2, 3.3};
        System.out.println("Элемент с индексом 0: " + getElement(numbers, 0)); // Ожидается: 1.1
    }
}

