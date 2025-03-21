import java.util.Scanner;

public class SubstringCreator {
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        try {
            String manualSubstring = createSubstring(text, start, end);
            String builtInSubstring = text.substring(start, end);
            boolean areEqual = compareStrings(manualSubstring, builtInSubstring);
            System.out.println("Manual substring: " + manualSubstring);
            System.out.println("Built-in substring: " + builtInSubstring);
            System.out.println("Equal: " + areEqual);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index range");
        }
        scanner.close();
    }
}