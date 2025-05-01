public class prac1t3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int s = 0;
        double m;
        for (int number : numbers) {
            s += number;
        }
        m = (double) s / numbers.length;
        System.out.println("Sum: " + s);
        System.out.println("Mean: " + m);
    }
}
