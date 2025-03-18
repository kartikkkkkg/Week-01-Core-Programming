import java.util.Scanner;
public class SumUntilZeroOrNegative {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double total = 0.0;
      System.out.println("enter number(enter 0 or any negative number to stop)");
      while (true) {
         int number = scanner.nextInt();
         if (number == 0 || number < 0) {
            break;
         }
         total += number;
      }
      System.out.println("Total Sum " + total);
      scanner.close();
   }
}