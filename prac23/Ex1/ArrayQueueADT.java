package prac23.Ex1;

public class ArrayQueueADT {
    private Object[] items;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public ArrayQueueADT(int capacity) {
        this.capacity = capacity;
        this.items = new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Инвариант: 0 <= size <= capacity, front/rear в [-1, capacity-1], front == -1 && rear == -1 если очередь пуста

    // Предусловие: size < capacity
    // Постусловие: элемент добавлен в конец, size увеличен на 1
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.size == queue.capacity) {
            throw new IllegalStateException("Queue is full");
        }
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        if (queue.size == 0) {
            queue.front = 0;
        }
        queue.rear = (queue.rear + 1) % queue.capacity;
        queue.items[queue.rear] = element;
        queue.size++;
    }

    // Предусловие: size > 0
    // Постусловие: возвращён первый элемент, очередь не изменена
    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.items[queue.front];
    }

    // Предусловие: size > 0
    // Постусловие: первый элемент удалён и возвращён, size уменьшен на 1
    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue.items[queue.front];
        queue.items[queue.front] = null;
        if (queue.size == 1) {
            queue.front = -1;
            queue.rear = -1;
        } else {
            queue.front = (queue.front + 1) % queue.capacity;
        }
        queue.size--;
        return element;
    }

    // Предусловие: нет
    // Постусловие: возвращён размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Предусловие: нет
    // Постусловие: возвращён true, если очередь пуста
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Предусловие: нет
    // Постусловие: очередь пуста, size == 0
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.capacity; i++) {
            queue.items[i] = null;
        }
        queue.front = -1;
        queue.rear = -1;
        queue.size = 0;
    }
}
