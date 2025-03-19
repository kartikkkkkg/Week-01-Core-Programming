import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentCount = scanner.nextInt();
        if (studentCount <= 0) {
            System.out.println("Invalid number of students.");
            System.exit(0);
        }

        int[] physicsMarks = new int[studentCount];
        int[] chemistryMarks = new int[studentCount];
        int[] mathMarks = new int[studentCount];
        double[] percentages = new double[studentCount];
        String[] grades = new String[studentCount];

        for (int index = 0; index < studentCount; index++) {
            System.out.println("Enter Physics Marks for student " + (index + 1) + ": ");
            int physics = scanner.nextInt();
            if (physics < 0) {
                System.out.println("Invalid marks. Enter again: ");
                index--;
                continue;
            }
            physicsMarks[index] = physics;

            System.out.println("Enter Chemistry Marks for student " + (index + 1) + ": ");
            int chemistry = scanner.nextInt();
            if (chemistry < 0) {
                System.out.println("Invalid marks. Enter again: ");
                index--;
                continue;
            }
            chemistryMarks[index] = chemistry;

            System.out.println("Enter Maths Marks for student " + (index + 1) + ": ");
            int math = scanner.nextInt();
            if (math < 0) {
                System.out.println("Invalid marks. Enter again: ");
                index--;
                continue;
            }
            mathMarks[index] = math;

            percentages[index] = (physicsMarks[index] + chemistryMarks[index] + mathMarks[index]) / 3.0;
        }

        for (int index = 0; index < studentCount; index++) {
            String remark;
            if (percentages[index] >= 80) {
                remark = "A, Remarks: Level 4, above agency normalized standards";
            } else if (percentages[index] >= 70) {
                remark = "B, Remarks: Level 3, at agency normalized standards";
            } else if (percentages[index] >= 60) {
                remark = "C, Remarks: Level 2, below but approaching agency normalized standards";
            } else if (percentages[index] >= 50) {
                remark = "D, Remarks: Level 1, well below agency normalized standards";
            } else if (percentages[index] >= 40) {
                remark = "E, Remarks: Level 1, too below agency normalized standards";
            } else {
                remark = "R, Remarks: Remedial standards";
            }
            System.out.printf("Student %d: Physics: %d, Chemistry: %d, Maths: %d, Average: %.2f, Grade: %s\n",
                    (index + 1), physicsMarks[index], chemistryMarks[index], mathMarks[index], percentages[index], remark);
        }

        scanner.close();
    }
}