package prac3.task3.Report;

public class EmployeeReport {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Joe Joesson", 120000.56),
                new Employee("Mary Marylin", 50000.00),
                new Employee("Alex Alexio", 250000.50)
        };
        Report.generateReport(employees);
    }
}
