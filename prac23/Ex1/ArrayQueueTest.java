///Реализовать очередь на массиве
/// • Найдите инвариант структуры данных «очередь». Определите
/// функции, которые необходимы для реализации очереди. Найдите их
/// пред- и постусловия.
/// • Реализуйте классы, представляющие циклическую очередь с
/// применением массива.
/// ✓ Класс ArrayQueueModule должен реализовывать один
/// экземпляр очереди с использованием переменных класса.
/// ✓ Класс ArrayQueueADT должен реализовывать очередь в виде
/// абстрактного типа данных (с явной передачей ссылки на
/// экземпляр очереди).
/// ✓ Класс ArrayQueue должен реализовывать очередь в виде класса
/// (с неявной передачей ссылки на экземпляр очереди).
/// ✓ Должны быть реализованы следующие
/// функции(процедуры)/методы:
/// ▪ enqueue – добавить элемент в очередь;
/// ▪ element – первый элемент в очереди;
/// ▪ dequeue – удалить и вернуть первый элемент в очереди;
/// ▪ size – текущий размер очереди;
/// ▪ isEmpty – является ли очередь пустой;
/// ▪ clear – удалить все элементы из очереди.
/// • Инвариант, пред- и постусловия записываются в исходном коде в
/// виде комментариев.
package prac23.Ex1;

public class ArrayQueueTest {
    private static int passedTests = 0;
    private static int totalTests = 0;

    public static void main(String[] args) {
        System.out.println("Тестирование ArrayQueueModule...");
        testArrayQueueModule();

        System.out.println("\nТестирование ArrayQueueADT...");
        testArrayQueueADT();

        System.out.println("\nТестирование ArrayQueue...");
        testArrayQueue();

        System.out.println("\nИтог: " + passedTests + "/" + totalTests + " тестов пройдено");
    }

    private static void testArrayQueueModule() {
        // Тест 1: Добавление и удаление
        test("Добавление и удаление", () -> {
            ArrayQueueModule.clear();
            ArrayQueueModule.enqueue(1);
            ArrayQueueModule.enqueue(2);
            assertEquals(2, ArrayQueueModule.size(), "Размер должен быть 2");
            assertEquals(1, ArrayQueueModule.dequeue(), "Первый элемент должен быть 1");
            assertEquals(2, ArrayQueueModule.element(), "Первый элемент после удаления должен быть 2");
        });

        // Тест 2: Проверка пустоты
        test("Проверка пустоты", () -> {
            ArrayQueueModule.clear();
            assertTrue(ArrayQueueModule.isEmpty(), "Очередь должна быть пуста");
            ArrayQueueModule.enqueue(1);
            assertFalse(ArrayQueueModule.isEmpty(), "Очередь не должна быть пуста");
        });

        // Тест 3: Переполнение
        test("Переполнение", () -> {
            ArrayQueueModule.clear();
            for (int i = 1; i <= 5; i++) {
                ArrayQueueModule.enqueue(i);
            }
            try {
                ArrayQueueModule.enqueue(6);
                fail("Должно быть выброшено исключение: очередь полна");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
        });

        // Тест 4: Ошибка при удалении из пустой очереди
        test("Удаление из пустой очереди", () -> {
            ArrayQueueModule.clear();
            try {
                ArrayQueueModule.dequeue();
                fail("Должно быть выброшено исключение: очередь пуста");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
        });
    }

    private static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT(5);

        // Тест 1: Добавление и удаление
        test("Добавление и удаление", () -> {
            ArrayQueueADT.clear(queue);
            ArrayQueueADT.enqueue(queue, 1);
            ArrayQueueADT.enqueue(queue, 2);
            assertEquals(2, ArrayQueueADT.size(queue), "Размер должен быть 2");
            assertEquals(1, ArrayQueueADT.dequeue(queue), "Первый элемент должен быть 1");
            assertEquals(2, ArrayQueueADT.element(queue), "Первый элемент после удаления должен быть 2");
        });

        // Тест 2: Проверка пустоты
        test("Проверка пустоты", () -> {
            ArrayQueueADT.clear(queue);
            assertTrue(ArrayQueueADT.isEmpty(queue), "Очередь должна быть пуста");
            ArrayQueueADT.enqueue(queue, 1);
            assertFalse(ArrayQueueADT.isEmpty(queue), "Очередь не должна быть пуста");
        });

        // Тест 3: Переполнение
        test("Переполнение", () -> {
            ArrayQueueADT.clear(queue);
            for (int i = 1; i <= 5; i++) {
                ArrayQueueADT.enqueue(queue, i);
            }
            try {
                ArrayQueueADT.enqueue(queue, 6);
                fail("Должно быть выброшено исключение: очередь полна");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
        });

        // Тест 4: Ошибка при удалении из пустой очереди
        test("Удаление из пустой очереди", () -> {
            ArrayQueueADT.clear(queue);
            try {
                ArrayQueueADT.dequeue(queue);
                fail("Должно быть выброшено исключение: очередь пуста");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
        });
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue(5);

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

        // Тест 3: Переполнение
        test("Переполнение", () -> {
            queue.clear();
            for (int i = 1; i <= 5; i++) {
                queue.enqueue(i);
            }
            try {
                queue.enqueue(6);
                fail("Должно быть выброшено исключение: очередь полна");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
        });

        // Тест 4: Ошибка при удалении из пустой очереди
        test("Удаление из пустой очереди", () -> {
            queue.clear();
            try {
                queue.dequeue();
                fail("Должно быть выброшено исключение: очередь пуста");
            } catch (IllegalStateException e) {
                assertTrue(true, "Исключение выброшено корректно");
            }
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
