package prac9.task4;

public class ComparableStudentTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Alice", 3.8),
                new Student(101, "Bob", 4.0),
                new Student(105, "Charlie", 3.5),
                new Student(102, "David", 3.9),
                new Student(104, "Eve", 3.7)
        };

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        java.util.Arrays.sort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
