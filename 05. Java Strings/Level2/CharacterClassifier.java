import java.util.Scanner;

public class CharacterClassifier {
    public static String classifyCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        if (ch >= 'a' && ch <= 'z') return "Consonant";
        return "Not a letter";
    }

    public static String[][] classifyAllCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyCharacter(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String[][] table = classifyAllCharacters(input);
        displayTable(table);
        scanner.close();
    }
}