import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) result.append(newWord);
            else result.append(word);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();
        System.out.println("Modified sentence: " + replaceWord(sentence, oldWord, newWord));
        scanner.close();
    }
}