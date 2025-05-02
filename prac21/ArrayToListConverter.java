package prac21; ///Написать метод для конвертации массива строк/чисел в
/// список.
// Импорт класса ArrayList
import java.util.ArrayList;

// Класс для преобразования массива в список
public class ArrayToListConverter {

    // Обобщённый метод, преобразующий массив любого типа в ArrayList
    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>(); // Создаём пустой список нужного типа

        // Перебираем все элементы массива и добавляем в список
        for (T element : array) {
            list.add(element);
        }

        return list; // Возвращаем полученный список
    }

    // Главный метод — точка входа в программу
    public static void main(String[] args) {
        // Тест: преобразуем массив строк в список
        String[] stringArray = {"one", "two", "three"};
        ArrayList<String> stringList = arrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Тест: преобразуем массив целых чисел в список
        Integer[] numberArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> numberList = arrayToList(numberArray);
        System.out.println("Список чисел: " + numberList);
    }
}

