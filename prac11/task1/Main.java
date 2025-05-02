package prac11.task1;

import java.util.Date;

class main {
    public static void main(String[] args) {
        String developerSurname = "Drobot";
        Date dateReceived = new Date();
        System.out.println("Surname: " + developerSurname);
        System.out.println("Data of problem: " + dateReceived);
        calc calculator = new calc();
        calculator.func();
        Date dateSubmitted = new Date();
        System.out.println("Data of solving problem: " + dateSubmitted);
    }
}
