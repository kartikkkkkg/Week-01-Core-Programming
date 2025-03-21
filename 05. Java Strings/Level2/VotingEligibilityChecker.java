import java.util.Scanner;
import java.util.Random;

public class VotingEligibilityChecker {
    public static int[] generateAges(int count) {
        Random rand = new Random();
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = rand.nextInt(20) + 10;
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18 && ages[i] >= 0) ? "Yes" : "No";
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote?");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        try {
            if (count <= 0) throw new IllegalArgumentException("Number of students must be positive");
            int[] ages = generateAges(count);
            String[][] eligibility = checkEligibility(ages);
            displayTable(eligibility);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}