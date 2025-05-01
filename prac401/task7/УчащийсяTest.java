package prac401.task7;

public class УчащийсяTest {
    public static void main(String[] args) {
        Учащийся[] учащиеся = {
                new Школьник("Алексей", 12),
                new Студент("Мария", 20),
                new Школьник("Иван", 15),
                new Студент("Анна", 22)
        };

        System.out.println("Все учащиеся:");
        for (Учащийся у : учащиеся) {
            System.out.println(у);
        }

        System.out.println("\nШкольники:");
        for (Учащийся у : учащиеся) {
            if (у instanceof Школьник) {
                System.out.println(у);
            }
        }

        System.out.println("\nСтуденты:");
        for (Учащийся у : учащиеся) {
            if (у instanceof Студент) {
                System.out.println(у);
            }
        }
    }
}
