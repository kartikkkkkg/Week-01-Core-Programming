import java.util.Scanner;

public class StringTrimmer {
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
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
        String input = scanner.nextLine();
        int[] indices = findTrimIndices(input);
        String manualTrim = createSubstring(input, indices[0], indices[1]);
        String builtInTrim = input.trim();
        boolean areEqual = compareStrings(manualTrim, builtInTrim);
        System.out.println("Manual trim: \"" + manualTrim + "\"");
        System.out.println("Built-in trim: \"" + builtInTrim + "\"");
        System.out.println("Equal: " + areEqual);
        scanner.close();
    }
}