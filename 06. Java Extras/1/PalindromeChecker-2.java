import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(input));
        scanner.close();
    }
}