import java.util.Scanner;

public class StringIndexDemo {
    public static void generateIndexException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleIndexException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = scanner.next();
        System.out.println("Calling generateIndexException...");
        try {
            generateIndexException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\nCalling handleIndexException...");
        handleIndexException(text);
        scanner.close();
    }
}