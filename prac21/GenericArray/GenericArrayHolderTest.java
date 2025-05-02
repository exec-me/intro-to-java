///Написать класс, который умеет хранить в себе массив любых
/// типов данных
package prac21.GenericArray;

public class GenericArrayHolderTest {
    public static void main(String[] args) {
        // Тест для Integer
        GenericArrayHolder<Integer> intHolder = new GenericArrayHolder<>(3);
        intHolder.set(0, 10);
        intHolder.set(1, 20);
        intHolder.set(2, 30);
        System.out.println("Массив Integer:");
        for (int i = 0; i < intHolder.size(); i++) {
            System.out.println(intHolder.get(i));
        }

        // Тест для Long
        GenericArrayHolder<Long> longHolder = new GenericArrayHolder<>(2);
        longHolder.set(0, 100L);
        longHolder.set(1, 200L);
        System.out.println("\nМассив Long:");
        for (int i = 0; i < longHolder.size(); i++) {
            System.out.println(longHolder.get(i));
        }
    }
}
