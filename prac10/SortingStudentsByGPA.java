// task2
package prac10;

import java.util.ArrayList;
import java.util.List;

public class SortingStudentsByGPA {
    public static void quickSortByGPA(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionByGPA(students, low, high);
            quickSortByGPA(students, low, pivotIndex - 1);
            quickSortByGPA(students, pivotIndex + 1, high);
        }
    }

    private static int partitionByGPA(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() > pivot) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) return list;

        int middle = list.size() / 2;

        List<Student> left = mergeSort(list.subList(0, middle));
        List<Student> right = mergeSort(list.subList(middle, list.size()));

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGPA() > right.get(j).getGPA()) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }
}

