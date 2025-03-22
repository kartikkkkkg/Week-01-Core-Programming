import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = scanner.nextLine();
        System.out.println("Longest word: " + findLongestWord(input));
        scanner.close();
    }
}