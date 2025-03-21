import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static String[][] calculateFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
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