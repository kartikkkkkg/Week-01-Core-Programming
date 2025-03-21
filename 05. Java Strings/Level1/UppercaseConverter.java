import java.util.Scanner;

public class UppercaseConverter {
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch -= 32;
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) return false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String manualUpper = convertToUppercase(input);
        String builtInUpper = input.toUpperCase();
        boolean areEqual = compareStrings(manualUpper, builtInUpper);
        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Equal: " + areEqual);
        scanner.close();
    }
}