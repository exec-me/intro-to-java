package prac11.task3;

import java.util.Date;
public class StudentTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("toString(): " + now);
        Student student = new Student("Joe Joesson", now);
        System.out.println(student.toString());
    }
}
