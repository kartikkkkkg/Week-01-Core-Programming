import java.util.Scanner;
public class SumUntilZero {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double total = 0.0;
      System.out.println("Enter Number (Enter 0 to stop)");
      while (true) {
         int number = scanner.nextInt();
         if (number == 0) {
            break;
         }
         total += number;
      }
      System.out.println("Total Sum: " + total);
      scanner.close();
   }
}