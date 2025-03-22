import java.util.Scanner;

public class CaseToggler {
    public static String toggleCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') result.append((char) (ch + 32));
            else if (ch >= 'a' && ch <= 'z') result.append((char) (ch - 32));
            else result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("Toggled case: " + toggleCase(input));
        scanner.close();
    }
}