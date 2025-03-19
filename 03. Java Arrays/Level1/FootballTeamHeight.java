import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] playerHeights = new double[11];
        double heightSum = 0.0;
        
        System.out.println("Enter Player Heights: ");
        for (int index = 0; index < playerHeights.length; index++) {
            playerHeights[index] = scanner.nextDouble();
            if (playerHeights[index] <= 0) {
                System.out.println("Invalid height entered.");
                System.exit(0);
            }
            heightSum += playerHeights[index];
        }
        
        double meanHeight = heightSum / playerHeights.length;
        System.out.println("The total sum of heights is: " + heightSum + " and mean height is " + meanHeight);
        
        scanner.close();
    }
}