package prac9.task3;

import java.util.Arrays;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {return name;}
    public double getGpa() {return gpa;}
    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Student[] list1 = {
                new Student("Alice", 3.9),
                new Student("Bob", 3.2),
                new Student("Charlie", 3.5)
        };
        Student[] list2 = {
                new Student("Diana", 4.0),
                new Student("Ethan", 3.6),
                new Student("Fiona", 3.8)
        };

        Student[] mergedList = mergeAndSort(list1, list2);
        System.out.println("Merged and sorted:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
    public static Student[] mergeAndSort(Student[] list1, Student[] list2) {
        Student[] mergedList = new Student[list1.length + list2.length];
        System.arraycopy(list1, 0, mergedList, 0, list1.length);
        System.arraycopy(list2, 0, mergedList, list1.length, list2.length);
        return mergeSort(mergedList);
    }
    public static Student[] mergeSort(Student[] students) {
        if (students.length < 2) {
            return students;
        }

        int mid = students.length / 2;
        Student[] left = Arrays.copyOfRange(students, 0, mid);
        Student[] right = Arrays.copyOfRange(students, mid, students.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].getGpa() >= right[rightIndex].getGpa()) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}