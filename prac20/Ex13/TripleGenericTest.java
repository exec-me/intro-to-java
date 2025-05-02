///1. Создать обобщенный класс с тремя параметрами (T, V, K).
/// 2. Класс содержит три переменные типа (T, V, K), конструктор,
/// принимающий на вход параметры типа (T, V, K), методы возвращающие
/// значения трех переменных. Создать метод, выводящий на консоль имена
/// классов для трех переменных класса.
/// 3. Наложить ограничения на параметры типа: T должен
/// реализовать интерфейс Comparable (классы оболочки, String), V должен
/// реализовать интерфейс Serializable и расширять класс Animal, K
package prac20.Ex13;

public class TripleGenericTest {
    public static void main(String[] args) {
        // Создаём экземпляр TripleGeneric с типами:
        // T: String (сравнимый тип),
        // V: Dog (должен наследовать Animal и реализовывать Serializable),
        // K: Integer (без ограничений)
        TripleGeneric<String, Dog, Integer> triple =
                new TripleGeneric<>("Hello", new Dog("Buddy"), 42);

        // Вывод значения поля T
        System.out.println("T: " + triple.getT());

        // Вывод значения поля V (объект Dog)
        System.out.println("V: " + triple.getV());

        // Вывод значения поля K
        System.out.println("K: " + triple.getK());

        // Вывод имён классов объектов, сохранённых в полях
        triple.printClassNames();
    }
}

