import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentCount = scanner.nextInt();
        if (studentCount <= 0) {
            System.out.println("Invalid number of students.");
            System.exit(0);
        }

        int[][] marks = new int[studentCount][3];
        double[] percentages = new double[studentCount];
        String[] grades = new String[studentCount];

        for (int index = 0; index < studentCount; index++) {
            System.out.println("Enter Marks for student " + (index + 1) + ":");
            for (int subject = 0; subject < 3; subject++) {
                String subjectName = subject == 0 ? "Physics" : subject == 1 ? "Chemistry" : "Maths";
                int inputMark;
                do {
                    System.out.println(subjectName + " Marks: ");
                    inputMark = scanner.nextInt();
                    if (inputMark < 0) {
                        System.out.println("Invalid, Enter Valid Marks for " + subjectName + ": ");
                    }
                } while (inputMark < 0);
                marks[index][subject] = inputMark;
            }
            percentages[index] = (marks[index][0] + marks[index][1] + marks[index][2]) / 3.0;
        }

        for (int index = 0; index < studentCount; index++) {
            if (percentages[index] >= 80) {
                grades[index] = "A (Level 4, above agency normalized standards)";
            } else if (percentages[index] >= 70) {
                grades[index] = "B (Level 3, at agency normalized standards)";
            } else if (percentages[index] >= 60) {
                grades[index] = "C (Level 2, below but approaching agency normalized standards)";
            } else if (percentages[index] >= 50) {
                grades[index] = "D (Level 1, well below agency normalized standards)";
            } else if (percentages[index] >= 40) {
                grades[index] = "E (Level 1, too below agency normalized standards)";
            } else {
                grades[index] = "R (Remedial standards)";
            }
        }

        System.out.println("Student Report: ");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-30s\n", "Student", "Physics", "Chemistry", "Maths", "%", "Grade");
        for (int index = 0; index < studentCount; index++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-30s\n",
                    (index + 1), marks[index][0], marks[index][1], marks[index][2], percentages[index], grades[index]);
        }

        scanner.close();
    }
}