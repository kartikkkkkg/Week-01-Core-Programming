import java.util.Scanner;

public class NonRepeatingCharacterFinder {
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        char result = findFirstNonRepeating(input);
        System.out.println(result == '\0' ? "No non-repeating character" : "First non-repeating: " + result);
        scanner.close();
    }
}