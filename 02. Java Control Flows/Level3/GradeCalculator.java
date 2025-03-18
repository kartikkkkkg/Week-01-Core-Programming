import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int physicsMarks = scanner.nextInt();
        int chemistryMarks = scanner.nextInt();
        int mathMarks = scanner.nextInt();
        int maxMarks = scanner.nextInt();
        
        double averageMarks = (physicsMarks + chemistryMarks + mathMarks) / 3.0;
        double percentage = (averageMarks / maxMarks) * 100;
        
        if (percentage >= 80) {
            System.out.println("Average Marks: " + averageMarks + ", Grade: A, Remarks: Level 4, above agency normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Average Marks: " + averageMarks + ", Grade: B, Remarks: Level 3, at agency normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Average Marks: " + averageMarks + ", Grade: C, Remarks: Level 2, below, but approaching agency normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Average Marks: " + averageMarks + ", Grade: D, Remarks: Level 1, well below agency normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Average Marks: " + averageMarks + ", Grade: E, Remarks: Level 1, too below agency normalized standards");
        } else {
            System.out.println("Average Marks: " + averageMarks + ", Grade: R, Remarks: Remedial standards");
        }
        
        scanner.close();
    }
}