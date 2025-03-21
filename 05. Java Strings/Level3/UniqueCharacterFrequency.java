import java.util.Scanner;

public class UniqueCharacterFrequency {
    public static char[] findUniqueCharacters(String text) {
        char[] result = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = ch;
        }
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static String[][] calculateFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String[][] frequencies = calculateFrequencies(input);
        System.out.println("Character Frequencies:");
        for (String[] row : frequencies) {
            System.out.println(row[0] + ": " + row[1]);
        }
        scanner.close();
    }
}