package prac18.ex6;

public class ThrowsDemo {

    // Метод для вывода сообщения, полученного по ключу
    public void printMessage(String key) {
        // Получаем строку с деталями по ключу
        String message = getDetails(key);
        // Выводим полученное сообщение на экран
        System.out.println(message);
    }

    // Метод, возвращающий строку с деталями по ключу
    public String getDetails(String key) {
        // Проверка, что ключ не равен null
        if(key == null) {
            // Если ключ равен null, выбрасывается исключение NullPointerException
            throw new NullPointerException("null key in getDetails");
        }
        // Возвращается строка с данными для заданного ключа
        return "data for " + key;
    }

    // Главный метод, точка входа в программу
    public static void main(String[] args) {
        // Создание экземпляра класса ThrowsDemo
        ThrowsDemo t = new ThrowsDemo();

        // Вызов метода printMessage с корректным ключом
        t.printMessage("validKey");

        // Вызов метода printMessage с null, обработка возможного исключения
        try {
            t.printMessage(null);
        } catch (NullPointerException e) {
            // Обработка исключения: вывод сообщения об ошибке
            System.out.println(e.getMessage());
        }
    }
}
