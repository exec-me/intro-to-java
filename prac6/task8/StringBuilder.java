package prac6.task8;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String state);
}

class CustomStringBuilder {
    private StringBuilder delegate;
    private List<Observer> observers;

    public CustomStringBuilder() {
        delegate = new StringBuilder();
        observers = new ArrayList<>();
    }

    public CustomStringBuilder append(String str) {
        delegate.append(str);
        notifyObservers();
        return this;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(delegate.toString());
        }
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}

class Logger implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Logger: StringBuilder changed to: " + state);
    }
}

