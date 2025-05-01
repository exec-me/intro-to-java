package prac401.task6;

class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(int daysWorked) {
        if (daysWorked >= 20) {
            return income * 12;
        }
        return income;
    }

    @Override
    public String toString() {
        return "Employer {" + firstName + " " + lastName + ", income=" + income + "}";
    }
}
