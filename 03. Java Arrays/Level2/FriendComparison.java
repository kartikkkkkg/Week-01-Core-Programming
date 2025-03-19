import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter Age: ");
        for (int index = 0; index < ages.length; index++) {
            int inputAge = scanner.nextInt();
            if (inputAge <= 0) {
                System.out.println("Invalid age. Enter again: ");
                index--;
                continue;
            }
            ages[index] = inputAge;
        }

        System.out.println("Enter Heights: ");
        for (int index = 0; index < heights.length; index++) {
            double inputHeight = scanner.nextDouble();
            if (inputHeight <= 0) {
                System.out.println("Invalid height. Enter again: ");
                index--;
                continue;
            }
            heights[index] = inputHeight;
        }

        int youngestAge = ages[0];
        double tallestHeight = heights[0];
        for (int index = 0; index < ages.length; index++) {
            if (ages[index] < youngestAge) {
                youngestAge = ages[index];
            }
            if (heights[index] > tallestHeight) {
                tallestHeight = heights[index];
            }
        }

        System.out.println("Youngest: " + youngestAge + " Tallest: " + tallestHeight);

        scanner.close();
    }
}