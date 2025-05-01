package prac2.task5;

public class DogNursery {
    private Dog[] dogs;
    private int count;

    public DogNursery(int size) {
        dogs = new Dog[size];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count++] = dog;
        }
    }

    public static void main(String[] args) {
        DogNursery nursery = new DogNursery(3);
        nursery.addDog(new Dog("Rex", 2));
        nursery.addDog(new Dog("Bella", 5));
        nursery.addDog(new Dog("Max", 1));

        for (int i = 0; i < nursery.count; i++) {
            System.out.println(nursery.dogs[i]);
        }
    }
}
