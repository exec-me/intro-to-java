package prac24.ex2;

// Интерфейс для стульев
interface Chair {
    void sit(); // Метод для сидения на стуле
}

// Конкретный класс Викторианский стул
class VictorianChair implements Chair {
    private int age; // Возраст стула

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age; // Метод для получения возраста стула
    }

    @Override
    public void sit() {
        System.out.println("Сидите на викторианском стуле, возраст: " + age + " лет.");
    }
}

// Конкретный класс Магический стул
class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Магический стул производит магию!"); // Метод для выполнения магии
    }

    @Override
    public void sit() {
        System.out.println("Сидите на магическом стуле.");
    }
}

// Конкретный класс Многофункциональный стул
class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b; // Метод для сложения двух чисел
    }

    @Override
    public void sit() {
        System.out.println("Сидите на многофункциональном стуле.");
    }
}

// Интерфейс Абстрактная фабрика для стульев
interface AbstractChairFactory {
    VictorianChair createVictorianChair();    // Создание викторианского стула
    MagicChair createMagicChair();             // Создание магического стула
    FunctionalChair createFunctionalChair();   // Создание многофункционального стула
}

// Конкретная фабрика для стульев
class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(100); // Пример возраста стула
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

// Класс клиент, использующий интерфейс Chair
class Client {
    private Chair chair; // Хранит текущий стул

    public void sit() {
        if (chair != null) {
            chair.sit(); // Метод для сидения на стуле
        } else {
            System.out.println("Стул не установлен.");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair; // Устанавливает стул
    }
}

// Демонстрация работы
public class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory(); // Создание фабрики
        Client client = new Client();

        // Викторианский стул
        Chair victorianChair = factory.createVictorianChair();
        client.setChair(victorianChair);
        client.sit(); // Сидеть на викторианском стуле

        // Магический стул
        Chair magicChair = factory.createMagicChair();
        client.setChair(magicChair);
        client.sit(); // Сидеть на магическом стуле
        ((MagicChair) magicChair).doMagic(); // Вызов метода магии

        // Многофункциональный стул
        Chair functionalChair = factory.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit(); // Сидеть на многофункциональном стуле
        int sum = ((FunctionalChair) functionalChair).sum(5, 10); // Сложение
        System.out.println("Сумма: " + sum);
    }
}