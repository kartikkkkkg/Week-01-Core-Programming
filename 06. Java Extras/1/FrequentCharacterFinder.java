import java.util.Scanner;

public class FrequentCharacterFinder {
    public static char findMostFrequent(String text) {
        int[] freq = new int[256];
        int max = 0;
        char result = ' ';
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequent(input) + "'");
        scanner.close();
    }
}