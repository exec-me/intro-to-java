package prac6.task3;
public interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String type;
    private double hourlyRate;

    public Service(String type, double hourlyRate) {
        this.type = type;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate; // Цена за час
    }
}

class Ticket implements Priceable {
    private String event;
    private double cost;

    public Ticket(String event, double cost) {
        this.event = event;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}

