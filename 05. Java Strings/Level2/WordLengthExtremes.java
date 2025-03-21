import java.util.Scanner;

public class WordLengthExtremes {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findExtremes(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = minLen;
        for (String[] word : wordLengths) {
            int len = Integer.parseInt(word[1]);
            if (len < minLen) {
                shortest = word[0];
                minLen = len;
            }
            if (len > maxLen) {
                longest = word[0];
                maxLen = len;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        String[] words = splitIntoWords(input);
        String[][] wordLengths = getWordsWithLengths(words);
        String[] extremes = findExtremes(wordLengths);
        System.out.println("Shortest word: " + extremes[0]);
        System.out.println("Longest word: " + extremes[1]);
        scanner.close();
    }
}