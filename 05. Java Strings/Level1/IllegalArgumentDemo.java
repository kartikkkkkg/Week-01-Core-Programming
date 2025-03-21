import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void validateSubstring(String text, int start, int end) {
        if (start > end) throw new IllegalArgumentException("Start index greater than end index");
        System.out.println(text.substring(start, end));
    }

    public static void handleInvalidSubstring(String text, int start, int end) {
        try {
            validateSubstring(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        System.out.println("Calling validateSubstring...");
        try {
            validateSubstring(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\nCalling handleInvalidSubstring...");
        handleInvalidSubstring(text, start, end);
        scanner.close();
    }
}