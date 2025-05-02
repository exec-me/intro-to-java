package prac22.Ex1;

public class RPNCalculatorTest {
    public static void main(String[] args) {
        RPNCalculator calc = new RPNCalculator(10);

        System.out.println("2 3 + = " + calc.evaluate("2 3 +")); // 5.0
        System.out.println("2 3 * 4 5 * + = " + calc.evaluate("2 3 * 4 5 * +")); // 26.0
        System.out.println("2 3 4 5 6 * + - / = " + calc.evaluate("2 3 4 5 6 * + - /")); // -0.06451612903225806
    }
}