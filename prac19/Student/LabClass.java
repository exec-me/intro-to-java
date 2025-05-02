package prac19.Student;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }

        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с таким ФИО не найден");
    }

    public List<Student> getStudents() {
        return students;
    }
    //расчёска
    public void sortStudentsByScore() {
        int gap = students.size(); // шаг
        boolean swapped = true; // инициализация свапа элементов

        while (gap != 1 || swapped) { // пока шаг не 1 и не поменялись элементы
            gap = (int) (gap * 0.3); // уменьшаем шаг для эффективности
            if (gap < 1) {
                gap = 1;
            }

            swapped = false;

            for (int i = 0; i < students.size() - gap; i++) {
                Student s1 = students.get(i);
                Student s2 = students.get(i + gap);
                if (s1.getAverageScore() < s2.getAverageScore()) {
                    students.set(i, s2);
                    students.set(i + gap, s1);
                    swapped = true;
                }
            }
        }
    }


}
