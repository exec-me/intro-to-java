package prac9.task1;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(4, "Charlie"),
                new Student(2, "David")
        };
        Sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void Sort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}

