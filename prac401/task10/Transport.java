package prac401.task10;

abstract class Transport {
    protected String name;
    protected double speed;
    protected double passengerCostPerKm;
    protected double cargoCostPerKm;

    public Transport(String name, double speed, double passengerCostPerKm, double cargoCostPerKm) {
        this.name = name;
        this.speed = speed;
        this.passengerCostPerKm = passengerCostPerKm;
        this.cargoCostPerKm = cargoCostPerKm;
    }

    public double calculateTime(double distance) {
        return distance / speed;
    }

    public double calculatePassengerCost(double distance, int passengers) {
        return distance * passengerCostPerKm * passengers;
    }

    public double calculateCargoCost(double distance, double weight) {
        return distance * cargoCostPerKm * weight;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Car extends Transport {
    public Car() {
        super("Auto", 100, 0.5, 1.0);
    }
}

class Airplane extends Transport {
    public Airplane() {
        super("Plane", 800, 5.0, 10.0);
    }
}

class Train extends Transport {
    public Train() {
        super("Train", 120, 0.3, 0.8);
    }
}

class Ship extends Transport {
    public Ship() {
        super("Ship", 50, 1.0, 2.0);
    }
}


