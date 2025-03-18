import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            int result = inputNumber * multipliervär

            System.out.println(inputNumber + " * " + multiplier + " = " + result);
        }
        
        scanner.close();
    }
}