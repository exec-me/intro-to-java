package prac401.task6;

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome(int daysWorked) {
        double baseIncome = super.getIncome(daysWorked);
        return baseIncome + averageSum;
    }

    @Override
    public String toString() {
        return "Manager {" + firstName + " " + lastName + ", income=" + income + ", averageSum=" + averageSum + "}";
    }
}
