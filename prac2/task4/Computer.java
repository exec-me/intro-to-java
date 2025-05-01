package prac2.task4;

public class Computer {
    private String model;
    private int price;

    public Computer(String brand, int price) {
        this.model = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Computer {brand='" + model + "', price=" + price + "}";
    }
}
