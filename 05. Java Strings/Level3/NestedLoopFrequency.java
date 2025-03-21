import java.util.Scanner;

public class NestedLoopFrequency {
    public static String[] calculateFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (freq[i] > 0) {
                result[index++] = chars[i] + ": " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String[] frequencies = calculateFrequencies(input);
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
        scanner.close();
    }
}