package prac10;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentArrayUtils utils = new StudentArrayUtils();

        utils.setArray();

        System.out.println("Original array:");
        utils.outArray();

        SortingStudentsByGPA.quickSortByGPA(utils.getStudents(), 0, utils.getStudents().size() - 1);
        System.out.println("\nSorted by GPA (quick sort):");
        utils.outArray();

        List<Student> additionalStudents = List.of(
                new Student("Charlie", "Lee", "Engineering", 2, "A1", 3.7),
                new Student("Dana", "White", "Biology", 1, "B2", 2.9)
        );

        List<Student> mergedList = utils.mergeTwoLists(utils.getStudents(), additionalStudents);
        System.out.println("\nMerged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
