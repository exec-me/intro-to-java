///Написать обобщенный класс MinMax, который содержит
/// методы для нахождения минимального и максимального элемента
/// массива. Массив является переменной класса. Массив должен
/// передаваться в класс через конструктор. Написать класс Калькулятор
/// (необобщенный), который содержит обобщенные статические методы -
/// sum, multiply, divide, subtraction. Параметры этих методов - два числа
/// разного типа, над которыми должна быть произведена операция
package prac20.MinMax;

public class MinMaxCalculatorTest {
    public static void main(String[] args) {
        // Тестирование MinMax
        Integer[] numbers = {5, 2, 9, 1, 7, 6, 3};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Минимальный элемент: " + minMax.findMin());
        System.out.println("Максимальный элемент: " + minMax.findMax());

        // Тестирование Calculator
        System.out.println("Сумма: " + Calculator.sum(10, 5.5));
        System.out.println("Умножение: " + Calculator.multiply(4, 3.2));
        System.out.println("Деление: " + Calculator.divide(10, 2));
        System.out.println("Вычитание: " + Calculator.subtraction(15.5, 10));
    }
}
