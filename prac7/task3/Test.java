package prac7.task3;
public class Test {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double base = 2;
        double exponent = 3;
        System.out.println("2**3 = " + mc1.power(base, exponent));

        double realPart = 3;
        double imaginaryPart = 4;
        System.out.println("Abs 3 + 4i = " + mc1.abs(realPart, imaginaryPart));

        double radius = 5;
        System.out.println("Circumference (R=5) = " + mc1.circ(radius));
    }
}
