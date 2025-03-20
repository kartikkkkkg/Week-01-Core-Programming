import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        return age >= 18 && age > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println("Enter age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Invalid age. Enter again: ");
                i--;
                continue;
            }
            studentAges[i] = age;
            System.out.println("Student " + (i + 1) + " is " +
                    (canStudentVote(age) ? "eligible" : "not eligible") + " to vote");
        }
        scanner.close();
    }
}