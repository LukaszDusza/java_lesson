package programs.temperature;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
