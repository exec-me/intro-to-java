package prac401.task10;

public class TransportTest {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car(),
                new Airplane(),
                new Train(),
                new Ship()
        };

        double distance = 1000; // км
        int passengers = 10;
        double cargoWeight = 5; // тонн

        for (Transport t : transports) {
            System.out.println("Transport: " + t);
            System.out.println("Transporting time: " + t.calculateTime(distance) + " hours");
            System.out.println("Transporting cost of " + passengers + " passengers: " + t.calculatePassengerCost(distance, passengers));
            System.out.println("Transporting cost " + cargoWeight + " cargo tons: " + t.calculateCargoCost(distance, cargoWeight));
            System.out.println();
        }
    }
}
