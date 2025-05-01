package prac3.task3.Report;

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Employees report:");
        System.out.printf("%-20s %10s%n", "Fullname", "Salary");
        for (Employee emp : employees) {
            System.out.printf("%-20s $%10.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}

