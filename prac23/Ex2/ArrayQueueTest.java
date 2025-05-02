///Очередь на связанном списке
/// 4 Определите интерфейс очереди Queue и опишите его контракт.
/// 5 Реализуйте класс LinkedQueue — очередь на связном списке.
/// 6 Выделите общие части классов LinkedQueue и ArrayQueue в базовый
/// класс AbstractQueue
package prac23.Ex2;

public class ArrayQueueTest {
    private static int passedTests = 0;
    private static int totalTests = 0;

    public static void main(String[] args) {
        System.out.println("Тестирование LinkedQueue...");
        testLinkedQueue();

        System.out.println("\nИтог: " + passedTests + "/" + totalTests + " тестов пройдено");
    }

    private static void testLinkedQueue() {
        LinkedQueue queue = new LinkedQueue();

        // Тест 1: Добавление и удаление
        test("Добавление и удаление", () -> {
            queue.clear();
            queue.enqueue(1);
            queue.enqueue(2);
            assertEquals(2, queue.size(), "Размер должен быть 2");
            assertEquals(1, queue.dequeue(), "Первый элемент должен быть 1");
            assertEquals(2, queue.element(), "Первый элемент после удаления должен быть 2");
        });

        // Тест 2: Проверка пустоты
        test("Проверка пустоты", () -> {
            queue.clear();
            assertTrue(queue.isEmpty(), "Очередь должна быть пуста");
            queue.enqueue(1);
            assertFalse(queue.isEmpty(), "Очередь не должна быть пуста");
        });

        // Тест 3: Ошибка при удалении из пустой очереди
        test("Удаление из пустой очереди", () -> {
            queue.clear();
            try {
                queue.dequeue();
                fail("Должно быть выброшено исключение: очередь пуста");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 4: Ошибка при получении элемента из пустой очереди
        test("Получение элемента из пустой очереди", () -> {
            queue.clear();
            try {
                queue.element();
                fail("Должно быть выброшено исключение: очередь пуста");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 5: Очистка очереди
        test("Очистка очереди", () -> {
            queue.clear();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.clear();
            assertTrue(queue.isEmpty(), "Очередь должна быть пуста после очистки");
            assertEquals(0, queue.size(), "Размер должен быть 0 после очистки");
        });

        // Тест 6: Добавление null элемента
        test("Добавление null элемента", () -> {
            queue.clear();
            try {
                queue.enqueue(null);
                fail("Должно быть выброшено исключение: элемент не может быть null");
            } catch (IllegalArgumentException e) {
                assertTrue(true, "Исключение выброшено корректно: " + e.getMessage());
            }
        });

        // Тест 7: Многократное добавление и удаление
        test("Многократное добавление и удаление", () -> {
            queue.clear();
            for (int i = 1; i <= 10; i++) {
                queue.enqueue(i);
            }
            assertEquals(10, queue.size(), "Размер должен быть 10");
            for (int i = 1; i <= 5; i++) {
                assertEquals(i, queue.dequeue(), "Элемент " + i + " должен быть удалён");
            }
            assertEquals(5, queue.size(), "Размер должен быть 5");
            assertEquals(6, queue.element(), "Первый элемент должен быть 6");
        });
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

    private static void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) {
            throw new AssertionError(message + ", получено: " + actual);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertFalse(boolean condition, String message) {
        if (condition) {
            throw new AssertionError(message);
        }
    }

    private static void fail(String message) {
        throw new AssertionError(message);
    }
}
