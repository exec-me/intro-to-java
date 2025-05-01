package prac401.task9;

abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + "{name=" + name + ", price=" + price + "}";
    }
}

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Chair";
    }
}

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Table";
    }
}



