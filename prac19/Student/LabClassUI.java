package prac19.Student;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента по ФИО");
            System.out.println("3. Сортировать студентов по среднему баллу");
            System.out.println("0. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите ФИО: ");
                        String fullName = scanner.nextLine();
                        System.out.print("Введите средний балл: ");
                        double averageScore = scanner.nextDouble();
                        labClass.addStudent(new Student(fullName, averageScore));
                    } catch (EmptyStringException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите ФИО для поиска: ");
                        String fullName = scanner.nextLine();
                        Student student = labClass.findStudentByFullName(fullName);
                        System.out.println("Студент найден: " + student.getFullName() + ", средний балл: " + student.getAverageScore());
                    } catch (StudentNotFoundException | EmptyStringException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    labClass.sortStudentsByScore();
                    System.out.println("Студенты отсортированы по среднему баллу.");
                    for (Student student : labClass.getStudents()) {
                        System.out.println("ФИО: " + student.getFullName() + ", Средний балл: " + student.getAverageScore());
                    }
                    break;
                case 0:
                    System.out.println("Выходим...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
