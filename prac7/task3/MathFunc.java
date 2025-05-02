package prac7.task3;

public class MathFunc implements MathCalculable {
    public double power(double base, double exponent) {return Math.pow(base, exponent);}

    public double abs(double complexRealPart, double complexImaginaryPart) {
        return Math.sqrt(power(complexRealPart,2) + power(complexImaginaryPart,2));
    }
    public double circ(double radius) {return 2 * PI * radius;}
}
