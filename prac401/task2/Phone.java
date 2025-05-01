package prac401.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Calls " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Calls " + name + " from number: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Send message to numbers:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Phone {number=" + number + ", model=" + model + ", weight=" + weight + "}";
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+1234567890", "iPhone", 150.5);
        Phone phone2 = new Phone("+0987654321", "Samsung", 140.0);
        Phone phone3 = new Phone("+1122334455", "Nokia");

        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);
        System.out.println("Phone 3: " + phone3);

        phone1.receiveCall("Alex");
        System.out.println("Number 1: " + phone1.getNumber());
        phone2.receiveCall("Mary");
        System.out.println("Number 2: " + phone2.getNumber());
        phone3.receiveCall("Joe");
        System.out.println("Number 3: " + phone3.getNumber());

        phone1.receiveCall("Alex", "+9998887777");
        phone2.receiveCall("Mary", "+7778889999");

        System.out.println("\nSend messages:");
        phone1.sendMessage("+1234567890", "+0987654321", "+1122334455");
    }
}
