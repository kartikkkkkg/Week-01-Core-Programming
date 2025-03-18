import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        
        if (inputYear >= 1582) {
            if ((inputYear % 400 == 0) || (inputYear % 4 == 0 && inputYear % 100 != 0)) {
                System.out.println("It is a Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Please Enter Valid Year");
        }
        
        scanner.close();
    }
}