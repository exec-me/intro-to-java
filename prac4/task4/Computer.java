package prac4.task4;

enum Brand {
    DELL("Dell"),
    HP("HP"),
    APPLE("Apple"),
    LENOVO("Lenovo");

    private final String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Processor {
    private String model;
    private double speedGHz;

    public Processor(String model, double speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String getModel() {
        return model;
    }

    public double getSpeedGHz() {
        return speedGHz;
    }

    @Override
    public String toString() {
        return String.format("Processor: %s, %.1f GHz", model, speedGHz);
    }
}

class Memory {
    private int capacityGB;
    private String type;

    public Memory(int capacityGB, String type) {
        this.capacityGB = capacityGB;
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Memory: %d GB, Type: %s", capacityGB, type);
    }
}

class Monitor {
    private double screenSizeInches;
    private String resolution;

    public Monitor(double screenSizeInches, String resolution) {
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return String.format("Monitor: %.1f inch., Resolution: %s", screenSizeInches, resolution);
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

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void displayInfo() {
        System.out.println("Computer information:");
        System.out.println("Brand: " + brand.getName());
        System.out.println(processor);
        System.out.println(memory);
        System.out.println(monitor);
    }
}


