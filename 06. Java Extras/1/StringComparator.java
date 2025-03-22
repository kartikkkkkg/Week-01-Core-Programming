import java.util.Scanner;

public class StringComparator {
    public static String compareLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) return str1 + " comes before " + str2;
            if (str1.charAt(i) > str2.charAt(i)) return str2 + " comes before " + str1;
        }
        if (str1.length() < str2.length()) return str1 + " comes before " + str2;
        if (str1.length() > str2.length()) return str2 + " comes before " + str1;
        return str1 + " equals " + str2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println(compareLexicographically(str1, str2));
        scanner.close();
    }
}