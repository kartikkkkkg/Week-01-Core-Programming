import java.util.Scanner;

public class StringComparator {
    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) return false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean charAtResult = compareStrings(str1, str2);
        boolean equalsResult = str1.equals(str2);
        System.out.println("charAt comparison: " + charAtResult);
        System.out.println("equals comparison: " + equalsResult);
        System.out.println("Same result: " + (charAtResult == equalsResult));
        scanner.close();
    }
}