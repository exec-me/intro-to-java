// task3
package prac10;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayUtils {
    private List<Student> students = new ArrayList<>();

    public void setArray() {
        students.add(new Student("John", "Doe", "Computer Science", 2, "A1", 3.6));
        students.add(new Student("Jane", "Smith", "Mathematics", 3, "B2", 3.9));
        students.add(new Student("Alice", "Johnson", "Physics", 1, "C3", 3.4));
        students.add(new Student("Bob", "Brown", "Chemistry", 4, "D4", 2.8));
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public List<Student> mergeTwoLists(List<Student> list1, List<Student> list2) {
        List<Student> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        return SortingStudentsByGPA.mergeSort(merged);
    }

    public List<Student> getStudents() {
        return students;
    }
}

