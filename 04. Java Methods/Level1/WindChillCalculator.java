import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) +
               (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter Wind Speed: ");
        double windSpeed = scanner.nextDouble();
        if (windSpeed < 0) {
            System.out.println("Invalid wind speed.");
            System.exit(0);
        }

        System.out.printf("Wind Chill: %.2f\n", calculateWindChill(temperature, windSpeed));

        scanner.close();
    }
}