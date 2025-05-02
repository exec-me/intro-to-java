package prac22.Ex1;

public class RPNCalculatorTest1 {
    private static int passedTests = 0;
    private static int totalTests = 0;

    public static void main(String[] args) {
        RPNCalculator calc = new RPNCalculator(10);
        System.out.println("Запуск тестов RPN-калькулятора...\n");

        // Тест 1: Простое сложение
        test("Тест 1: 2 3 +", () -> {
            double result = calc.evaluate("2 3 +");
            assertEquals(5.0, result, 0.0001, "Ожидалось 5.0");
        });

        // Тест 2: Сложное выражение
        test("Тест 2: 2 3 * 4 5 * +", () -> {
            double result = calc.evaluate("2 3 * 4 5 * +");
            assertEquals(26.0, result, 0.0001, "Ожидалось 26.0");
        });

        // Тест 3: Деление
        test("Тест 3: 2 3 4 5 6 * + - /", () -> {
            double result = calc.evaluate("2 3 4 5 6 * + - /");
            assertEquals(-0.064516, result, 0.0001, "Ожидалось -0.064516");
        });

        // Тест 4: Недостаточно операндов
        test("Тест 4: Недостаточно операндов (1 2 + +)", () -> {
            try {
                calc.evaluate("1 2 + +");
                fail("Должно быть выброшено исключение: недостаточно операндов");
            } catch (IllegalArgumentException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 5: Некорректный токен
        test("Тест 5: Некорректный токен (2 3 @)", () -> {
            try {
                calc.evaluate("2 3 @");
                fail("Должно быть выброшено исключение: некорректный токен");
            } catch (IllegalArgumentException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 6: Деление на ноль
        test("Тест 6: Деление на ноль (2 0 /)", () -> {
            try {
                calc.evaluate("2 0 /");
                fail("Должно быть выброшено исключение: деление на ноль");
            } catch (ArithmeticException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 7: Слишком много операндов
        test("Тест 7: Слишком много операндов (2 3 4)", () -> {
            try {
                calc.evaluate("2 3 4");
                fail("Должно быть выброшено исключение: слишком много операндов");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 8: Пустое выражение
        test("Тест 8: Пустое выражение", () -> {
            try {
                calc.evaluate("");
                fail("Должно быть выброшено исключение: пустое выражение");
            } catch (IllegalArgumentException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Итог тестов
        System.out.println("\nИтог: " + passedTests + "/" + totalTests + " тестов пройдено");
    }

    private static void test(String testName, Runnable testCase) {
        totalTests++;
        System.out.print(testName + ": ");
        try {
            testCase.run();
            System.out.println("Пройден");
            passedTests++;
        } catch (Exception e) {
            System.out.println("Провален: " + e.getMessage());
        }
    }

    private static void assertEquals(double expected, double actual, double delta, String message) {
        if (Math.abs(expected - actual) > delta) {
            throw new AssertionError(message + ", получено: " + actual);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void fail(String message) {
        throw new AssertionError(message);
    }
}
