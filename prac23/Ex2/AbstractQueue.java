package prac23.Ex2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    protected AbstractQueue() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}