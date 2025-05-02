package prac6.task2;

public class NameableTest {
    public static void main(String[] args) {
        Nameable[] objects = {
                new Planet("Mars"),
                new Car("Toyota Camry"),
                new Animal("Tiger")
        };

        for (Nameable obj : objects) {
            System.out.println("Name: " + obj.getName());
        }
    }
}
