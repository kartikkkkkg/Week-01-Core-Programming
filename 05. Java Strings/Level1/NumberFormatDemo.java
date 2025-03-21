import java.util.Scanner;

public class NumberFormatDemo {
    public static void parseNumber(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleParseNumber(String text) {
        try {
            parseNumber(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.next();
        System.out.println("Calling parseNumber...");
        try {
            parseNumber(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\nCalling handleParseNumber...");
        handleParseNumber(input);
        scanner.close();
    }
}