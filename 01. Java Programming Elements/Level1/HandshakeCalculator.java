import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Total Possible Handshakes: " + totalHandshakes);
    }
}