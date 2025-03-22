import java.util.Scanner;

public class CharacterRemover {
    public static String removeCharacter(String text, char ch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("Modified String: " + removeCharacter(input, ch));
        scanner.close();
    }
}