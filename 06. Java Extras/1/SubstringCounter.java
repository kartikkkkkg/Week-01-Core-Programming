import java.util.Scanner;

public class SubstringCounter {
    public static int countOccurrences(String text, String substring) {
        int count = 0, index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = scanner.nextLine();
        System.out.print("Enter substring: ");
        String substring = scanner.nextLine();
        System.out.println("Occurrences: " + countOccurrences(text, substring));
        scanner.close();
    }
}