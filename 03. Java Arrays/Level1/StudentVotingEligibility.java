import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        
        for (int index = 0; index < studentAges.length; index++) {
            System.out.print("Enter age of student " + (index + 1) + ": ");
            studentAges[index] = scanner.nextInt();
        }
        
        System.out.println();
        for (int index = 0; index < studentAges.length; index++) {
            if (studentAges[index] < 0) {
                System.out.println("Invalid Age");
            } else if (studentAges[index] >= 18) {
                System.out.println("The student with the age " + studentAges[index] + " can vote!");
            } else {
                System.out.println("The student with the age " + studentAges[index] + " cannot vote");
            }
        }
        
        scanner.close();
    }
}