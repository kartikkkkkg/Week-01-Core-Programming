import java.util.Random;
import java.util.Scanner;

public class StudentScoreCalculator {
    public static int[][] generateScores(int studentCount) {
        Random random = new Random();
        int[][] scores = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + random.nextInt(90);
            }
        }
        return scores;
    }

    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            metrics[i][0] = Math.round(total * 100.0) / 100.0;
            metrics[i][1] = Math.round(total / 3.0 * 100.0) / 100.0;
            metrics[i][2] = Math.round(total / 3.0 * 100.0) / 100.0;
        }
        return metrics;
    }

    public static void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("Scorecard:");
        System.out.printf("%-5s %-8s %-8s %-8s %-8s %-8s %-8s\n",
                "ID", "Physics", "Chem", "Maths", "Total", "Avg", "%");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-8d %-8d %-8.2f %-8.2f %-8.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    metrics[i][0], metrics[i][1], metrics[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentCount = scanner.nextInt();
        if (studentCount <= 0) {
            System.out.println("Invalid number of students.");
            System.exit(0);
        }
        int[][] scores = generateScores(studentCount);
        double[][] metrics = calculateMetrics(scores);
        displayScorecard(scores, metrics);
        scanner.close();
    }
}