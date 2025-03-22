import java.util.Scanner;

public class StringReverser {
    public static String reverseString(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
        scanner.close();
    }
}