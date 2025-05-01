package prac401.task6;

public class EmployerTest {
    public static void main(String[] args) {
        Employer[] employees = {
                new Employer("Joe", "Joesson", 10000),
                new Manager("Mary", "Marilyn", 60000, 10000),
                new Employer("Micheal", "Joesson", 45000)
        };

        for (Employer emp : employees) {
            System.out.println(emp);
            System.out.println("Income (30 days): " + emp.getIncome(30));
            System.out.println("Income (10 days): " + emp.getIncome(10));
            System.out.println();
        }
    }
}

