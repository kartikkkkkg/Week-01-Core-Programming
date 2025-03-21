import java.util.Scanner;

public class NullPointerDemo {
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calling generateNullPointerException...");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\nCalling handleNullPointerException...");
        handleNullPointerException();
        scanner.close();
    }
}