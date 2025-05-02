package prac9.task2;

public class Test {
    public static void main(String[] args) {
        Students[] students = {
                new Students("Alice", 3.9),
                new Students("Bob", 3.2),
                new Students("Charlie", 3.5),
                new Students("Diana", 4.0)
        };
        Sorting sorter = new Sorting();
        sorter.quickSort(students, 0, students.length - 1);

        for (Students student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}