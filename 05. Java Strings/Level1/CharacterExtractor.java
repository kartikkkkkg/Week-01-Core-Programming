import java.util.Scanner;

public class CharacterExtractor {
    public static char[] extractCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] first, char[] second) {
        if (first.length != second.length) return false;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = scanner.next();
        char[] manualChars = extractCharacters(text);
        char[] builtInChars = text.toCharArray();
        boolean areEqual = compareCharArrays(manualChars, builtInChars);
        System.out.print("Manual characters: ");
        for (char c : manualChars) System.out.print(c + " ");
        System.out.println("\nEqual to built-in: " + areEqual);
        scanner.close();
    }
}