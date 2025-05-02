package prac23.Ex1;

public class ArrayQueueModule {
    private static final int CAPACITY = 5;
    private static Object[] items = new Object[CAPACITY];
    private static int front = -1;
    private static int rear = -1;
    private static int size = 0;

    // Инвариант: 0 <= size <= CAPACITY, front/rear в [-1, CAPACITY-1], front == -1 && rear == -1 если очередь пуста

    // Предусловие: size < CAPACITY
    // Постусловие: элемент добавлен в конец, size увеличен на 1
    public static void enqueue(Object element) {
        if (size == CAPACITY) {
            throw new IllegalStateException("Queue is full");
        }
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % CAPACITY;
        items[rear] = element;
        size++;
    }

    // Предусловие: size > 0
    // Постусловие: возвращён первый элемент, очередь не изменена
    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return items[front];
    }

    // Предусловие: size > 0
    // Постусловие: первый элемент удалён и возвращён, size уменьшен на 1
    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = items[front];
        items[front] = null;
        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % CAPACITY;
        }
        size--;
        return element;
    }

    // Предусловие: нет
    // Постусловие: возвращён размер очереди
    public static int size() {
        return size;
    }

    // Предусловие: нет
    // Постусловие: возвращён true, если очередь пуста
    public static boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: нет
    // Постусловие: очередь пуста, size == 0
    public static void clear() {
        for (int i = 0; i < CAPACITY; i++) {
            items[i] = null;
        }
        front = -1;
        rear = -1;
        size = 0;
    }
}