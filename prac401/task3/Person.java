package prac401.task3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " move");
    }

    public void talk() {
        System.out.println(fullName + " talk");
    }

    // Тестер
    public static void main(String[] args) {
        // Создание объектов
        Person person1 = new Person("Joe Joesson", 15);
        Person person2 = new Person("Mary Marilyn", 30);

        System.out.println("Person 1:");
        person1.move();
        person1.talk();
        System.out.println("Person 2:");
        person2.move();
        person2.talk();
    }
}
