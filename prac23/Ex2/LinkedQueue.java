package prac23.Ex2;

public class LinkedQueue extends AbstractQueue {
    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Предусловие: нет (список не ограничен по размеру)
    // Постусловие: элемент добавлен в конец очереди
    @Override
    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращён первый элемент, очередь не изменена
    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.value;
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удалён и возвращён
    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = front.value;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return value;
    }

    // Предусловие: нет
    // Постусловие: очередь пуста
    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}
