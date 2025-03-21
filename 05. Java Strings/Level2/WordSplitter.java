import java.util.Scanner;

public class WordSplitter {
    public static String[] splitIntoWords(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] first, String[] second) {
        if (first.length != second.length) return false;
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        String[] manualWords = splitIntoWords(input);
        String[] builtInWords = input.split("\\s+");
        boolean areEqual = compareArrays(manualWords, builtInWords);
        System.out.print("Manual split: ");
        for (String word : manualWords) System.out.print(word + " ");
        System.out.println("\nEqual to built-in: " + areEqual);
        scanner.close();
    }
}