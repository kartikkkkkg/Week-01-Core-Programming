import java.util.Scanner;
public class NumberSignChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter num");
      int number = scanner.nextInt();
      if (number > 0) {
         System.out.println("Positive");
      } else if (number == 0) {
         System.out.println("Zero");
      } else {
         System.out.println("Negative");
      }
      scanner.close();
   }
}