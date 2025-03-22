import java.util.Scanner;

public class DuplicateRemover {
    public static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("String without duplicates: " + removeDuplicates(input));
        scanner.close();
    }
}