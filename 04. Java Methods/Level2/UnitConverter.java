import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nUnit Converter:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Yards to Feet");
            System.out.println("6. Feet to Yards");
            System.out.println("7. Meters to Inches");
            System.out.println("8. Inches to Meters");
            System.out.println("9. Inches to Centimeters");
            System.out.println("10. Fahrenheit to Celsius");
            System.out.println("11. Celsius to Fahrenheit");
            System.out.println("12. Pounds to Kilograms");
            System.out.println("13. Kilograms to Pounds");
            System.out.println("14. Gallons to Liters");
            System.out.println("15. Liters to Gallons");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 16) {
                System.out.println("Exiting...");
                break;
            }
            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result;
            switch (choice) {
                case 1:
                    result = convertKmToMiles(value);
                    System.out.printf("%.2f km = %.2f miles\n", value, result);
                    break;
                case 2:
                    result = convertMilesToKm(value);
                    System.out.printf("%.2f miles = %.2f km\n", value, result);
                    break;
                case 3:
                    result = convertMetersToFeet(value);
                    System.out.printf("%.2f meters = %.2f feet\n", value, result);
                    break;
                case 4:
                    result = convertFeetToMeters(value);
                    System.out.printf("%.2f feet = %.2f meters\n", value, result);
                    break;
                case 5:
                    result = convertYardsToFeet(value);
                    System.out.printf("%.2f yards = %.2f feet\n", value, result);
                    break;
                case 6:
                    result = convertFeetToYards(value);
                    System.out.printf("%.2f feet = %.2f yards\n", value, result);
                    break;
                case 7:
                    result = convertMetersToInches(value);
                    System.out.printf("%.2f meters = %.2f inches\n", value, result);
                    break;
                case 8:
                    result = convertInchesToMeters(value);
                    System.out.printf("%.2f inches = %.2f meters\n", value, result);
                    break;
                case 9:
                    result = convertInchesToCm(value);
                    System.out.printf("%.2f inches = %.2f cm\n", value, result);
                    break;
                case 10:
                    result = convertFahrenheitToCelsius(value);
                    System.out.printf("%.2f°F = %.2f°C\n", value, result);
                    break;
                case 11:
                    result = convertCelsiusToFahrenheit(value);
                    System.out.printf("%.2f°C = %.2f°F\n", value, result);
                    break;
                case 12:
                    result = convertPoundsToKilograms(value);
                    System.out.printf("%.2f pounds = %.2f kg\n", value, result);
                    break;
                case 13:
                    result = convertKilogramsToPounds(value);
                    System.out.printf("%.2f kg = %.2f pounds\n", value, result);
                    break;
                case 14:
                    result = convertGallonsToLiters(value);
                    System.out.printf("%.2f gallons = %.2f liters\n", value, result);
                    break;
                case 15:
                    result = convertLitersToGallons(value);
                    System.out.printf("%.2f liters = %.2f gallons\n", value, result);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}