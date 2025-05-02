package prac6.task6;

public interface Convertable {
    double convert();
}

class CelsiusToKelvin implements Convertable {
    private double celsius;

    public CelsiusToKelvin(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double convert() {
        return celsius + 273.15;
    }
}

class CelsiusToFahrenheit implements Convertable {
    private double celsius;

    public CelsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double convert() {
        return celsius * 9 / 5 + 32;
    }
}


