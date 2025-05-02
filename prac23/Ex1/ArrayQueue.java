package prac23.Ex1;

public class ArrayQueue {
    private Object[] items;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.items = new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Инвариант: 0 <= size <= capacity, front/rear в [-1, capacity-1], front == -1 && rear == -1 если очередь пуста

    // Предусловие: size < capacity
    // Постусловие: элемент добавлен в конец, size увеличен на 1
    public void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        items[rear] = element;
        size++;
    }

    // Предусловие: size > 0
    // Постусловие: возвращён первый элемент, очередь не изменена
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return items[front];
    }

    // Предусловие: size > 0
    // Постусловие: первый элемент удалён и возвращён, size уменьшен на 1
    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = items[front];
        items[front] = null;
        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return element;
    }

    // Предусловие: нет
    // Постусловие: возвращён размер очереди
    public int size() {
        return size;
    }

    // Предусловие: нет
    // Постусловие: возвращён true, если очередь пуста
    public boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: нет
    // Постусловие: очередь пуста, size == 0
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            items[i] = null;
        }
        front = -1;
        rear = -1;
        size = 0;
    }
}
