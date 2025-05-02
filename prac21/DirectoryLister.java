package prac21; ///Написать функцию, которая сохранит содержимое каталога в
/// список и выведет первые 5 элементов на экран
// Импорт классов для работы с файлами и коллекциями
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Класс для отображения содержимого директории
public class DirectoryLister {

    // Метод возвращает список имён файлов в указанной директории
    public static List<String> listDirectory(String path) {
        List<String> fileNames = new ArrayList<>(); // Список для хранения имён файлов
        File directory = new File(path); // Создаем объект File по указанному пути

        // Проверка, что указанный путь — это директория
        if (!directory.isDirectory()) {
            // Если не директория — выбрасываем исключение
            throw new IllegalArgumentException("Указанный путь не является каталогом: " + path);
        }

        // Получаем массив всех файлов и папок внутри директории
        File[] files = directory.listFiles();

        // Если директория не пуста, добавляем имена файлов в список
        if (files != null) {
            for (File file : files) {
                fileNames.add(file.getName()); // Добавляем имя каждого файла
            }
        }

        return fileNames; // Возвращаем список имён
    }

    // Метод выводит первые пять элементов из списка (или меньше, если в списке меньше 5)
    public static void printFirstFive(List<?> list) {
        int count = Math.min(5, list.size()); // Количество элементов для вывода — максимум 5
        System.out.println("Первые " + count + " элементов каталога:");
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i)); // Печатаем каждый элемент
        }
    }

    // Главный метод программы
    public static void main(String[] args) {
        String path = "."; // Путь по умолчанию — текущая директория

        try {
            // Получаем список файлов по заданному пути
            List<String> files = listDirectory(path);

            // Выводим первые пять файлов
            printFirstFive(files);
        } catch (IllegalArgumentException e) {
            // Обработка исключения: если путь не является директорией
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
