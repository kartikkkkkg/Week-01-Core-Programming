import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents < 0) {
            System.out.println("Invalid number of students.");
            System.exit(0);
        }

        System.out.println("Max number of handshakes: " + calculateHandshakes(numberOfStudents));

        scanner.close();
    }
}