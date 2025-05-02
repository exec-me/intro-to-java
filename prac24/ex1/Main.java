package prac24.ex1;

// Класс, представляющий комплексное число
class Complex {
    private int real; // Действительная часть
    private int image; // Мнимая часть

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return real + (image >= 0 ? "+" : "") + image + "i";
    }

    // Геттеры для получения значений
    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }
}

// Интерфейс для абстрактной фабрики
interface ComplexAbstractFactory {
    Complex createComplex(int real, int image);
}

// Конкретная фабрика, реализующая абстрактную фабрику
class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создание комплексных чисел
        Complex complex1 = factory.createComplex(2, 3);
        Complex complex2 = factory.createComplex(4, -5);

        // Вывод комплексных чисел
        System.out.println("Комплексное число 1: " + complex1);
        System.out.println("Комплексное число 2: " + complex2);
    }
}