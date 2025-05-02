package prac22.Ex2;

import prac22.Ex1.Stack;

public class RPNCalculator {
    private Stack<Double> stack; // Стек для хранения чисел во время вычислений

    /**
     * Конструктор: создаёт калькулятор с заданной вместимостью стека
     * @param capacity максимальное количество элементов в стеке
     */
    public RPNCalculator(int capacity) {
        stack = new Stack<>(capacity);
    }

    /**
     * Вычисляет результат выражения в обратной польской нотации (RPN)
     * @param expression строка с выражением, например "3 4 +"
     * @return результат вычисления
     */
    public double evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be empty");
        }

        String[] tokens = expression.trim().split("\\s+"); // Разделение на токены по пробелам
        for (String token : tokens) {
            if (isNumeric(token)) {
                // Число — помещаем в стек
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                // Оператор — извлекаем два числа и применяем операцию
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Not enough operands for operation: " + token);
                }
                double b = stack.pop(); // Второй операнд
                double a = stack.pop(); // Первый операнд
                double result = applyOperator(a, b, token); // Применение оператора
                stack.push(result); // Результат обратно в стек
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        // После вычисления в стеке должен остаться только один элемент — результат
        if (stack.size() != 1) {
            throw new IllegalStateException("Invalid expression: too many operands");
        }
        return stack.pop();
    }

    /**
     * Проверка, является ли токен числом
     */
    private boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Проверка, является ли токен допустимым оператором
     */
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    /**
     * Применяет оператор к двум числам
     */
    private double applyOperator(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
