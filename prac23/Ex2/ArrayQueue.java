package prac23.Ex2;

public class ArrayQueue extends AbstractQueue {
    private Object[] items;
    private int front;
    private int rear;
    private final int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.items = new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Инвариант: 0 <= size <= capacity, front/rear в [-1, capacity-1], front == -1 && rear == -1 если очередь пуста

    @Override
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

    @Override
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException ("Queue is empty");
        }
        return items[front];
    }

    @Override
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

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            items[i] = null;
        }
        front = -1;
        rear = -1;
        size = 0;
    }
}
