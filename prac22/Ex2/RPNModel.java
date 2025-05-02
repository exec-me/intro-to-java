package prac22.Ex2;

public class RPNModel {
    private RPNCalculator calculator;

    public RPNModel() {
        calculator = new RPNCalculator(10);
    }

    public double evaluate(String expression) {
        return calculator.evaluate(expression);
    }
}
