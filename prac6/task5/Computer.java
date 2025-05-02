package prac6.task5;


enum Brand {
    DELL, HP, LENOVO, ASUS
}

class Processor {
    private String model;
    private double speed; // GHz

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor[model=" + model + ", speed=" + speed + "GHz]";
    }
}

class Memory {
    private int capacity; // GB

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory[capacity=" + capacity + "GB]";
    }
}

class Monitor {
    private int size; // inches

    public Monitor(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor[size=" + size + " inches]";
    }
}

class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Computer[brand=" + brand + ", " + processor + ", " + memory + ", " + monitor + "]";
    }
}




