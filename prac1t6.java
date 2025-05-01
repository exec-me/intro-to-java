public class prac1t6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double number = 0;
            for (int j = 1; j <= i; j++) {
                number += 1.0 / j;
            }
            System.out.printf("Number %d = %.4f%n", i, number);
        }
    }
}