///Вычисление выражений
/// 1. Разработайте классы Const, Variable, Add, Subtract, Multiply, Divide
/// для вычисления выражений с одной переменной.
/// 2. Классы должны позволять составлять выражения вида
/// new Subtract(new Multiply(new Const(2), new
/// Variable("x")), new Const(3)).evaluate(5)
/// 3. Для тестирования программы должен быть создан класс Main,
/// который вычисляет значение выражения x
/// 2−2x+1, для x, заданного в
/// командной строке.
/// 4. При выполнение задания следует обратить внимание на:
/// • Выделение общего интерфейса создаваемых классов.
/// • Выделение абстрактного базового класса для бинарных
/// операций.
package prac23.Ex3;

public class Main {
    public static void main(String[] args) {
        // Задаём значения x в коде
        double[] xValues = {0, 1, 2, 3, 4, 5};

        // Выражение: x^2 - 2x + 1
        Expression expr = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        // Вычисляем выражение для каждого значения x
        System.out.println("Вычисление выражения x^2 - 2x + 1:");
        for (double x : xValues) {
            try {
                double result = expr.evaluate(x);
                System.out.println("x = " + x + ": " + result);
            } catch (ArithmeticException e) {
                System.out.println("x = " + x + ": " + e.getMessage());
            }
        }
    }
}
