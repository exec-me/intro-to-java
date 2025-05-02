///1. Доработайте предыдущее задание, так что бы выражение строилось
/// по записи вида x * (y - 2)*z + 1
/// 2. Для этого реализуйте класс ExpressionParser с методом
/// TripleExpression parse(String).
/// 3. В записи выражения могут встречаться: умножение *, деление /,
/// сложение +, вычитание -, унарный минус -, целочисленные константы
/// (в десятичной системе счисления, которые помещаются в 32-битный
/// знаковый целочисленный тип), круглые скобки, переменные (x, y и z)
/// и произвольное число пробельных символов в любом месте (но не
/// внутри констант).
/// 4. Приоритет операторов, начиная с наивысшего
/// • унарный минус;
/// • умножение и деление;
/// • сложение и вычитание.
package prac23.Ex4;

public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new ExpressionParser();
        TripleExpression expr;
        try {
            expr = parser.parse("1000000*x*x*x*x*(x-1)");
        } catch (IllegalArgumentException e) {
            System.out.println("Parsing error: " + e.getMessage());
            return;
        }

        System.out.println("x\tf");
        for (int x = 0; x <= 10; x++) {
            try {
                int result = expr.evaluate(x, 0, 0);
                System.out.println(x + "\t" + result);
            } catch (ArithmeticException e) {
                System.out.println(x + "\t" + e.getMessage());
            }
        }
    }
}
