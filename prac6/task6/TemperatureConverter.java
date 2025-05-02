package prac6.task6;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        Convertable toKelvin = new CelsiusToKelvin(celsius);
        Convertable toFahrenheit = new CelsiusToFahrenheit(celsius);

        System.out.println(celsius + "°C = " + toKelvin.convert() + "K");
        System.out.println(celsius + "°C = " + toFahrenheit.convert() + "°F");
    }
}
