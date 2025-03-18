import java.util.Scanner;

public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        
        if (inputYear >= 1582) {
            if (inputYear % 400 == 0) {
                System.out.println(inputYear + " is a Leap Year.");
            } else if (inputYear % 100 == 0) {
                System.out.println(inputYear + " is NOT a Leap Year.");
            } else if (inputYear % 4 == 0) {
                System.out.println(inputYear + " is a Leap Year.");
            } else {
                System.out.println(inputYear + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Please Enter Valid Year");
        }
        
        scanner.close();
    }
}